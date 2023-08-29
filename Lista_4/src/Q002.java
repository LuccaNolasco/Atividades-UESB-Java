import java.util.Scanner;

public class Q002{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s1,s2="";
        System.out.println("Insira uma frase ou sentença");
        s1= cin.nextLine();
        for(int i=1;i<=s1.length();i++){
            s2+=s1.charAt(s1.length()-i);
        }
        System.out.printf("Sua sentença '%s' ao contrário é '%s'",s1,s2);
        cin.close();
    }
}