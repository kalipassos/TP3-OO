package modelos;

public class Animal {
    private String nome;
    private String especie;
    private String porte;
    private Integer idade;
    private String sexo;
    private String cuidados;

    /**
     * Construtor
     */
    public Animal(String nome, String especie, String porte, Integer idade, String sexo, String cuidados) {
        this.nome = nome;
        this.especie = especie;
        this.porte = porte;
        this.idade = idade;
        this.sexo = sexo;
        this.cuidados = cuidados;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCuidados() {
        return cuidados;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    /**
     * toString serve para imprimir os dados do animal.
     */
    @Override
    public String toString() {
        return String
                .format("O animal " + nome + " é um(a) " + especie + " " + sexo + " de porte " + porte + " e cuidados "
                        + cuidados + "\n");
    }

}