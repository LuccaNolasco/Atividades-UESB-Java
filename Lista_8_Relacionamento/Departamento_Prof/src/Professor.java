public class Professor {
    private String nome;
    private String cpf;
    private String materia;

    public Professor (String nome, String cpf, String materia){
        this.cpf=cpf;
        this.nome=nome;
        this.materia=materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public  String toString(){
        return "Nome: "+nome +"\nCPF: "+cpf+"\nMatéria: "+materia+"\n";
    }
}
