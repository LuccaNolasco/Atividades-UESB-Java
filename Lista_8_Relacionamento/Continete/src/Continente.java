import java.util.ArrayList;
public class Continente {
    ArrayList <Pais> listaPais;

    public Continente(){
        listaPais = new ArrayList<Pais>();
    }

    public Pais buscaPais (String nome){
        for(Pais p : listaPais){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }

    public boolean incluirPais(Pais p){
        if(buscaPais(p.getNome())==null){
            listaPais.add(p);
            return true;
        }
        return false;
    }

    public void removerPais(Pais p){
        listaPais.remove(p);
    }

    public double dimTot(){
        double tot=0;
        for(Pais p : listaPais){
            tot+= p.getArea();
        }
        return tot;
    }

    public int popTot(){
        int tot=0;
        for(Pais p : listaPais){
            tot+=p.getPop();
        }
        return tot;
    }

    public Pais maisPop(){
        Pais p = listaPais.get(0);
        for(Pais q : listaPais){
            if(q.getPop()>p.getPop()){
                p=q;
            }
        }
        return p;
    }

    public Pais menosPop(){
        Pais p = listaPais.get(0);
        for(Pais q: listaPais){
            if(q.getPop()<p.getPop()){
                p=q;
            }
        }
        return p;
    }

    public ArrayList <Pais> listarPais(){
        return listaPais;
    }

}
