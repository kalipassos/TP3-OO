package data;

import java.util.ArrayList;

import modelos.Anfitriao;
import modelos.Animal;
import modelos.Dono;
import modelos.Hospedagem;
import modelos.Pagamento;

public class Dados {

	private static final ArrayList<Dono> donos = new ArrayList<>();

	private static final ArrayList<Anfitriao> anfitrioes = new ArrayList<>();

	private Dados() {
	}

	public static void adicionarDono() {
		Dono dono1 = new Dono("Carlos", "Guara", "61992934962", "07642929196");
		Dados.getDonos().add(dono1);

		Dono dono2 = new Dono("Kallyne", "Riacho Fundo", "6175467534", "32156978578");
		Dados.getDonos().add(dono2);

		Dono dono3 = new Dono("Eduardo", "Ceilandia", "61997567843", "05598743690");
		Dados.getDonos().add(dono3);

		Anfitriao anfitriao1 = new Anfitriao("Lucas", "Asa Sul", "61998456730", "09643027080");
		Dados.getAnfitrioes().add(anfitriao1);

		Anfitriao anfitriao2 = new Anfitriao("Bernardo", "Taguatinga", "61995756936", "09644522169");
		Dados.getAnfitrioes().add(anfitriao2);

		Animal animal1 = new Animal("Pingo", "Cachorro", "Medio", 3, "Masculino", "Ficar atento, Pingo e cego");
		dono1.getAnimais().add(animal1);

		Animal animal2 = new Animal("Belinha", "Gato", "Pequenoo", 2, "Feminino", "Dar muito carinho");
		dono2.getAnimais().add(animal2);

		Animal animal3 = new Animal("Joey", "Cachorro", "Medio", 1, "Masculino", "Nao deixa ele comer lixo");
		dono3.getAnimais().add(animal3);

		Hospedagem hospedagem1 = new Hospedagem("8 de marco", "14 de marco", new Pagamento("Dinheiro", 1500), animal1);
		anfitriao1.getHospedagens().add(hospedagem1);

		Hospedagem hospedagem2 = new Hospedagem("14 de marco", "21 de marco", new Pagamento("Dinheiro", 1750), animal2);
		anfitriao1.getHospedagens().add(hospedagem2);

		Hospedagem hospedagem3 = new Hospedagem("21 de marco", "31 de marco", new Pagamento("Dinheiro", 2500), animal1);
		anfitriao2.getHospedagens().add(hospedagem3);
	}

	public static ArrayList<Dono> getDonos() {
		return donos;
	}

	public static ArrayList<Anfitriao> getAnfitrioes() {
		return anfitrioes;
	}

	public static Dono getDonoPeloNome(String nome) {
		for (Dono dono : donos) {
			if (dono.getNome().equals(nome)) {
				return dono;
			}
		}
		return null;
	}

	public static Anfitriao getAnfitriaoPeloNome(String nome) {
		for (Anfitriao anfitriao : anfitrioes) {
			if (anfitriao.getNome().equals(nome)) {
				return anfitriao;
			}
		}
		return null;
	}

	public static Dono getDonoPeloCpf(String cpf) {
		for (Dono dono : donos) {
			if (dono.getCPF().equals(cpf)) {
				return dono;
			}
		}
		return null;
	}

	public static Anfitriao getAnfitriaoPeloCpf(String cpf) {
		for (Anfitriao anfitriao : anfitrioes) {
			if (anfitriao.getCPF().equals(cpf)) {
				return anfitriao;
			}
		}
		return null;
	}
}