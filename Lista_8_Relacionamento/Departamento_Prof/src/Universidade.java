import java.util.ArrayList;
public class Universidade {
    ArrayList <Departamento> listaDept;
    public Universidade(){
        listaDept=new ArrayList<Departamento>();
    }

    public Departamento searchDept(String nome){
        for(Departamento d: listaDept){
            if(d.getNome().equals(nome)){
                return d;
            }
        }
        return null;
    }

    public void incluirDept(Departamento d){
        if(searchDept(d.getNome())==null){
            listaDept.add(d);
        }
    }

    public void removeDept(Departamento d){
        listaDept.remove(d);
    }

    public ArrayList <Departamento> returnDept(){
        return listaDept;
    }

}
