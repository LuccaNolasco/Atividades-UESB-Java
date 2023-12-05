import java.util.Scanner;
import java.util.ArrayList;
public class UniversidadeUI {

    private Universidade universidade;
    private DepartamentoUI deptUI;

    Scanner cin = new Scanner (System.in);

    public UniversidadeUI() {
        universidade = new Universidade();
        deptUI= new DepartamentoUI();
    }

    public void menuUni(){
        int option = 0;
        while (option!=5){
            System.out.println("1 - Acessar Departamento");
            System.out.println("2 - Incluir Departamento");
            System.out.println("3 - Excluir Departamento");
            System.out.println("4 - Listar Departamentos");
            System.out.println("5 - Sair");
            System.out.println("Sua opção: ");
            option= cin.nextInt();
            cin.nextLine();
            switch (option){
                case 1:
                    telaAcessarDept();
                    break;
                case 2:
                    telaIncluirDept();
                    break;
                case 3:
                    telaExcluirDept();
                    break;
                case 4:
                    telaListarDept();
                    break;
                case 5:
                    cin.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    public void telaAcessarDept(){
        System.out.println("Insira o nome:");
        String nomeDpt = cin.nextLine();
        Departamento d = universidade.searchDept(nomeDpt);
        if (d!=null){
            deptUI.menuDept(d);
        }
    }

    public void telaIncluirDept(){
        System.out.print("Insira o nome do Departamento: ");
        String nome = cin.nextLine();
        Departamento d = new Departamento(nome);
        if (universidade.searchDept(nome)==null){
            universidade.incluirDept(d);
        }
    }

    public void telaExcluirDept(){
        System.out.println("Insira o nome do dpt");
        String nome = cin.nextLine();
        Departamento d = new Departamento(nome);
        if(d!=null){
            universidade.removeDept(d);
        }
    }

    public void telaListarDept(){
        ArrayList<Departamento> retornoDept;
        retornoDept = universidade.returnDept();
        for (Departamento d: retornoDept){
            System.out.println(d.toString());
        }
    }

}
