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

    public void aplicarBonificacao(){
        setSalario(getSalario()*bonificacao);
    }

    @Override
    public double calculaImposto(){
        return getSalario()*0.05;
    }
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Área: "+area);
    }


}
