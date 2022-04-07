package modelos;

import java.util.ArrayList;

public class Anfitriao extends Pessoa { // classe Anfitriao que herda os atributos da classe abstrata Pessoa
	private final ArrayList<Hospedagem> hospedagem;

	public Anfitriao() { // construtor da classe Anfitriao que recebe os atributos da classe abstrata
							// Pessoa
		super();
		this.hospedagem = new ArrayList<>();
	}

	public Anfitriao(String nome, String endereco, String telefone, String CPF) {
		super(nome, endereco, telefone, CPF);
		this.hospedagem = new ArrayList<>();

	}

	public Anfitriao(String nome, String endereco, String telefone, String CPF, Hospedagem hospedagem) { // construtor
																											// que
																											// recebe
																											// uma
																											// hospedagem
		super(nome, endereco, telefone, CPF);
		this.hospedagem = new ArrayList<>();
	}

	public ArrayList<Hospedagem> getHospedagem() {
		return hospedagem;
	}

	/*
	 * public void setHospedagem(Hospedagem hospedagem) { this.hospedagem =
	 * hospedagem; }
	 */

}