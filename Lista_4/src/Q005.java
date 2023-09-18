import java.util.Scanner;

public class Q005{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s1;
        System.out.println("Insira uma string");
        s1= cin.nextLine();
        String after = s1.replaceAll(" +", " ");
        System.out.println(after);
        cin.close();
    }
}