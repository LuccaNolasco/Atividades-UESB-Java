import java.util.Scanner;

public class Q003{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s1,s2="";
        System.out.println("Insira uma frase ou sentença");
        s1= cin.nextLine();
        for(int i=1;i<=s1.length();i++){
            s2+=s1.charAt(s1.length()-i);
        }
        if(s1.equals(s2)){
            System.out.println("É um palíndromo!");
            System.out.println(s2);
        } else{
            System.out.println("Não são palíndromos");
            System.out.println(s2);
        }

    }
}