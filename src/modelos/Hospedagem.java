package modelos;

public class Hospedagem {
	private final String dataEntrada;
	private final String dataSaida;
	private Pagamento pagamento;
	private Animal animal;

	/**
	 * construtor da classe Hospedagem
	 */
	public Hospedagem(String dataEntrada, String dataSaida, Pagamento pagamento, Animal animal) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.pagamento = pagamento;
		this.animal = animal;

	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
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

	/**
	 * Transforma as informacoes para string, facilitando a impressao
	 */
	@Override
	public String toString() { // toString para impressao
		return "A hospedagem do animal" + animal + " inicia-se em " + dataEntrada + " e termina-se em " + dataSaida
				+ "\n Informacoes de pagamento:" + pagamento + ".\n";
	}
}
