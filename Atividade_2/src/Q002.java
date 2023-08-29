import java.util.Scanner;

public class Q002{
    public static void main (String[]args){
        Scanner cin=new Scanner(System.in);
        int n,m;
        System.out.println("Insira dois valores inteiros");
        n= cin.nextInt();
        m= cin.nextInt();
        if(m>n){
            System.out.printf("%d é maior que %d\n",m,n);
        } else if(n>m){
            System.out.printf("%d é maior que %d\n",n,m);
        } else{
            System.out.println("São valores iguais");
        }

        cin.close();
    }

}