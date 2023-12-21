package Model;
public class Cliente {
    private String nome;
    private long cpf;
    public Cliente (String nome, long cpf){
        this.cpf=cpf;
        this.nome=nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public String imprimir(){
        return "Nome: " + nome + " CPF: " + cpf ;
    }
}
