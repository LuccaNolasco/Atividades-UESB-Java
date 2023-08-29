import java.util.Scanner;

public class Q006 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float nota;
        System.out.println("Insira sua nota");
        nota = cin.nextFloat();
        if (nota >= 7) {
            System.out.printf("Com nota %.2f, foi aprovado",nota);
        } else
            System.out.printf("Com nota %.2f, foi reprovado",nota);
            cin.close();


    }
}