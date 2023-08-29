import java.util.Scanner;
import static java.lang.Character.isUpperCase;

public class Q009 {
    public static void main(String[] args) {
        String frase;
        int cont=0;
        Scanner cin = new Scanner(System.in);
        System.out.println("Insira uma frase, contaremos quantas lentras são maiúsculas");
        frase=cin.nextLine();
        for(int i=0;i<frase.length();i++){
            if(isUpperCase(frase.charAt(i))){
              cont++;
            }
        }
        System.out.printf("A quantidade de maiúsculas em %s é %d",frase,cont);
        cin.close();
    }
}