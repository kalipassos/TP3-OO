package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Anfitriao;
import util.Scan;
import visualizacao.VisualAnfitriao;

public class AnfitriaoControle {

  private final Anfitriao visualizacao;
  private final Dados dados;

  public AnfitriaoControle(Anfitriao visualizacao, Dados dados) {
    this.visualizacao = visualizacao;
    this.dados = dados;
  }

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
