public class Jogador {
    private String cpf;
    private String nome;
    private String num;
    private String posi;

    public Jogador (String cpf, String nome, String num, String posi){
        this.cpf=cpf;
        this.nome=nome;
        this.num=num;
        this.posi=posi;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getNum() {
        return num;
    }

    public String getPosi() {
        return posi;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setPosi(String posi) {
        this.posi = posi;
    }

    @Override
    public String toString(){
        return "Nome: " + nome+"\nCPF: "+cpf+"\nNumero: "+num+"\nPosição: "+posi+"\n\n";
    }
}
