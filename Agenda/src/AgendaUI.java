import java.util.ArrayList;
import java.util.Scanner;

public class AgendaUI {
    Scanner cin = new Scanner (System.in);
    private Agenda agenda;

    public AgendaUI() {
        agenda = new Agenda();
    }

    public void exibirMenu()
    {
       int option =1;
       while (option !=5) {
           System.out.println("1 - Incluir contato");
           System.out.println("2 - Excluir contato");
           System.out.println("3 - Pesquisar contato");
           System.out.println("4 - Listar contatos");
           System.out.println("5 - Sair do sistema");
            option = cin.nextInt();
           switch (option) {
               case 1:
                   telaIncluirContato();
                   break;
               case 2:
                   telaExcluirContato();
                   break;
               case 3:
                   telaPesquisarContato();
                   break;
               case 4:
                   telaListarContato();
                   break;
               case 5:
                   cin.close();
                   System.exit(0);

           }
       }

    }
    public void telaIncluirContato() {
       //cin = new Scanner (System.in);
        System.out.print("Digite o cpf:");
        String cpf = cin.next();
        System.out.println("Digite o nome: ");
        String nome = cin.next();
        System.out.println("Digite o telefone: ");
        String telefone = cin.next();
        System.out.println("Insira o email:");
        String email = cin.next();
        Contato c = new Contato(cpf,nome,telefone,email);
        agenda.incluirContato(c );
    }
    public void telaExcluirContato() {
        System.out.println("Insira o cpf");
        String cpf = cin.next();
        Contato c = agenda.pesquisarContato(cpf);
        if( c != null) {
            agenda.excluirContato(c);
        }
    }

    public void telaPesquisarContato(){
        System.out.println("Insira o cpf");
        String cpf = cin.next();
        Contato c = agenda.pesquisarContato(cpf);
        if( c != null) {
            System.out.println(c.toString());;
        }
    }

    public void telaListarContato(){
        ArrayList<Contato> retornoAgenda;
        retornoAgenda = agenda.listarContatos();
        for (Contato c : retornoAgenda) {
            System.out.println(c.toString());
        }
    }

    /* universidade.pesquisarDepartamento( ).adicionarProfessor();
       universidade.pesquisarDepartamento( ).excluirProfessor();
     */

}