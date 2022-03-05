import java.util.Scanner;

public class Dono extends Pessoa{
	
	private String nome;
	private String endereco;
	//private Animal animais;
	private int telefone;
	private	int CPF;
	//private int numeroAnimais;
	
	public Dono(String nome, String endereco,int telefone,int CPF) {
		
		this.nome = nome;
		this.endereco = endereco;
		//this.animais = animais;
		this.telefone = telefone;
		this.CPF = CPF;
		//this.numeroAnimais = 0;//contagem de animais que esse dono possui
		
	}
	
	public String getNome(String nome){
		
		return nome;
	}

	public String getEndereco(String endereco){
		
		return endereco;
	}
	
	public int getTelefone(int telefone){
		
		return telefone;
	}
	
	public int getCPF(int CPF){
		
		return CPF;
	}
	
	public void visualizarDonoCpf() {//lista o dono procurado por CPF e mostra os seus animais
		
	}
	public void visualizarDonoNome() {//lista os possíveis donos procurados e ao escolher o que quer, mostra os seus animais
		
	}
	
	public void editarDono() {//edita os valores do dono cadastrado escolhido
		
	}
}
