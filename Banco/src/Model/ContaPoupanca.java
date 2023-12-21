package Model;

public class ContaPoupanca extends Conta{
    private final double rendimento=1.001;
    private int tempo;

    public ContaPoupanca(){}

    public double getRendimento() {
        return rendimento;
    }


    public double calcularRendimento(int tempo,double montante){
        return tempo*rendimento*montante;
    }
}
