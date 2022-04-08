package controles;

import javax.swing.JButton;

import visualizacao.CadastrarHospedagemVisual;

public class CadastrarHospedagemControle {
  private final CadastrarHospedagemVisual visualizacao;

  public CadastrarHospedagemControle(CadastrarHospedagemVisual visualizacao) {
    super();
    this.visualizacao = visualizacao;
  }

  public void cadastroHospedagem(JButton botaoSelecionado) {

    if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
      //
    } else {
      visualizacao.getTextoEntrada().setText(null);
      visualizacao.getTextoSaida().setText(null);
      visualizacao.getSelecionaAnfitriao().setToolTipText(null);
      visualizacao.getSelecionaAnimal().setToolTipText(null);

    }
  }
}
