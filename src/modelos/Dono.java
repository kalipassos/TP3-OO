package modelos;

import java.util.ArrayList;

public class Dono extends Pessoa {
	/**
	 * Criação da ArrayList que vai conter os animais pertencentes a um dono
	 */
	private final ArrayList<Animal> animais;

	/**
	 * Construtor
	 */
	public Dono() {
		super();
		this.animais = new ArrayList<>();
	}

	/**
	 * Construtor que recebe os valores
	 * 
	 * @param nome
	 * @param endereco
	 * @param telefone
	 * @param CPF
	 */
	public Dono(String nome, String endereco, String telefone, String CPF) {
		super(nome, endereco, telefone, CPF);
		this.animais = new ArrayList<>();
	}

	/**
	 * Getter da ArrayList de animais
	 * 
	 * @return
	 */
	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	/**
	 * Adicao do animal
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		this.animais.add(animal);
	}

	/**
	 * Busca um animal pelo nome
	 * 
	 * @param nomeAnimal
	 * @return
	 */
	public Animal getAnimalPeloNome(String nomeAnimal) {
		for (Animal animal : animais) {
			if (animal.getNome().equals(nomeAnimal)) {
				return animal;
			}
		}
		return null;
	}
}
