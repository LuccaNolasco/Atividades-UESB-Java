package Model;

public abstract class  Pessoa {
    private String nome;
    private Data nascimento;

    public Pessoa(){}
    public Pessoa(String nome, Data nascimento){
        this.nome=nome;
        this.nascimento=nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    //Apenas uma forma geral da impreção de dados
    // Como é "imprimeDados" e não "getDados", farei a impressão no próprio método, logo, é void
    public abstract void imprimeDados();
}
