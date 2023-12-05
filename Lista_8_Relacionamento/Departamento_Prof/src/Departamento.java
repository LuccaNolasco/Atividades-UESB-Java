import java.util.ArrayList;
public class Departamento {
    private String nome;
    ArrayList <Professor> listaProf;

   public Departamento (){
       listaProf=new ArrayList<Professor>();
   }

   public Departamento (String nome){
        this.nome=nome;
        listaProf=new ArrayList<Professor>();
   }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Professor searchProf(String cpf){
        for (Professor p : listaProf){
            if(p.getCpf().equals(cpf)){
                return p;
            }
        }
        return null;
    }

    public void incluiProf(Professor p){
        if(searchProf(p.getCpf())==null){
            listaProf.add(p);
        }
    }

    public void removeProf(Professor p){
        listaProf.remove(p);
    }

    public ArrayList<Professor> returnProf(){
        return listaProf;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+"\n";
    }


}
