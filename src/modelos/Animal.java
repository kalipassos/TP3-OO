package model;

public class Animal {
    private String nome;
    private String especie;
    private String biografia;
    private String porte;
    private int idade;
    private String sexo;
    private String cuidados;

    public Animal(String nome, String especie, String porte, int idade, String sexo, String cuidados) {
        this.nome = nome;
        this.especie = especie;
        this.porte = porte;
        this.idade = idade;
        this.sexo = sexo;
        this.cuidados = cuidados;
    }

    public Animal(String nome, String especie, String biografia, String porte, int idade, String sexo,
            String cuidados) {
        this.nome = nome;
        this.especie = especie;
        this.biografia = biografia;
        this.porte = porte;
        this.idade = idade;
        this.sexo = sexo;
        this.cuidados = cuidados;
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

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
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

    @Override
    public String toString() {
        return String.format("Animal [nome=%s, especie=%s, biografia=%s, porte=%s, idade=%s, sexo=%s, cuidados=%s]",
                nome, especie, biografia, porte, idade, sexo, cuidados);
    }

}