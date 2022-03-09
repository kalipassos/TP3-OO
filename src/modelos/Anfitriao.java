package modelos;

public class Anfitriao extends Pessoa { // classe Anfitriao que herda os atributos da classe abstrata Pessoa
	private Hospedagem hospedagem;

	public Anfitriao() { // construtor da classe Anfitriao que recebe os atributos da classe abstrata
							// Pessoa
		super();
	}

	public Anfitriao(String nome, String endereco, String telefone, String CPF) {
		super(nome, endereco, telefone, CPF);
	}

	public Anfitriao(String nome, String endereco, String telefone, String CPF, Hospedagem hospedagem) { // construtor
																											// que
																											// recebe
																											// uma
																											// hospedagem
		super(nome, endereco, telefone, CPF);
		this.hospedagem = hospedagem;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

}