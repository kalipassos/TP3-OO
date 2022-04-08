package modelos;

public class Pagamento {
    /**
     * Recebe a forma de pagamento
     */
    private String formaPagamento;
    /**
     * Recebe o valor final
     */
    private double valorFinal;

    /**
     * Construtor de pagamento
     * 
     * @param formaPagamento
     * @param valorFinal
     */
    public Pagamento(String formaPagamento, double valorFinal) {
        this.formaPagamento = formaPagamento;
        this.valorFinal = valorFinal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    /**
     * Trasnforma para string, facilitando a impressao.
     */
    @Override
    public String toString() {
        return "O pagamento será realizado em " + formaPagamento + " com o valor final de" + valorFinal + ".";
    }

}
