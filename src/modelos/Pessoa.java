package model;

/*Classe abstrata
 */
public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String CPF;

	public Pessoa(String nome, String endereco, String telefone, String CPF) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.CPF = CPF;

	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	@Override
	public String toString() {
		return "Pessoa [CPF=" + CPF + ", endereco=" + endereco + ", nome=" + nome + ", telefone=" + telefone + "]";
	}

}
