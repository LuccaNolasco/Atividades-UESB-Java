package View;
import Control.CadastroPessoas;
import Model.*;

import java.util.Scanner;

public class TestaCadastro {
    static Scanner cin = new Scanner (System.in);//Static para ser usado em todos os métodos
    public static void main(String[] args) {
        //Nessa classe, quero fazer uma interface de escolha para o usuário

        CadastroPessoas cad = new CadastroPessoas();
        int opt = 0;
        while(opt!=4){
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Checar Cadastro");
            System.out.println("3 - Listar todos os cadastros");
            System.out.println("4 - Encerrar programa");
            System.out.print("Sua opção: ");
            opt=cin.nextInt();
            cin.nextLine();//Para consumir o enter do nextInt


            switch (opt){
                case 1:
                    telaCadastro(cad);
                    break;
                case 2:
                    telaChecaCadastro(cad);
                    break;
                case 3:
                    telaListaPessoas(cad);
                    break;
                case 4:
                    cin.close();
                    System.exit(0);
                default:
                    break;

            }
        }


    }

    //Esse método serve para checar se é cliente, funcionário comum ou gerente, e adicionar ao array
    public static void telaCadastro(CadastroPessoas cad){
        Pessoa p;
        System.out.println("Insira qual tipo de cadastro deseja \n1-Cliente\n2-Funcionário\n3-Gerente");
        int op=cin.nextInt();
        cin.nextLine();//Para consumir o enter do nextInt
        System.out.println("Insira o nome");
        String nome = cin.nextLine();
        System.out.println("Insira o dia, depois o mes, e depois o ano de nascimento");
        Data nascimento = new Data();
        nascimento.setDia(cin.nextInt());
        nascimento.setMes(cin.nextInt());
        nascimento.setAno(cin.nextInt());
        switch (op){
            case 1:
                System.out.println("Insira o codigo");
                int cod = cin.nextInt();
                cin.nextLine();
                p = new Cliente(nome, nascimento, cod);
                cad.cadastraPessoa(p);
                break;
            case 2:
                System.out.println("Insira o salário base da empresa");
                double salario = cin.nextDouble();
                cin.nextLine();
                p = new Funcionario(nome, nascimento, salario);
                cad.cadastraPessoa(p);
                break;
            case 3:
                System.out.println("Insira o salário base da empresa");
                double salario1 = cin.nextDouble();
                cin.nextLine();
                System.out.println("Insira a área de gerência");
                String area = cin.nextLine();
                p= new Gerente(nome, nascimento, salario1, area);
                cad.cadastraPessoa(p);
                break;
            default:
                break;
        }
    }

    public static void telaChecaCadastro(CadastroPessoas cad){
        System.out.println("Insira o nome que deseja procurar");
        String nome = cin.nextLine();
        (cad.buscaPessoa(nome)).imprimeDados();
    }

    public static void telaListaPessoas(CadastroPessoas cad){
        cad.listaPessoas();
    }
}
