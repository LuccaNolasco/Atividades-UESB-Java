package Apps;
import java.util.Scanner;
public class App_007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro");
        int num = scan.nextInt();
        System.out.printf("A quantidade de algarismos de %d é %d", num, conta(num,0));
        scan.close();
    }

    public static int conta(int num,int soma){
        if (num == 0) {
            return soma;
        } else{
           return conta(num/10,++soma);
        }
    }
}
