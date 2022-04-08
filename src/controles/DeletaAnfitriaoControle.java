package controles;

import javax.swing.DefaultComboBoxModel;

import data.Dados;
import modelos.Anfitriao;
import visualizacao.AnfitriaoVisual;
import visualizacao.DeletaAnfitriaoVisual;

public class DeletaAnfitriaoControle {
	private final DeletaAnfitriaoVisual visualizacao;

	public DeletaAnfitriaoControle(DeletaAnfitriaoVisual visualizacao) {
		super();
		this.visualizacao = visualizacao;
	}

	public DefaultComboBoxModel<String> getAnfitrioes() {
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();

		for (Anfitriao anfitriao : Dados.getAnfitrioes()) {
			modelo.addElement(anfitriao.getNome());
		}

		return modelo;
	}

	public void executarBotao(Object source) {
		if (source == visualizacao.getBotaoSim()) {
			Dados.getAnfitrioes().remove(visualizacao.getSelecionaAnfitriao().getSelectedIndex());
		} else if (source == visualizacao.getBotaoNao()) {
			new AnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		}
	}
}
