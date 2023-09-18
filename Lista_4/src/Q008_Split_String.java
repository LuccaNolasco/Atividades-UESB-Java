import java.util.Scanner;

public class Q008 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String frase;
        String[] s2;
        System.out.println("Insira uma frase com espaços a ser separada");
        frase= cin.nextLine();
        s2=frase.split(" ");
        for(String fraseNova:s2){
            System.out.println(fraseNova);
        }
        cin.close();
    }
}
