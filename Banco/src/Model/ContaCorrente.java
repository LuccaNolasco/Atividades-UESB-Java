package Model;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(){}

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
