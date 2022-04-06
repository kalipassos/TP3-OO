package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Anfitriao;
import util.Scan;
import visualizacao.CadastrarAnfitriaoVisual;

public class CadastrarAnfitriaoControle {

  private final CadastrarAnfitriaoVisual visualizacao;

  public CadastrarAnfitriaoControle(CadastrarAnfitriaoVisual visualizacao) {
    super();
    this.visualizacao = visualizacao;
  }

  public void cadastroAnfitriao(JButton botaoSelecionado) {

    if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
      Anfitriao anfiParaCadastrar = criaAnfitriao();

      if (anfiParaCadastrar != null) {
        Dados.getAnfitriao().add(anfiParaCadastrar);
      }
    } else {
      visualizacao.getTextoNome().setText(null);
      visualizacao.getTextoEndereco().setText(null);
      visualizacao.getTextoTelefone().setText(null);
      visualizacao.getTextoCPF().setText(null);

    }
  }

  private Anfitriao criaAnfitriao() {
    Anfitriao anfitriao = new Anfitriao();
    String nome, endereco, telefone, CPF;

    nome = visualizacao.getTextoNome().getText();
    anfitriao.setNome(nome);

    CPF = visualizacao.getTextoCPF().getText();
    anfitriao.setCPF(CPF);

    endereco = visualizacao.getTextoEndereco().getText();
    anfitriao.setEndereco(endereco);

    telefone = visualizacao.getTextoTelefone().getText();
    anfitriao.setTelefone(telefone);

    return anfitriao;
  }

}
