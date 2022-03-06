package hospedagens;

import java.util.ArrayList;

public class Controle {

    private final static ArrayList<Animal> animais = new ArrayList<>();
    // ArrayList<Animal> animais = new ArrayList<>();

    public void adicionarAnimais(Animal ca) {
        animais.add(ca);
    }

    public static void listaAnimais() {
        animais.forEach((p) -> {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Biografia: " + p.getBiografia());
            System.out.println("Porte: " + p.getPorte());
            System.out.println("Sexo: " + p.getSexo());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Especie: " + p.getEspecie());
            System.out.println("Cuidados: " + p.getCuidados());
        });

    }

    public static void getLista() {
        System.out.println(animais);
    }

    private final static ArrayList<Dono> donos = new ArrayList<>();
}