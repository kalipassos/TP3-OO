package hospedagens;

/*Classe abstrata

abrir cadastro da pessoa e dentro do dono possibilitar cadastrar um animal */
public abstract class Pessoa {
	private String nome;
	private String endereco;
	private int telefone;
	private int CPF;

	public String getNome(String nome) {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getEndereco(String endereco) {
		return endereco;

	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;

	}

	public int getTelefone(int telefone) {
		return telefone;

	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;

	}

	public int getCpf(int CPF) {
		return CPF;

	}

	public void setCpf(int CPF) {
		this.CPF = CPF;

	}

}
