package modelos;

import java.awt.Component;
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

	public Component getAnfitriao() {
		return null;
	}

	public void remove(int anfitriaoSelecionado) {
	}

	public int size() {
		return 0;
	}

	public Pessoa get(int i) {
		return null;
	}

}