package Model;

public class Cliente extends Pessoa{
    private int codigo;

    public Cliente(){}
    public Cliente(String nome, Data nascimento, int codigo){
        super(nome, nascimento);
        this.codigo=codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    /**
     * Esse método realiza a impressão dos dados e cumpre o contrato com
     * a classe abstrata Pessoa. Usa get.Nome e getNascimento pois são private
     */
    @Override
    public void imprimeDados(){
        System.out.printf("Nome: %s\n",this.getNome());
        System.out.println("Nascimento: "+this.getNascimento());
        System.out.printf("Codigo:%d\n",codigo);
    }
}
