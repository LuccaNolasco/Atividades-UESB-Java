import java.util.Scanner;

public class Q001{
    public static void main (String[]args){
        Scanner cin=new Scanner(System.in);
        int n;
        System.out.println("Insira um valor");
        n= cin.nextInt();
        if (n>0){
            System.out.println("É postivo");
        } else if (n<0){
            System.out.println("É negativo");
        } else{
            System.out.println("É zero");
        }
        cin.close();
    }

}