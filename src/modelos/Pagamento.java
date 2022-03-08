package modelos;

public class Pagamento {
    private String formaPagamento;
    private double valorFinal;

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

    @Override
    public String toString() {
        return "Pagamento [formaPagamento=" + formaPagamento + ", valorFinal=" + valorFinal + "]";
    }

}
