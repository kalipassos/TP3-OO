package model;

import java.util.Date;

public class Hospedagem {
    private final Date dataEntrada;
    private final Date dataSaida;
    private String adicionalHospedagem;
    private Pagamento pagamento;
    private Animal animal;

    public Hospedagem(Date dataEntrada, Date dataSaida, Pagamento pagamento, Animal animal) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.pagamento = pagamento;
        this.animal = animal;

    }

    public Hospedagem(Date dataEntrada, Date dataSaida, String adicionalHospedagem, Pagamento pagamento,
            Animal animal) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.adicionalHospedagem = adicionalHospedagem;
        this.pagamento = pagamento;
        this.animal = animal;
    }

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
    public String toString() {
        return "Hospedagem [adicionalHospedagem=" + adicionalHospedagem + ", animal=" + animal + ", dataEntrada="
                + dataEntrada + ", dataSaida=" + dataSaida + ", pagamento=" + pagamento + "]";
    }

}