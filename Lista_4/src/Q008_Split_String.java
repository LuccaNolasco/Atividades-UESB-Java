import java.util.Scanner;

public class Q008_Split_String {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String frase;
        String[] s2;
        System.out.println("Insira uma frase com espaços a ser separada");
        frase= cin.nextLine();
        s2=frase.split(" ");
        for(int i=0;i<s2.length;i++){
            System.out.println(s2[i]);
        }
        cin.close();
    }
}
