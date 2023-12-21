package Control;
import Model.Pessoa;


public class CadastroPessoas {
    /*Creio que arraylist seria melhor, tendo em vista a quantidade desconhecida
    Mas usarei Array conforme a atividade solicita*/
    Pessoa[] arrPessoa;
    private static int qtdAtual = 0;

    public CadastroPessoas() {
        //A quantidade é desconhecida, mas colocarei 3 pois a atividade solicita uma Pessoa de Cada
        arrPessoa = new Pessoa[3];
    }

    public int getQtdAtual(){
        return qtdAtual;
    }

    /**
     * Embora não solicitado, um método de busca é essencial para se evitar repetições
     * Vale notar que esse método é mais eficiente com ArrayLists, já que não precisa testar
     * se é null.
     * @param nome
     * @return O objeto Pessoa se existir algum com esse nome, ou null se nn existir
     */
    public Pessoa buscaPessoa(String nome) {
        for (Pessoa p : arrPessoa) {
            if(p==null){
                continue;
            }
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }


    /**
     * Checa se a pessoa já está no Array. Não estando, a adiciona no menor indice disponível
     * @param pessoa
     */
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

    /**
     * Lista todos os cadastrados
     */
    public void listaPessoas(){
        for (Pessoa p : arrPessoa){
            p.imprimeDados();
            //para pular uma linha;
            System.out.println();
        }
    }


}