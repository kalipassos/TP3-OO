package controles;

import javax.swing.DefaultComboBoxModel;

import data.Dados;
import modelos.Dono;
import visualizacao.VisualizaAnimalVisual;

public class VisualizaAnimalControle {

	private final VisualizaAnimalVisual visualizacao;

	public VisualizaAnimalControle(VisualizaAnimalVisual visualizacao) {
		super();
		this.visualizacao = visualizacao;
	}

	public DefaultComboBoxModel<String> getDono(String nomeDono) {
		Dono donoEscolhido = null;

		for (Dono dono : Dados.getDono()) {
			if (dono.getNome().equals(nomeDono)) {
				donoEscolhido = dono;
			}
		}
		if (donoEscolhido == null) {
			return null;
		}

		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
		for (int i = 0; i < donoEscolhido.getAnimais().size(); i++) {
			modelo.addElement(donoEscolhido.getAnimais().get(i).getNome());
		}
		return modelo;
	}

	public void executarBotao(Object source) {

	}

}
