package hospedagens;

import java.util.Scanner;
//import java.util.ArrayList;

public class Animal {
    private String nome;
    private String biografia;
    private String porte;
    private String sexo;
    private int idade;
    private String especie;
    private String cuidados;

    public Animal(String nome, String biografia, String porte, String sexo, int idade, String especie, String cuidados,
            Dono dono) {
        this.nome = nome;
        this.biografia = biografia;
        this.porte = porte;
        this.sexo = sexo;
        this.idade = idade;
        this.especie = especie;
        this.cuidados = cuidados;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getBiografia() {
        return biografia;
    }

    public String setBiografia(String biografia) {
        this.biografia = biografia;
        return biografia;
    }

    public String getPorte() {
        return porte;
    }

    public String setPorte(String porte) {
        this.porte = porte;
        return porte;
    }

    public String getSexo() {
        return sexo;
    }

    public String setSexo(String sexo) {
        this.sexo = sexo;
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public String setEspecie(String especie) {
        this.especie = especie;
        return especie;
    }

    public String getCuidados() {
        return cuidados;
    }

    public String setCuidados(String cuidados) {
        this.cuidados = cuidados;
        return cuidados;
    }

    /*
     * public static void adicionarAnimal(Animal animal) {
     * 
     * animais.add(animal);
     * }
     * 
     * public static void removerAnimal(Animal animal) {
     * animais.remove(animal);
     * }
     * 
     * 
     * public static void visualizarAnimais() {
     * for (Animal animal : animais) {
     * System.out.println(animal.getNome(nome));
     * System.out.println(animal.getBiografia(biografia));}
     * }
     */ Controle controleAnimais = new Controle();

    public void cadastrarAnimal() {
        Scanner dados = new Scanner(System.in);
        Scanner dados1 = new Scanner(System.in);
        Scanner dados2 = new Scanner(System.in);
        Scanner dados3 = new Scanner(System.in);

        Animal c1 = new Animal();

        String nome = "";
        String biografia = "";
        String porte = "";
        String sexo = "";
        int idade = 0;
        String especie = "";
        String cuidados = "";

        System.out.println("Digite o nome do animal: ");
        nome = dados.nextLine();
        c1.setNome(nome);

        System.out.println("Adicione uma biografia do animal: ");
        biografia = dados1.nextLine();
        c1.setBiografia(biografia);

        System.out.println("Digite o porte do animal: ");
        porte = dados2.nextLine();
        c1.setPorte(porte);

        System.out.println("Digite o sexo do animal: ");
        sexo = dados3.nextLine();
        c1.setSexo(sexo);

        System.out.println("Digite a idade do animal: ");
        idade = dados.nextInt();
        c1.setIdade(idade);

        System.out.println("Digite a especie do animal: ");
        especie = dados1.nextLine();
        c1.setEspecie(especie);

        System.out.println("Digite os cuidados do animal: ");
        cuidados = dados2.nextLine();
        c1.setCuidados(cuidados);

        controleAnimais.adicionarAnimais(c1);

        System.out.println("Animal cadastrado com sucesso!");

    }

    public void preCadastro() {
        for (int i = 0; i < 10; i++) {
            Animal c1 = new Animal();
            c1.setNome("Cachorro" + i);
            c1.setBiografia("Cachorro é um animal de estimação" + i);
            c1.setPorte("Pequeno" + i);
            c1.setSexo("Macho" + i);
            c1.setIdade(2 + i);
            c1.setEspecie("Cachorro" + i);
            c1.setCuidados("Cuidados" + i);
            controleAnimais.adicionarAnimais(c1);

        }
    }

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Biografia: " + this.biografia);
        System.out.println("Porte: " + this.porte);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Cuidados: " + this.cuidados);
        // System.out.println("Dono: " + this.dono.nome);
    }

    public void editar() {

        // selecione um animal, escolha qual atributo deseja editar, digite o novo valor
    }

    public void visualizar() {
        // selecione um dono, um animal e visualize seus dados
        // usar setters/getters para os privados ~ ex: public String getNome() { return
        // this.nome; }
        this.status();

    }

    public void excluir() {
        // selecione um dono, um animal dele e exclua

    }

}