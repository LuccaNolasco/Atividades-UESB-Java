import java.util.Scanner;

public class Q004{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s1;
        int cont=0;
        System.out.println("Insira uma frase ou sentença");
        s1= cin.nextLine();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='a' ||s1.charAt(i)== 'A' || s1.charAt(i)=='e' ||s1.charAt(i)== 'E' || s1.charAt(i)=='i' ||s1.charAt(i)== 'I' || s1.charAt(i)=='o' ||s1.charAt(i)== 'O' || s1.charAt(i)=='u' ||s1.charAt(i)== 'U'){
                cont++;
            }
        }
        System.out.printf("A string %s possui %d vogais sem acento",s1,cont);
        cin.close();
    }
}
