package controles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import data.Dados;
import modelos.Hospedagem;
import visualizacao.CadastrarHospedagemVisual;

public class CadastrarHospedagemControle {
  private final CadastrarHospedagemVisual visualizacao;

  public CadastrarHospedagemControle(CadastrarHospedagemVisual visualizacao) {
    super();
    this.visualizacao = visualizacao;
  }

  public void cadastroHospedagem(JButton botaoSelecionado) {

    if (botaoSelecionado.equals(visualizacao.getBotaoCadastrar())) {
      Hospedagem ParaCadastrar = criaHospedagem();

      if (ParaCadastrar != null) {
        Dados.getAnfitriao().getHospedagem().add(ParaCadastrar);
      }
    } else {
      visualizacao.getTextoEntrada().setText(null);
      visualizacao.getTextoSaida().setText(null);
      visualizacao.getSelecionaAnfitriao().setToolTipText(null);
      visualizacao.getSelecionaAnimal().setToolTipText(null);

    }
  }

  private Hospedagem criaHospedagem() {
    Hospedagem hospedagem = new Hospedagem();
    String entrada, saida, anfitriao, animal;

    entrada = visualizacao.getTextoEntrada().getText();
    hospedagem.getDataEntrada().setText(entrada);

    saida = visualizacao.getTextoSaida().getText();
    hospedagem.getDataSaida().setText(saida);

    anfitriao = visualizacao.getSelecionaAnfitriao().getToolTipText();
    animal = visualizacao.getSelecionaAnimal().getToolTipText();

    return Hospedagem;
  }

}
