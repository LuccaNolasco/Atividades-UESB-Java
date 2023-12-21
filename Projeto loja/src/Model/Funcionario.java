package Model;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(){}
    public Funcionario(String nome, Data nascimento, double salario){
        super(nome,nascimento);
        this.salario=salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Retorna o imposto que é retirado do salário.
     * Com esse método, posso colocar 0.05 no gerente, e assim, reutilizar código.
     * Graças a ele posso usar um super.imprimeDado() em gerente, e apenas adicionar a área
     * @return retorna o imposto que será posteriormente retirado do salário
     */
    public double calculaImposto(){
        return salario*0.03;
    }


    /**
     * Como classe filha, ela deve possuir os métodos declarados como abstratosna classe pai
     */
    @Override
    public void imprimeDados() {
        System.out.printf("Nome: %s\n",this.getNome());
        System.out.println("Nascimento: "+this.getNascimento());
        System.out.printf("Salário: R$%.2f - R$%.2f de impostos = R$%.2f\n",salario,calculaImposto(),salario-calculaImposto());
    }
}
