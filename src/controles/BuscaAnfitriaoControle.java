package controles;

import javax.swing.JButton;
import javax.swing.JTextField;

import data.Dados;
import modelos.Anfitriao;
import visualizacao.AnfitriaoVisual;
import visualizacao.BuscaAnfitriaoVisual;
import visualizacao.CadastrarAnfitriaoVisual;
import visualizacao.DeletaAnfitriaoVisual;
import visualizacao.EditarAnfitriaoVisual;
import visualizacao.VisualizaAnfitriaoVisual;

public class BuscaAnfitriaoControle {
	private final BuscaAnfitriaoVisual visualizacao;

	public BuscaAnfitriaoControle(BuscaAnfitriaoVisual visualizacao) {
		super();
		this.visualizacao = visualizacao;
	}

	public Anfitriao buscador(JButton botaoSelecionado) {
		for (Anfitriao anft : Dados.getAnfitriao()) {
			if (anft.getNome().equalsIgnoreCase(visualizacao.getTextoNomeAnfitriao().getText())) {
				return anft;
			}
		}
		return null;

	}

	public void executarBotao(Object source) {
		if (source == visualizacao.getBotaoBuscarAnfitriao()) {

			if (buscador(visualizacao.getBotaoBuscarAnfitriao()) != null) {
				setField(visualizacao.getTextoEncontrado());
				// visualizacao.getRotuloEncontrado().setVisible(true);
				// visualizacao.getRotuloProximaAcao().setVisible(true);
				// visualizacao.getBotaoVisualizarAnfitriao().setVisible(true);
				// visualizacao.getBotaoEditarAnfitriao().setVisible(true);
				// visualizacao.getBotaoDeletarAnfitriao().setVisible(true);
				// visualizacao.getBotaoVoltar().setVisible(true);

			} else {
				visualizacao.getRotuloNaoEncontrado().setVisible(true);
				visualizacao.getBotaoSim().setVisible(true);
				visualizacao.getBotaoNao().setVisible(true);
			}
		} else if (source == visualizacao.getBotaoSim()) {
			new CadastrarAnfitriaoVisual();
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoNao()) {
			new AnfitriaoVisual();
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoVisualizarAnfitriao()) {
			new VisualizaAnfitriaoVisual();
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoEditarAnfitriao()) {
			new EditarAnfitriaoVisual();
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoDeletarAnfitriao()) {
			new DeletaAnfitriaoVisual();
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoVoltar()) {
			new AnfitriaoVisual();
			visualizacao.dispose();
		}
	}

	public static Anfitriao getAnfitriaoObj(int index) {
		return Dados.getAnfitriao().get(index);
	}

	public static void setField(JTextField field) {
		field.setText(parametro);

	}
}
