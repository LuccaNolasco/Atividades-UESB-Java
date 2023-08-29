import java.util.Scanner;

public class Q001{
        public static void main(String[]args){
            Scanner cin=new Scanner(System.in);
            String frase;
            System.out.println("Insira uma palavra ou sentença");
            frase= cin.nextLine();
            System.out.printf("Sua string '%s' possui %d caracteres, incluindo espaços ",frase,frase.length());
        }
}