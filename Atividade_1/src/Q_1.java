import java.util.*;
public class Q_1 {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        int num1,num2;
        System.out.println("Insira dois números:");
        num1=cin.nextInt();
        num2= cin.nextInt();
        num1=num1+num2;
        System.out.printf("A soma dos valores é %d", num1);
    }
}
