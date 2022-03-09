package controles;

import data.Dados;
import modelos.Animal;
import modelos.Dono;
import util.Scan;

public class DonoControle { // classe destinada ao controle dos CRUDs do Dono

  public void cadastrarDono() {
    String nome, endereco, telefone, CPF;

    System.out.println("Nome:");
    nome = Scan.nextLine();

    System.out.println("Endereco:");
    endereco = Scan.nextLine();

    System.out.println("Telefone:");
    telefone = Scan.nextLine();

    System.out.println("CPF:");
    CPF = Scan.nextLine();

    System.out.println("Cadastre seu animal agora! \n Nome do Animal:");
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

  }

  public Dono visualizarDonoNome() {
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

  public Dono visualizarDonoCpf() {
    String buscarCPF;
    System.out.println("Digite o CPF no modelo xxx.xxx.xxx-xx:");
    buscarCPF = Scan.nextLine();

    for (Dono dono : Dados.getDono()) {
      if (dono.getCPF().equals(buscarCPF)) {
        System.out.println(dono);
        return dono;
      }
    }
    System.out.println("CPF nao cadastrado.");
    return null;
  }

  public Dono editarDono() {
    String nome, endereco, telefone, CPF;

    System.out.println("Nome do Dono que deseja editar:");
    var dono1 = Scan.nextLine();
    for (Dono dono : Dados.getDono()) {
      if (dono.getNome().equals(dono1)) {
        System.out.println(dono);
        System.out.println("O que deseja editar no dono?");
        System.out.println("1 - Nome");
        System.out.println("2 - Endereco");
        System.out.println("3 - Telefone");
        System.out.println("4 - CPF");
        var edit = Scan.nextInt();

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
  /*
   * public Dono deletarInformacaoDono(){
   * 
   * }
   */
}
