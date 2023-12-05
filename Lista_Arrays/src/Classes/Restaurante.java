package Classes;

public class Restaurante {
   private String nome;
   private String comida;
   private double precoMedio;
   public Restaurante(){}

    public void setComida(String comida) {
        this.comida = comida.toLowerCase();
    }
    public void setNome (String nome){
        this.nome=nome;
    }
    public void setPrecoMedio(double precoMedio){
        this.precoMedio=precoMedio;
    }

    public String getNome(){
        return this.nome.toUpperCase();
    }
    public String getComida(){
        return this.comida.toLowerCase();
    }
    public double getPrecoMedio(){
        return this.precoMedio;
    }

    @Override
    public String toString(){
        return String.format("O restaurante %s serve a comida selecionada '%s' com um preço médio de R$%.2f",this.nome,this.comida,this.precoMedio);
    }
}
