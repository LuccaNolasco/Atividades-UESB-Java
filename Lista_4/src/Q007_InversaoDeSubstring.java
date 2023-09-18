import java.util.Scanner;
public class Q007 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s1,s2="";
        int p1,p2;
        System.out.println("Insira uma string a ser invertida");
        s1= cin.nextLine();
        System.out.println("Insira o primeiro indice:");
        p1= cin.nextInt();
        System.out.println("Insira o segundo indice:");
        p2= cin.nextInt();
        for(int i=p2;i>=p1;i--){
            s2+=s1.charAt(i);
        }
        System.out.printf("Invertida do índice %d ao índice %d: %s",p1,p2,s2);
        cin.close();
    }
}