
import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> lista_contatos;

    public Agenda() {
        lista_contatos = new ArrayList<Contato>();
    }

    public boolean incluirContato(Contato c)
    {
        if (pesquisarContato(c.getCpf()) == null)
        {
            lista_contatos.add(c);
            return true;
        }

        return false;


    }

    public  Contato pesquisarContato(String cpf)
    {
        for (Contato c : lista_contatos)
            if (c.getCpf().equals(cpf))
                return c;
        return null;
    }

    public void excluirContato (Contato c) {
        lista_contatos.remove(c);
    }

    public ArrayList<Contato> listarContatos()
    {
        return lista_contatos;
    }
}