package controles;

import data.Dados;
import modelos.Animal;
import modelos.Dono;
import util.Scan;

public class DonoControle { // classe destinada ao controle dos CRUDs do Dono

  public void cadastroDono() {
    String nome, endereco, telefone, CPF;

    System.out.println("Nome:");
    nome = Scan.nextLine();

    System.out.println("Endereco:");
    endereco = Scan.nextLine();

    System.out.println("Telefone:");
    telefone = Scan.nextLine();

    System.out.println("CPF:");
    CPF = Scan.nextLine();

    System.out.println("Agora, sera realizado o cadastro do seu animal. Caso queira pular este passo, digite 'p'");
    String resposta = Scan.nextLine();

    if (resposta.equals("p")) {

      Dono dono = new Dono(nome, endereco, telefone, CPF);
      Dados.getDono().add(dono); // adicao do dono na lista de donos, sem um animal cadastrado
      System.out.println("Dono cadastrado com sucesso!");
    } else {

      System.out.println(" Nome do Animal:");
      String nomeAnimal = Scan.nextLine();

      System.out.println("Especie do Animal:");
      String especieAnimal = Scan.nextLine();

      System.out.println("Biografia do Animal:");
      String biografiaAnimal = Scan.nextLine();

      System.out.println("Porte do Animal:");
      String porteAnimal = Scan.nextLine();

      System.out.println("Idade do Animal:");
      int idadeAnimal = Scan.nextInt();

      System.out.println("Sexo do Animal:");
      String sexoAnimal = Scan.nextLine();

      System.out.println("Cuidados do Animal:");
      String cuidadosAnimal = Scan.nextLine();

      Dono dono = new Dono(nome, endereco, telefone, CPF);
      dono.getAnimais()
          .add(new Animal(nomeAnimal, especieAnimal, biografiaAnimal, porteAnimal, idadeAnimal, sexoAnimal,
              cuidadosAnimal)); // adicao do animal cadastrando na lista do dono referente
      Dados.getDono().add(dono); // adicao do dono na lista de donos
      dono.getAnimais().add(new Animal(nomeAnimal, especieAnimal, biografiaAnimal, porteAnimal, idadeAnimal,
          sexoAnimal, cuidadosAnimal)); // adicao do animal na lista de animais
      System.out.println("Dono e animal cadastrados com sucesso!");

    }
  }

  public void buscaDonoAnimal() {
    System.out.println("Digite o nome do Dono que quer buscar");
    var nomeDono = Scan.nextLine();

    for (Dono dono : Dados.getDono()) {
      if (dono.getNome().equals(nomeDono)) {
        System.out.println(dono + " tem em seu cadastro: " + dono.getAnimais());

      } else {
        System.out.println("Não encontramos o dono " + nomeDono);
      }
    }
  }

  public Dono visualizaDonoNome() { // metodo para visualizar um dono pelo nome
    String nomePesquisado;
    System.out.println("Nome a ser pesquisado:");
    nomePesquisado = Scan.nextLine();

    for (Dono dono : Dados.getDono()) {
      if (dono.getNome().equals(nomePesquisado)) {
        System.out.println(dono);
        return dono;
      }
    }
    System.out.println("Nome não encontrado");
    return null;
  }

  public Dono visualizaDonoCpf() { // metodo para visualizar um dono pelo CPF
    String buscarCPF;
    System.out.println("Digite o CPF no modelo xxx.xxx.xxx-xx:");
    buscarCPF = Scan.nextLine();

    for (Dono dono : Dados.getDono()) {
      if (dono.getCPF().equals(buscarCPF)) {
        System.out.println(dono);
        return dono; // retorna o dono encontrado
      }
    }
    System.out.println("CPF nao cadastrado.");
    return null; // retorna null caso nao encontre o CPF
  }

