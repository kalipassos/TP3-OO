package controles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import data.Dados;
import modelos.Anfitriao;
import visualizacao.AnfitriaoVisual;
import visualizacao.DeletaAnfitriaoVisual;
import visualizacao.EditarAnfitriaoVisual;
import visualizacao.VisualizaAnfitriaoVisual;

public class VisualizaAnfitriaoControle {
	private final VisualizaAnfitriaoVisual visualizacao;

	public VisualizaAnfitriaoControle(VisualizaAnfitriaoVisual visualizacao) {
		super();
		this.visualizacao = visualizacao;
	}

	// coloca os anfitrioes na combobox
	public DefaultComboBoxModel<String> getAnfitriao(String nomeAnfitriao) {
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

	public void mostraHospedagem() {
		visualizacao.getMostraHospedagens()
				.setModel(getAnfitriao(visualizacao.getSelecionaAnfitriao().getSelectedItem().toString()));
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
			setField(visualizacao.getTextoNome(),
					getAnfitriaoObj(visualizacao.getSelecionaAnfitriao().getSelectedIndex()).getNome());
			setField(visualizacao.getTextoEndereco(),
					getAnfitriaoObj(visualizacao.getSelecionaAnfitriao().getSelectedIndex()).getEndereco());
			setField(visualizacao.getTextoTelefone(),
					getAnfitriaoObj(visualizacao.getSelecionaAnfitriao().getSelectedIndex()).getTelefone());
			setField(visualizacao.getTextoCPF(),
					getAnfitriaoObj(visualizacao.getSelecionaAnfitriao().getSelectedIndex()).getCPF());
			mostraHospedagem();

		} else if (source == visualizacao.getBotaoReinicia()) {
			new VisualizaAnfitriaoVisual().setVisible(true);
			;
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoEdita()) {
			new EditarAnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoDeleta()) {
			new DeletaAnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoVolta()) {
			new AnfitriaoVisual().setVisible(true);
			visualizacao.dispose();
		}
	}

	public static Anfitriao getAnfitriaoObj(int index) {
		return Dados.getAnfitrioes().get(index);
	}

	public static void setField(JTextField field, String parametro) {
		field.setText(parametro);

	}

}
