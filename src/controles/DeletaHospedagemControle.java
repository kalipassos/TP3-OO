package controles;

import javax.swing.DefaultComboBoxModel;

import data.Dados;
import modelos.Hospedagem;
import visualizacao.DeletaHospedagemVisual;

public class DeletaHospedagemControle {

	private final DeletaHospedagemVisual visualizacao;

	public DeletaHospedagemControle(DeletaHospedagemVisual visualizacao) {
		super();
		this.visualizacao = visualizacao;
	}

	public DefaultComboBoxModel<String> getHospedagem(String nomeHospedagem) {
		Hospedagem hospedagemEscolhida = null;

		for (Hospedagem hospedagem : Dados.getHospedagem()) {
			if (hospedagem.getNome().equals(nomeHospedagem)) {
				hospedagemEscolhida = hospedagem;
			}
		}
	}
}
