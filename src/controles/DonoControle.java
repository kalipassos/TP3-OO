package controles;

import javax.swing.JButton;

import data.Dados;
import modelos.Animal;
import modelos.Dono;
import util.Scan;
import visualizacao.CadastrarDonoVisual;
import visualizacao.DonoVisual;

public class DonoControle { // classe destinada ao controle dos CRUDs do Dono
  private final DonoVisual visualizacao;

  public DonoControle(DonoVisual visualizacao) {
    this.visualizacao = visualizacao;
  }

  public void executaBotao(JButton botaoSelecionado) {
    if (botaoSelecionado.equals(visualizacao.getBotaoCadastrarDono())) {
      new CadastrarDonoVisual().setVisible(true);
      visualizacao.dispose();
    } else if (botaoSelecionado.equals(visualizacao.getBotaoBuscarDono())) {
      new CadastrarDonoVisual().setVisible(true);
      visualizacao.dispose();
    } else if (botaoSelecionado.equals(visualizacao.getBotaoVisualizarDono())) {
      new CadastrarDonoVisual().setVisible(true);
      visualizacao.dispose();
    } else if (botaoSelecionado.equals(visualizacao.getBotaoEditarDono())) {
      new CadastrarDonoVisual().setVisible(true);
    } else if (botaoSelecionado.equals(visualizacao.getBotaoVoltar())) {
      visualizacao.dispose();
    }
  }

}