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

	public DefaultComboBoxModel<String> getAnfitriao(String nomeAnfitriao) {
		Anfitriao anfitriaoEscolhido = null;

		for (Anfitriao anfitriao : Dados.getAnfitriao()) {
			if (anfitriao.getNome().equals(nomeAnfitriao)) {
				anfitriaoEscolhido = anfitriao;
			}
		}
		if (anfitriaoEscolhido == null) {
			return null;
		}

		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
		for (int i = 0; i < anfitriaoEscolhido.size(); i++) {
			modelo.addElement(anfitriaoEscolhido.get(i).getNome());
		}
		return modelo;
	}

	public void atualizarListaAnfitriao() {
		visualizacao.getSelecionaAnfitriao().setModel(getAnfitriao());
	}

	public DefaultComboBoxModel<String> getAnfitriao() {
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
		for (Anfitriao anfitriao : Dados.getAnfitriao()) {
			modelo.addElement(anfitriao.getNome());
		}
		return modelo;
	}

	public void executarBotao(Object source) {
		if (source == visualizacao.getSelecionaAnfitriao()) {
			// atualizarListaHospedagem()
			atualizarListaAnfitriao();
		} else if (source == visualizacao.getBotaoSim()) {
			deletarAnfitriao(visualizacao.getSelecionaAnfitriao().getSelectedIndex());
		} else if (source == visualizacao.getBotaoNao()) {
			new AnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		}
	}

	private void deletarAnfitriao(int anfitriaoSelecionado) {
		Dados.getDono().remove(anfitriaoSelecionado);
	}

}
