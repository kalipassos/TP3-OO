package modelos;

import java.util.Date;

public class Hospedagem {
    private final Date dataEntrada;
    private final Date dataSaida;
    private String adicionalHospedagem;
    private Pagamento pagamento;
    private Animal animal;

    public Hospedagem(Date dataEntrada, Date dataSaida, Pagamento pagamento, Animal animal) { // construtor sem a
                                                                                              // definicao de adicionais
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.pagamento = pagamento;
        this.animal = animal;

    }

    public Hospedagem(Date dataEntrada, Date dataSaida, String adicionalHospedagem, Pagamento pagamento,
            Animal animal) { // construtor com adicionais
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.adicionalHospedagem = adicionalHospedagem;
        this.pagamento = pagamento;
        this.animal = animal; // animal que sera hospedado
    }

    // getters e setters dos atributos
    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public String getAdicionalHospedagem() {
        return adicionalHospedagem;
    }

    public void setAdicionalHospedagem(String adicionalHospedagem) {
        this.adicionalHospedagem = adicionalHospedagem;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() { // toString para impressao
        return "A hospedagem do animal" + animal + " inicia-se em " + dataEntrada + " e termina-se em " + dataSaida
                + "\n Informacoes de pagamento:" + pagamento + ".\n" + "Adicionais: " + adicionalHospedagem + ".";
    }

}