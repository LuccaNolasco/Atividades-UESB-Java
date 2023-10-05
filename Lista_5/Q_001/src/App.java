import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner cin = new Scanner(System.in);
        System.out.println("Insira o nome e a idade da pessoa 1");
        nome=cin.nextLine();
        idade= cin.nextInt();
        Pessoa p1=new Pessoa(nome,idade);
        cin.nextLine();

        System.out.println("Insira o nome e a idade da pessoa 2");
        nome=cin.nextLine();
        idade= cin.nextInt();
        Pessoa p2=new Pessoa(nome,idade);
        cin.nextLine();


        System.out.println("Insira o nome e a idade da pessoa 3");
        nome=cin.nextLine();
        idade= cin.nextInt();
        Pessoa p3=new Pessoa(nome,idade);
        cin.nextLine();


        System.out.println("Insira o nome e a idade da pessoa 4");
        nome=cin.nextLine();
        idade= cin.nextInt();
        Pessoa p4=new Pessoa(nome,idade);
        cin.nextLine();


        System.out.println("Insira o nome e a idade da pessoa 5");
        nome=cin.nextLine();
        idade= cin.nextInt();
        Pessoa p5=new Pessoa(nome,idade);
        cin.nextLine();


        System.out.println("Insira o novo nome de p2");
        nome= cin.nextLine();
        p2.setNome(nome);

        System.out.printf("Nome de p1: %s\nIdade de P1:%d\n\n",p1.getNome(),p1.getIdade());
        System.out.printf("Nome de p2: %s\nIdade de P2:%d\n\n",p2.getNome(),p2.getIdade());
        System.out.printf("Nome de p3: %s\nIdade de P3:%d\n\n",p3.getNome(),p3.getIdade());
        System.out.printf("Nome de p4: %s\nIdade de P4:%d\n\n",p4.getNome(),p4.getIdade());
        System.out.printf("Nome de p5: %s\nIdade de P5:%d\n\n",p5.getNome(),p5.getIdade());

    }
}