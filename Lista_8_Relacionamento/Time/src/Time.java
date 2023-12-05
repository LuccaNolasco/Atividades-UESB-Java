import java.util.ArrayList;
public class Time {
    ArrayList <Jogador> lista_jogador;

    public Time(){
        lista_jogador = new ArrayList<Jogador>();
    }

    public Jogador pesquisarJogador(String cpf){
        for (Jogador j: lista_jogador) {
            if (j.getCpf().equals(cpf))
                return j;
        }
        return null;
    }

    public boolean incluirJogador(Jogador j){
        if(pesquisarJogador(j.getCpf()) == null){
            lista_jogador.add(j);
            return true;
        }
        return false;
    }

    public void excluirJogador(Jogador j){
        lista_jogador.remove(j);
    }

    public ArrayList<Jogador> listarJogador(){
        return lista_jogador;
    }

}
