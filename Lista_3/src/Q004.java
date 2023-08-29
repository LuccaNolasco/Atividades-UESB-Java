import java.util.Scanner;

public class Q004{
    public static void main(String[]args){
        int num;
        Scanner cin=new Scanner(System.in);
        System.out.println("Insira um valor inteiro para ver sua tabuada do 1 ao 10");
        num= cin.nextInt();
        for(int i=1;i<=10;i++)
            System.out.printf("%d x %d = %d\n",num,i,num*i);

        cin.close();
    }
}