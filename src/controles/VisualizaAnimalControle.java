package controles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import data.Dados;
import modelos.Animal;
import modelos.Dono;
import visualizacao.AnimalVisual;
import visualizacao.DeletaAnimalVisual;
import visualizacao.EditarAnimalVisual;
import visualizacao.VisualizaAnimalVisual;

public class VisualizaAnimalControle {

	private final VisualizaAnimalVisual visualizacao;

	public VisualizaAnimalControle(VisualizaAnimalVisual visualizacao) {
		super();
		this.visualizacao = visualizacao;
	}

	public DefaultComboBoxModel<String> getAnimais(String nomeDono) {
		Dono donoEscolhido = null;

		for (Dono dono : Dados.getDonos()) {
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

	public void mostrarAnimal() {
		visualizacao.getSelecionaPet()
				.setModel(getAnimais(visualizacao.getSelecionaDono().getSelectedItem().toString()));
	}

	public DefaultComboBoxModel<String> getDono() {
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
		for (Dono dono : Dados.getDonos()) {
			modelo.addElement(dono.getNome());
		}
		return modelo;
	}

	public void executarBotao(Object source) {
		if (source == visualizacao.getSelecionaDono()) {
			mostrarAnimal();
		} else if (source == visualizacao.getSelecionaPet()) {
			Animal animal = getAnimalObj(visualizacao.getSelecionaPet().getSelectedIndex());
			populateAnimaisInfo(animal);
		} else if (source == visualizacao.getBotaoReiniciar()) {
			new VisualizaAnimalVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoEditar()) {
			new EditarAnimalVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoDeletar()) {
			new DeletaAnimalVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoVoltar()) {
			new AnimalVisual().setVisible(true);
			visualizacao.dispose();
		}
	}

	private void populateAnimaisInfo(Animal animal) {
		setField(visualizacao.getTextoNome(), animal.getNome());
		setField(visualizacao.getTextoPorte(), animal.getPorte());
		setField(visualizacao.getTextoSexo(), animal.getSexo());
		setField(visualizacao.getTextoIdade(), animal.getIdade() + "");
		setField(visualizacao.getTextoEspecie(), animal.getEspecie());
		setField(visualizacao.getTextoCuidados(), animal.getCuidados());
	}

	public Animal getAnimalObj(int index) {
		Dono dono = Dados.getDonos().get(visualizacao.getSelecionaDono().getSelectedIndex());
		return dono.getAnimais().get(index);
	}

	public void setField(JTextComponent field, String parametro) {
		field.setText(parametro);
	}

}
