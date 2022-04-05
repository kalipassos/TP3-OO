package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Anfitriao;
import util.Scan;
import visualizacao.VisualAnfitriao;

public class AnfitriaoControle {

  public void cadastroAnfitriao(JButton botaoSelecionado) {
    String nome, endereco, telefone, CPF;

    if (botaoSelecionado.equals(VisualAnfitriao.getButtonConfirmar())) {
      Anfitriao anfiParaCadastrar = criaAnfitriao();

      if (anfiParaCadastrar != null) {
        Dados.getAnfitriao().add(anfiParaCadastrar);
      }
    } else {
      VisualAnfitriao.getTextFieldNome().setText(null);
      VisualAnfitriao.getTextFieldEndereco().setText(null);
      VisualAnfitriao.getTextFieldTelefone().setText(null);
      VisualAnfitriao.getTextFieldCPF().setText(null);

    }
  }

  public Anfitriao editaAnfitriao() { // editar atributo de um anfitriao
    String nome, endereco, telefone, CPF;
    System.out.println("Digite o nome do Anfitriao que deseja editar:");
    var anf1 = Scan.nextLine();
    for (Anfitriao anfitriao : Dados.getAnfitriao()) {
      if (anfitriao.getNome().equals(anf1)) {
        System.out.println(anfitriao);
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
          anfitriao.setNome(nome);
          System.out.println("Nome editado para " + anfitriao.getNome());
        } else if (edit == 2) {
          System.out.println("Digite o novo endereco:");
          endereco = Scan.nextLine();
          anfitriao.setEndereco(endereco);
          System.out.println("Endereco editado para " + anfitriao.getEndereco());
        } else if (edit == 3) {
          System.out.println("Digite o novo telefone:");
          telefone = Scan.nextLine();
          anfitriao.setTelefone(telefone);
          System.out.println("Telefone editado para " + anfitriao.getTelefone());
        } else if (edit == 4) {
          System.out.println("Digite o novo CPF:");
          CPF = Scan.nextLine();
          anfitriao.setCPF(CPF);
          System.out.println("CPF editado para " + anfitriao.getCPF());
        } else if (anf1 != anfitriao.getNome()) {
          System.out.println("Anfitriao nao encontrado");
        }

      }
    }
    return null;
  }

  public void deletaAnfitriao(JButton botaoSelecionado) {
    if (botaoSelecionado.equals(VisualAnfitriao.getButtonConfirmar())) {
      Anfitriao anfiParaDelecao = deletaAnfitriao();

      if (anfiParaDelecao != VisualAnfitriao.getAnfitriaoSelecionado()) {
        Dados.getAnfitriao().remove(anfiParaDelecao);
      }
    } else {
      view.getTextFieldNome().setText(null);
      view.getTextFieldIdade().setText(null);
    }
  }

  private Anfitriao criaAnfitriao() {
    Anfitriao anfitriao = new Anfitriao();
    String nome, endereco, telefone, CPF;

    nome = VisualAnfitriao.getTextFieldNome().getText();
    anfitriao.setNome(nome);

    cpf = VisualAnfitriao.getTextFieldCPF().getText();
    anfitriao.setCPF(cpf);

    endereco = VisualAnfitriao.getTextFieldEndereco().getText();
    anfitriao.setEndereco(endereco);

    telefone = VisualAnfitriao.getTextFieldTelefone().getText();
    anfitriao.setTelefone(telefone);

    return anfitriao;
  }

  public void listaAnfitriao(JButton botaoSelecionados) { // listar os anfitrioes cadastrados
    for (Anfitriao anfitriao : Dados.getAnfitriao()) {

      System.out.println(anfitriao);
    }
  }

  public Anfitriao visualizaAnfitriaoCpf() { // metodo para visualizar um dono pelo CPF
    String buscaCPF;
    System.out.println("Digite o CPF no modelo xxx.xxx.xxx-xx:");
    buscaCPF = Scan.nextLine();

    for (Anfitriao anfitriao : Dados.getAnfitriao()) {
      if (anfitriao.getCPF().equals(buscaCPF)) {
        System.out.println(anfitriao);
        return anfitriao; // retorna o dono encontrado
      }
    }
    System.out.println("CPF nao cadastrado.");
    return null; // retorna null caso nao encontre o CPF
  }

}
