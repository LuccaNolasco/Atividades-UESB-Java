import java.util.Scanner;

public class Q008{
    public static void main(String[]args){
        int num,cont=0;
        float soma=0;
        Scanner cin=new Scanner(System.in);
        System.out.println("Insira valores para encontrar sua média. Para finalizar, digite 0");
        do{
            num= cin.nextInt();
            soma+=num;
            cont++;
        }while(num!=0);
        soma=(float)soma/(cont-1);
        System.out.printf("A média desses %d números é %f",cont-1,soma);
        cin.close();
    }
}
