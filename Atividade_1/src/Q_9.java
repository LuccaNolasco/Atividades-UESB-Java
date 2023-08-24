import java.util.Scanner;

public class Q_9 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        float dolar,taxa;
        String moeda;
        System.out.print("Insira um valor em U$");
        dolar=cin.nextFloat();
        System.out.print("Para qual moeda deseja converter? ");
        moeda= cin.next();
        System.out.printf("Insira a taxa de conversão multiplicativa: ");
        taxa= cin.nextFloat();
        System.out.printf("U$%.2f em %s são $%.2f",dolar,moeda,dolar*taxa);
        cin.close();
    }
}
