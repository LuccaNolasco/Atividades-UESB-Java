import java.util.Scanner;

public class Q_6 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        float m;
        System.out.println("Insira um valor em m:");
        m= cin.nextFloat();
        System.out.printf("%.2fm equivale a %.1fcm e %.1fmm",m,m*100,m*1000);
        cin.close();
    }
}
