package controles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import data.Dados;
import modelos.Dono;
import visualizacao.DeletaDonoVisual;
import visualizacao.DonoVisual;
import visualizacao.EditarDonoVisual;
import visualizacao.VisualizaDonoVisual;

public class VisualizaDonoControle {
	private final VisualizaDonoVisual visualizacao;

	public VisualizaDonoControle(VisualizaDonoVisual visualizacao) {
		super();
		this.visualizacao = visualizacao;
	}

	public DefaultComboBoxModel<String> getDono(String nomeDono) {
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
		visualizacao.getVerPet().setModel(getDono(visualizacao.getEscolhaDono().getSelectedItem().toString()));
	}

	public DefaultComboBoxModel<String> getDono() {
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>();
		for (Dono dono : Dados.getDonos()) {
			modelo.addElement(dono.getNome());
		}
		return modelo;
	}

	public void executarBotao(Object source) {
		if (source == visualizacao.getEscolhaDono()) {
			setField(visualizacao.getTextoNome(),
					getDonoObj(visualizacao.getEscolhaDono().getSelectedIndex()).getNome());
			setField(visualizacao.getTextoEndereco(),
					getDonoObj(visualizacao.getEscolhaDono().getSelectedIndex()).getEndereco());
			setField(visualizacao.getTextoTelefone(),
					getDonoObj(visualizacao.getEscolhaDono().getSelectedIndex()).getTelefone());
			setField(visualizacao.getTextoCPF(), getDonoObj(visualizacao.getEscolhaDono().getSelectedIndex()).getCPF());
			mostrarAnimal();
		} else if (source == visualizacao.getBotaoReiniciar()) {
			new VisualizaDonoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoEditar()) {
			new EditarDonoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoDeletar()) {
			new DeletaDonoVisual().setVisible(true);
			visualizacao.dispose();
		} else if (source == visualizacao.getBotaoVoltar()) {
			new DonoVisual().setVisible(true);
			visualizacao.dispose();
		}
	}

	public static Dono getDonoObj(int index) {
		return Dados.getDonos().get(index);
	}

	public static void setField(JTextField field, String parametro) {
		field.setText(parametro);
	}

}
