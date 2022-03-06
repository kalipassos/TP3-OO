package hospedagens;

import java.util.Scanner;

public class Dono extends Pessoa {

	private String nome;
	private String endereco;
	private Animal animais;
	private int telefone;
	private int CPF;
	// private int numeroAnimais;

	/*
	 * public Dono(String nome, String endereco, int telefone, int CPF) {
	 * 
	 * this.nome = nome;
	 * this.endereco = endereco;
	 * this.animais = animais;
	 * this.telefone = telefone;
	 * this.CPF = CPF;
	 * // this.numeroAnimais = 0;//contagem de animais que esse dono possui
	 */

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public int getCPF() {
		return CPF;
	}

	public void visualizarDonoCpf() {// lista o dono procurado por CPF e mostra os seus animais

	}

	public void visualizarDonoNome() {// lista os possíveis donos procurados e ao escolher o que quer, mostra os seus
										// animais

	}

	public void editarDono() {// edita os valores do dono cadastrado escolhido

	}

	public static void cadastrarDono() {
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite o nome do dono: ");
		String nome = dados.nextLine();
		System.out.println("Digite o endereco do dono: ");
		String endereco = dados.nextLine();
		System.out.println("Digite o telefone do dono: ");
		int telefone = dados.nextInt();
		System.out.println("Digite o CPF do dono: ");
		int CPF = dados.nextInt();

	}
}
