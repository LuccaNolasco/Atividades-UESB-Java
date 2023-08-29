import java.util.Scanner;

public class Q003{
    public static void main (String[]args){
        Scanner cin=new Scanner(System.in);
        int n;
        System.out.println("Insira um valor");
        n= cin.nextInt();
        if (n%2==0){
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
        cin.close();
    }

}