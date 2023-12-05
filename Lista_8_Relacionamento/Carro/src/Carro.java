public class Carro {
    private String nome;
    private Motor motor;
    private Pneu[] pneus;
    private Banco[] bancos;
    private double custo=10000;

    public Carro(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pneu[] getPneus() {
        return pneus;
    }

    public void setPneus(Pneu[] pneus) {
        this.pneus = pneus;
    }

    public Banco[] getBancos() {
        return bancos;
    }

    public void setBancos(Banco[] bancos) {
        this.bancos = bancos;
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome+"\nPreço: R$"+(this.custo+4*this.pneus[0].getCusto()+5*this.bancos[0].getCusto()+this.motor.getCusto())+"\n\n";
    }
}
