public class Animal {
    String nome;
    String biografia;
    String porte;
    String sexo;
    int idade;
    String especie;
    String cuidados;
    Dono dono;

    Animal() {
        System.out.println("animais");
    }

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Biografia: " + this.biografia);
        System.out.println("Porte: " + this.porte);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
    }

    public void cadastrar() {
        System.out.println("cadastrar");
    }

    public void editar() {
        System.out.println("editar");
    }

    public void visualizar() {
        System.out.println("visualizar");
    }

    public void excluir() {
        System.out.println("excluir");
    }

}