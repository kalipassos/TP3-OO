package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Anfitriao;
import util.Scan;
import visualizacao.CadastrarAnfitriaoVisual;

public class CadastrarAnfitriaoControle {

  private final CadastrarAnfitriaoVisual visualizacao;

  public CadastrarAnfitriaoControle(CadastrarAnfitriaoVisual visualizacao) {
    this.visualizacao = visualizacao;
  }

  public void cadastroAnfitriao(JButton botaoSelecionado) {
    String nome, endereco, telefone, CPF;

    if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
      Anfitriao anfiParaCadastrar = criaAnfitriao();

      if (anfiParaCadastrar != null) {
        Dados.getAnfitriao().add(anfiParaCadastrar);
      }
    } else {
      visualizacao.getNome().setText(null);
      AnfitriaoVisual.getTextoEndereco().setText(null);
      AnfitriaoVisual.getTextoTelefone().setText(null);
      AnfitriaoVisual.getTextoCPF().setText(null);

    }
  }

  public Anfitriao editaAnfitriao() { // editar atributo de um anfitriao
  }

  public void deletaAnfitriao(JButton botaoSelecionado) {
    if (botaoSelecionado.equals(AnfitriaoVisual.getButtonConfirmar())) {
      Anfitriao anfiParaDelecao = deletaAnfitriao();

      if (anfiParaDelecao != AnfitriaoVisual.getAnfitriaoSelecionado()) {
        Dados.getAnfitriao().remove(anfiParaDelecao);
      }
    } else {
      CadastrarAnfitriaoVisual.getTextoNome().setText(null);
      AnfitriaoVisual.getTextoEndereco().setText(null);
    }
  }

  private Anfitriao criaAnfitriao() {
    Anfitriao anfitriao = new Anfitriao();
    String nome, endereco, telefone, CPF;

    nome = anfitriao.getNome().getText();
    anfitriao.setNome(nome);

    CPF = anfitriao.getCPF().getText();
    anfitriao.setCPF(CPF);

    endereco = anfitriao.getEndereco().getText();
    anfitriao.setEndereco(endereco);

    telefone = AnfitriaoVisual.getTextFieldTelefone().getText();
    anfitriao.setTelefone(telefone);

    return anfitriao;
  }

}
