import java.util.Scanner;
import java.util.ArrayList;

public class ContinenteUI {
    Scanner cin = new Scanner(System.in);
    private Continente continente;

    public ContinenteUI(){
        continente = new Continente();
    }

    public void exibirMenu(){
        int option = 1;
        while (option!=8){
            System.out.println("1 - Incluir País");
            System.out.println("2 - Remover País");
            System.out.println("3 - Dimensão total do continente");
            System.out.println("4 - População Total do Continente");
            System.out.println("5 - Densidade Populacional do Continente");
            System.out.println("6 - País mais populoso");
            System.out.println("7 - País menos Populoso");
            System.out.println("8 - Encerrar");
            System.out.print("Sua opção: ");
            option= cin.nextInt();
            cin.nextLine();

            switch (option){
                case 1:
                    telaIncluirPais();
                    break;
                case 2:
                    telaRemoverPais();
                    break;
                case 3:
                    System.out.println("A dimensão total do continente é "+continente.dimTot()+"km^2");
                    break;
                case 4:
                    System.out.println("A população total do continente é: "+continente.popTot()+" pessoas");
                    break;
                case 5:
                    System.out.printf("O continente possui %.2f pessoas por km^2\n",((double)continente.popTot())/ continente.dimTot());
                    break;
                case 6:
                    System.out.printf("O país mais populoso é %s com %d habitantes\n", continente.maisPop().getNome(),continente.maisPop().getPop());
                    break;
                case 7:
                    System.out.printf("O país menos populoso é %s com %d habitantes\n",continente.menosPop().getNome(),continente.menosPop().getPop());
                    break;
                case 8:
                    cin.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    public void telaIncluirPais(){
        System.out.print("Insira o nome do país: ");
        String nome = cin.nextLine();
        System.out.print("Insira a população: ");
        int pop = cin.nextInt();
        System.out.print("Insira sua dimensão em km quadrados: ");
        double area = cin.nextDouble();
        Pais p = new Pais(nome, pop, area);
        if (continente.buscaPais(nome)==null){
            continente.incluirPais(p);
        }

    }

    public void telaRemoverPais(){
        System.out.print("Insira o nome do país: ");
        String nome = cin.nextLine();
        Pais p = continente.buscaPais(nome);
        if (p!= null){
            continente.removerPais(p);
        }
    }



}
