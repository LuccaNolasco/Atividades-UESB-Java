import java.util.Scanner;

public class Q007{
    public static void main(String[]args){
        int num,teste=0;
        Scanner cin=new Scanner(System.in);
        System.out.println("Insira um valor inteiro");
        num= cin.nextInt();
        for(int i=num-1; i>0;i--){
            if(num % i ==0){
                teste++;
            }
        }
        if(teste==1){
            System.out.printf("%d é primo!",num);
        } else{
            System.out.printf("%d não é primo",num);
        }
    }
}