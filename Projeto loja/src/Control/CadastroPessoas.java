package Control;
import Model.Pessoa;


public class CadastroPessoas {
    //Creio que arraylist seria melhor, tendo em vista a quantidade desconhecida
    //Mas usarei Array conforme a atividade solicita
    Pessoa[] arrPessoa;
    private static int qtdAtual = 0;

    public CadastroPessoas() {
        //A quantidade é desconhecida, mas colocarei 3 pois a atividade solicita uma Pessoa de Cada
        arrPessoa = new Pessoa[3];
    }

    //Na atividade não solicita, mas um método de busca é essencial para garantir
    //que não haja repetições

    public Pessoa buscaPessoa(String nome) {
        for (Pessoa p : arrPessoa) {
            if(p==null)
                return p;

            if (p.getNome().equals(nome)) {
                return p;
            }
        }

        return null;
    }


    //Checa se a pessoa já existe, e depois cadastra e adiciona à quantidade atual
    public void cadastraPessoa(Pessoa pessoa) {
        //para não dar index out of bounds
        if(qtdAtual>=3){
            System.out.println("Limite máximo atingido");
        }
        else {
            if (buscaPessoa(pessoa.getNome()) == null) {
                for (int i = 0; i < arrPessoa.length; i++) {
                    if (arrPessoa[i] == null) {
                        arrPessoa[i] = pessoa;
                        break;
                    }
                }
                qtdAtual++;
            }
        }
    }

    public void imprimeCadastro(Pessoa pessoa){
        pessoa.imprimeDados();
    }

    //Para listar todos os membros
    public void listaPessoas(){
        for(Pessoa p: arrPessoa){
            p.imprimeDados();
            //para pular uma linha;
            System.out.println();
        }
    }


}