package Model;

public class Gerente extends Funcionario{
    private String area;
    //Na uml não tem, mas colocarei uma bonificação ao gerente, pois me parece estranho
    //Ele ter um imposto maior e não possuir bonificação
    private final double  bonificacao=1.3;

    public Gerente(){}
    public Gerente (String nome, Data nascimento, double salario, String area){
        super(nome, nascimento, salario );
        //A bonificação deve ser aplicada depois. Não consegui colocar salario*bonificação no super
        aplicarBonificacao();
        this.area=area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    /**
     * Não pude colocar o salário já multiplicado à bonificação no superConstrutor,
     * então esse método serve para realizar essa multiplicação
     */
    public void aplicarBonificacao(){
        setSalario(getSalario()*bonificacao);
    }

    /**
     * Com o override, posso reaproveitar o chamamento dessa função na imprimeDados da
     * classe Funcionário, de modo que o código fica ainda mais enxuto e eficiente
     * @return O imposto que será retirado do salário
     */
    @Override
    public double calculaImposto(){
        return getSalario()*0.05;
    }

    /**
     * Já chama os dados da classe Funcionário e só precisa adicionar a área do gerente
     */
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Área: "+area);
    }


}
