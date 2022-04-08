package controles;

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

	public void executarBotao(Object source) {
		if (source == visualizacao.getBotaoBuscarAnfitriao()) {
			executeBuscaAfitriaoPeloNome(visualizacao.getTextoNomeAnfitriao().getText());
		} else if (source == visualizacao.getBotaoSim()) {
			new CadastrarAnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoNao()) {
			new AnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoVisualizarAnfitriao()) {
			new VisualizaAnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoEditarAnfitriao()) {
			new EditarAnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoDeletarAnfitriao()) {
			new DeletaAnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoVoltar()) {
			new AnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		}
	}

	private void executeBuscaAfitriaoPeloNome(String nome) {
		Anfitriao achado = Dados.getAnfitriaoPeloNome(nome);

		if (achado != null) {
			visualizacao.getTextoEncontrado().setText(achado.getNome());
			visualizacao.getRotuloEncontrado().setVisible(true);
			visualizacao.getRotuloProximaAcao().setVisible(true);
			visualizacao.getBotaoVisualizarAnfitriao().setVisible(true);
			visualizacao.getBotaoEditarAnfitriao().setVisible(true);
			visualizacao.getBotaoDeletarAnfitriao().setVisible(true);
			visualizacao.getBotaoVoltar().setVisible(true);
			visualizacao.getTextoEncontrado().setVisible(true);

			visualizacao.getRotuloNaoEncontrado().setVisible(false);
			visualizacao.getBotaoSim().setVisible(false);
			visualizacao.getBotaoNao().setVisible(false);
		} else {
			visualizacao.getRotuloNaoEncontrado().setVisible(true);
			visualizacao.getBotaoSim().setVisible(true);
			visualizacao.getBotaoNao().setVisible(true);

			visualizacao.getRotuloEncontrado().setVisible(false);
			visualizacao.getRotuloProximaAcao().setVisible(false);
			visualizacao.getBotaoVisualizarAnfitriao().setVisible(false);
			visualizacao.getBotaoEditarAnfitriao().setVisible(false);
			visualizacao.getBotaoDeletarAnfitriao().setVisible(false);
			visualizacao.getBotaoVoltar().setVisible(false);
		}
	}
}
