public class Pessoa {
    String nome;
    int idade;

    public Pessoa (String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade=i;
    }


}
