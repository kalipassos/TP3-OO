package controles;

import javax.swing.DefaultComboBoxModel;

import data.Dados;
import modelos.Anfitriao;
import visualizacao.DeletaHospedagemVisual;
import visualizacao.HospedagemVisual;

public class DeletaHospedagemControle {

	private final DeletaHospedagemVisual visualizacao;

	public DeletaHospedagemControle(DeletaHospedagemVisual visualizacao) {
		super();
		this.visualizacao = visualizacao;
	}

	public DefaultComboBoxModel<String> getHospedagem(String nomeAnfitriao) {
		Anfitriao anfitriaoEscolhido = null;

		for (Anfitriao anfitriao : Dados.getAnfitrioes()) {
			if (anfitriao.getNome().equals(nomeAnfitriao)) {
				anfitriaoEscolhido = anfitriao;
			}
		}

		if (anfitriaoEscolhido == null) {
			return null;
		}

		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
		for (int i = 0; i < anfitriaoEscolhido.getHospedagens().size(); i++) {
			modelo.addElement(anfitriaoEscolhido.getHospedagens().get(i).getDataEntrada());
		}
		return modelo;
	}

	public void atualizarListaHospedagem() {
		visualizacao.getSelecionaHospedagem()
				.setModel(getHospedagem(visualizacao.getSelecionaAnfitriao().getSelectedItem().toString()));
	}

	public DefaultComboBoxModel<String> getAnfitriao() {
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
		for (Anfitriao anfitriao : Dados.getAnfitrioes()) {
			modelo.addElement(anfitriao.getNome());
		}
		return modelo;
	}

	public void executarBotao(Object source) {
		if (source == visualizacao.getSelecionaAnfitriao()) {
			atualizarListaHospedagem();
		} else if (source == visualizacao.getBotaoSim()) {
			deletarHospedagem(visualizacao.getSelecionaHospedagem().getSelectedIndex(),
					visualizacao.getSelecionaAnfitriao().getSelectedIndex());
		} else if (source == visualizacao.getBotaoNao()) {
			new HospedagemVisual().setVisible(true);
			visualizacao.dispose();
		}

	}

	private void deletarHospedagem(int hospedagemSelecionado, int anfitriaoSelecionado) {
		Anfitriao anfitriaoEscolhido = Dados.getAnfitrioes().get(anfitriaoSelecionado);
		anfitriaoEscolhido.getHospedagens().remove(hospedagemSelecionado);
		atualizarListaHospedagem();
	}
}
