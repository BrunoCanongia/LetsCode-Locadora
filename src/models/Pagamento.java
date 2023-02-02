package models;

public abstract class Pagamento implements IPagamento{

    double valor;

    
    public Pagamento(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean pagar() {
        System.out.println("Pagamento aprovado");
        return true;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
}
