package model;

public class Anfitriao extends Pessoa {
	private Hospedagem hospedagem;

	public Anfitriao() {
		super();
	}

	public Anfitriao(String nome, String endereco, String telefone, String CPF, Hospedagem hospedagem) {
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