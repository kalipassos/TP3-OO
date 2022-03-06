package hospedagens;

public class Anfitriao extends Pessoa {
	private String nome;
	private String endereco;
	private int telefone;
	private int CPF;

	// private Hospedagem hospedagens;
	public Anfitriao(String nome, String endereco, int telefone, int CPF) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.CPF = CPF;
		// this.hospedagens = hospedagens;
	}

	@Override
	public String getNome(String nome) {

		return nome;
	}

	@Override
	public String getEndereco(String endereco) {

		return endereco;
	}

	@Override
	public int getTelefone(int telefone) {

		return telefone;
	}

	public int getCPF(int CPF) {

		return CPF;
	}

	public void visualizarAnfitriao() {

	}

	public void editarAnfitriao() {

	}
}
