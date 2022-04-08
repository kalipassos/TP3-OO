package modelos;

import java.util.ArrayList;

/**
 * Classe Anfitriao que herda os atributos da classe abstrata Pessoa.
 */
public class Anfitriao extends Pessoa {
	private final ArrayList<Hospedagem> hospedagens;

	/**
	 * construtor da classe Anfitriao que recebe os atributos da classe abstrata
	 * Pessoa.
	 */
	public Anfitriao() {
		super();
		this.hospedagens = new ArrayList<>();
	}

	public Anfitriao(String nome, String endereco, String telefone, String CPF) {
		super(nome, endereco, telefone, CPF);
		this.hospedagens = new ArrayList<>();
	}

	/**
	 * ArrayList que recebe as hospedagens
	 * 
	 * @return
	 */
	public ArrayList<Hospedagem> getHospedagens() {
		return hospedagens;
	}

	public Hospedagem getHospedagemPorDataEntrada(String dataEntrada) {
		for (Hospedagem hospedagem : hospedagens) {
			if (hospedagem.getDataEntrada().equals(dataEntrada)) {
				return hospedagem;
			}
		}
		return null;
	}
}