import java.util.Scanner;
import java.util.ArrayList;
public class TimeUI {
    Scanner cin = new Scanner (System.in);
    private Time time;
    public TimeUI(){
        time= new Time();
    }

    public void exibirMenu(){
        int option = 0;
        while (option != 5){
            System.out.println("1 - Incluir Jogador");
            System.out.println("2 - Demitir Jogador");
            System.out.println("3 - Pesquisar Jogador");
            System.out.println("4 - Listar time");
            System.out.println("5 - Encerrar programa");
            System.out.print("Sua opção: ");
            option=cin.nextInt();
            cin.nextLine();


            switch (option){
                case 1:
                    telaIncluirJogador();
                    break;
                case 2:
                    telaDemitirJogador();
                    break;
                case 3:
                    telaPesquisarJogador();
                    break;
                case 4:
                    telaListarTime();
                    break;
                case 5:
                    cin.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    public void telaIncluirJogador(){
        System.out.print("Nome: ");
        String nome = cin.nextLine();
        System.out.print("CPF: ");
        String cpf = cin.next();
        System.out.print("Número: ");
        String num = cin.next();
        System.out.print("Posição: ");
        String pos = cin.next();
        Jogador j = new Jogador (cpf, nome, num, pos);
        if(time.pesquisarJogador(cpf)==null){
            time.incluirJogador(j);
        }
    }

    public void telaDemitirJogador(){
        System.out.print("Insira o CPF:");
        String cpf = cin.next();
        time.excluirJogador(time.pesquisarJogador(cpf));

    }

    public void telaPesquisarJogador(){
        System.out.print("Insira o CPF: ");
        String cpf = cin.next();
        Jogador j  = time.pesquisarJogador(cpf);
        if (j!=null){
            System.out.println(j.toString());
        }
    }

    public void telaListarTime(){
        ArrayList <Jogador> retornoTime;
        retornoTime = time.listarJogador();
        for (Jogador j : retornoTime){
            System.out.println(j.toString());
        }
    }


}
