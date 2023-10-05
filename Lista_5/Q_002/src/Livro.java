public class Livro {
    private int pag;
    private String aut;
    private String nome;

    public Livro (int pag, String aut, String nome){
        this.pag=pag;
        this.aut=aut;
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public String getAut(){
        return this.aut;
    }
    public void setAut(String aut){
        this.aut=aut;
    }
    public int getPag(){
        return this.pag;
    }
    public void setPag(int pag){
        this.pag=pag;
    }
}
