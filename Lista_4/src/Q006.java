import java.util.Scanner;
public class Q006{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s1;
        int cont=0;
        char let;
        System.out.println("Insira uma string");
        s1=cin.nextLine();
        System.out.println("Insira qual letra deseja saber a quantidade");
        let=cin.next().charAt(0);
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==let){
                cont++;
            }
        }
        System.out.printf("A quantidade de vezes que '%c' aparece nessa string é %d",let,cont);
        cin.close();
    }
}