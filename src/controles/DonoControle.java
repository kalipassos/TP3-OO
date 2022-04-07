package controles;

import javax.swing.JButton;

import visualizacao.BuscaDonoVisual;
import visualizacao.CadastrarDonoVisual;
import visualizacao.DeletaDonoVisual;
import visualizacao.DonoVisual;
import visualizacao.EditarDonoVisual;
import visualizacao.MenuVisual;
import visualizacao.VisualizaDonoVisual;

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
			new BuscaDonoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (botaoSelecionado.equals(visualizacao.getBotaoVisualizarDono())) {
			new VisualizaDonoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (botaoSelecionado.equals(visualizacao.getBotaoEditarDono())) {
			new EditarDonoVisual().setVisible(true);
		} else if (botaoSelecionado.equals(visualizacao.getBotaoDeletarDono())) {
			new DeletaDonoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (botaoSelecionado.equals(visualizacao.getBotaoVoltar())) {
			new MenuVisual().setVisible(true);
			visualizacao.dispose();
		}
	}

}