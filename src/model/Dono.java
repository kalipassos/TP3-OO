package model;

import java.util.ArrayList;

public class Dono extends Pessoa {

	private final ArrayList<Animal> animais;

	public Dono() {
		super();
		this.animais = new ArrayList<>();
	}

	public Dono(String nome, String endereco, String telefone, String CPF) {
		super(nome, endereco, telefone, CPF);
		this.animais = new ArrayList<>();

	}

	public Animal buscarAnimal(String nome) {
		for (Animal animal : animais) {
			if (animal.getNome().equals(nome)) {
				return animal;
			}
		}
		return null;
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}
}
