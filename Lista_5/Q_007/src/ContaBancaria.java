public class ContaBancaria {
    private String numConta;
    private double saldo;

    public ContaBancaria (String num, double saldo){
        this.numConta=num;
        this.saldo=saldo;
    }

    public String getNumConta(){
        return this.numConta;
    }

    public double getSaldo(){
        return  this.saldo;
    }
    public void deposito(double val){
        this.saldo+=val;
    }
    public void saque(double val){
        this.saldo-=val;
    }

}