  public Dono editaDono() { // metodo para editar um dono
    String nome, endereco, telefone, CPF;

    System.out.println("Nome do Dono que deseja editar:");
    var dono1 = Scan.nextLine();
    for (Dono dono : Dados.getDono()) {
      if (dono.getNome() != dono1) {
        System.out.println("Dono nao encontrado");
        return null;
      }

      if (dono.getNome().equals(dono1)) {
        System.out.println(dono);
        System.out.println("O que deseja editar no dono?");
        System.out.println("1 - Nome");
        System.out.println("2 - Endereco");
        System.out.println("3 - Telefone");
        System.out.println("4 - CPF");
        var edit = Scan.nextInt();

        // estrutura if-else para editar o atributo escolhido pelo usuario
        if (edit == 1) {
          System.out.println("Digite o novo nome:");
          nome = Scan.nextLine();
          dono.setNome(nome);
          System.out.println("Nome editado para " + dono.getNome());
        } else if (edit == 2) {
          System.out.println("Digite o novo endereco:");
          endereco = Scan.nextLine();
          dono.setEndereco(endereco);
          System.out.println("Endereco editado para " + dono.getEndereco());
        } else if (edit == 3) {
          System.out.println("Digite o novo telefone:");
          telefone = Scan.nextLine();
          dono.setTelefone(telefone);
          System.out.println("Telefone editado para " + dono.getTelefone());
        } else if (edit == 4) {
          System.out.println("Digite o novo CPF:");
          CPF = Scan.nextLine();
          dono.setCPF(CPF);
          System.out.println("CPF editado para " + dono.getCPF());
        }
      }
      return dono;
    }

    return null;

  }

  public Dono deletaDono() { // metodo para deletar um dono
    String nome;
    System.out.println("Nome do dono que deseja deletar:");
    nome = Scan.nextLine();

    for (Dono dono : Dados.getDono()) {
      if (dono.getNome().equals(nome)) {
        if (dono.getAnimais().size() > 0) { // verifica se o dono possui animais cadastrados
          System.out.println("O dono possui animais cadastrados, nao pode ser deletado.");
          return null;
        } else if (dono.getAnimais().size() == 0) { // caso nao possua animais cadastrados, o dono é deletado
          Dados.getDono().remove(dono);
          System.out.println("Dono deletado com sucesso.");
          return dono;
        } else if (dono.getNome() != nome) { // caso o dono nao seja encontrado
          System.out.println("Dono nao encontrado.");
          return null;
        }
      }
    }
    return null;
  }

  public Dono editaAnimalDono() {
    String nomeDono, nomeAnimal;
    System.out.println("Nome do dono que deseja editar:");
    nomeDono = Scan.nextLine();
    System.out.println("Nome do animal que deseja editar:");
    nomeAnimal = Scan.nextLine();

    for (Dono dono : Dados.getDono()) {
      if (dono.getNome().equals(nomeDono)) {
        for (Animal animal : dono.getAnimais()) {
          if (animal.getNome().equals(nomeAnimal)) {
            System.out.println(animal);
            System.out.println("O que deseja editar no animal?");
            System.out.println("1 - Biografia");
            System.out.println("2 - Porte");
            System.out.println("3 - Idade");
            System.out.println("4 - Cuidados");
            var edit = Scan.nextInt();

            // estrutura if-else para editar o atributo escolhido pelo usuario
            if (edit == 1) {
              System.out.println("Digite a nova biografia:");
              var biografiaAnimal = Scan.nextLine();
              animal.setBiografia(biografiaAnimal);
              System.out.println("Especie editada para " + animal.getBiografia());
            } else if (edit == 2) {
              System.out.println("Digite o novo porte:");
              var porteAnimal = Scan.nextLine();
              animal.setPorte(porteAnimal);
              System.out.println("Especie editada para " + animal.getPorte());
            } else if (edit == 3) {
              System.out.println("Digite os novos cuidados:");
              var cuidadosAnimal = Scan.nextLine();
              animal.setCuidados(cuidadosAnimal);
              System.out.println("Especie editada para " + animal.getCuidados());
            } else if (edit == 4) {
              System.out.println("Digite a nova idade:");
              var idadeAnimal = Scan.nextInt();
              animal.setIdade(idadeAnimal);
              System.out.println("Especie editada para " + animal.getIdade());
            }
          }
        }
      }
    }
    return null;
  }

  public Dono deletaAnimalDono() {
    String nomeDono, nomeAnimal;
    System.out.println("Nome do dono que deseja deletar:");
    nomeDono = Scan.nextLine();
    System.out.println("Nome do animal que deseja deletar:");
    nomeAnimal = Scan.nextLine();

    for (Dono dono : Dados.getDono()) {
      if (dono.getNome().equals(nomeDono)) {
        for (Animal animal : dono.getAnimais()) {
          if (animal.getNome().equals(nomeAnimal)) {
            dono.getAnimais().remove(animal);
            System.out.println("Animal deletado com sucesso.");
            return dono;
          }
        }
      }
    }
    return null;
  }

}