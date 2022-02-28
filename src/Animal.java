import java.util.Scanner;

public class Animal {
    private String nome;
    private String biografia;
    private String porte;
    private String sexo;
    private int idade;
    private String especie;
    private String cuidados;
    private Dono dono;

    Animal() {
        System.out.println("animais");
    }

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Biografia: " + this.biografia);
        System.out.println("Porte: " + this.porte);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Cuidados: " + this.cuidados);
        System.out.println("Dono: " + this.dono.nome);
    }

    public void cadastrar() {
        System.out.println("cadastrar");
        Animal animal = new Animal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do animal: ");
        String animalCadastro = sc.next();
        this.nome = animalCadastro;
        System.out.println("Digite o porte do animal: ");
        String porteCadastro = sc.next();
        this.porte = porteCadastro;
        System.out.println("Digite o sexo do animal: ");
        String sexoCadastro = sc.next();
        this.sexo = sexoCadastro;
        System.out.println("Digite a idade do animal: ");
        int idadeCadastro = sc.nextInt();
        this.idade = idadeCadastro;
        System.out.println("Digite a especie do animal: ");
        String especieCadastro = sc.next();
        this.especie = especieCadastro;
        System.out.println("Digite os cuidados do animal: ");
        String cuidadosCadastro = sc.next();
        this.cuidados = cuidadosCadastro;
        System.out.println("Digite a biografia do animal: ");
        String biografiaCadastro = sc.next();
        this.biografia = biografiaCadastro;
        System.out.println("O dono ja esta cadastrado? (s/n)");
        String donoCadastro = sc.next();
        if (donoCadastro.equals("n")) {
            System.out.println("Digite o nome do dono: ");
            String nomeCadastro = sc.next();
            this.dono.nome = nomeCadastro;
            System.out.println("Digite o cpf do dono: ");
            String cpfCadastro = sc.next();
            this.dono.cpf = cpfCadastro;

        } else {
            System.out.println("Dono ja cadastrado");

        }

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