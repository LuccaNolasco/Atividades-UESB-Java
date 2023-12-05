import java.util.ArrayList;
import java.util.Scanner;
public class DepartamentoUI {
    private Departamento departamento;
    Scanner cin = new Scanner (System.in);


    public DepartamentoUI(){
        departamento = new Departamento();
    }


    public void menuDept(Departamento dept){
        int opcao = 0;
        while (opcao!=5){
            System.out.println("1 - Buscar Professor");
            System.out.println("2 - Incluir Professor");
            System.out.println("3 - Remover Professor");
            System.out.println("4 - Listar Professores");
            System.out.println("5 - Finalizar");
            System.out.println("Sua opção: ");
            opcao=cin.nextInt();
            cin.nextLine();

            switch (opcao){
                case 1:
                    telaBuscaProf(dept);
                    break;
                case 2:
                    telaIncluirProf(dept);
                    break;
                case 3:
                    telaRemoveProf(dept);
                    break;
                case 4:
                    telaListarProf(dept);
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }

    public void telaBuscaProf(Departamento departamento){
        System.out.print("Insira o cpf: ");
        String cpf = cin.nextLine();
        Professor p = departamento.searchProf(cpf);
        if (p!=null){
            System.out.println(p.toString());
        }
    }

    public void telaIncluirProf(Departamento departamento){
        System.out.println("Insira o nome");
        String nome = cin.nextLine();
        System.out.println("Insira o cpf");
        String cpf = cin.next();
        System.out.println("Insira a materia");
        String materia = cin.next();
        Professor p = new Professor (nome, cpf, materia);
        if (departamento.searchProf(cpf)==null){
            departamento.incluiProf(p);
        }
    }

    public void telaRemoveProf(Departamento departamento){
        System.out.println("Insira o cpf do professor");
        String cpf = cin.next();
        Professor p = departamento.searchProf(cpf);
        if (p!= null){
            departamento.removeProf(p);
        }
    }

    public void telaListarProf(Departamento departamento){
        ArrayList <Professor> retornoProf;
        retornoProf = departamento.returnProf();
        for (Professor p:retornoProf){
            System.out.println(p.toString());
        }
    }
}
