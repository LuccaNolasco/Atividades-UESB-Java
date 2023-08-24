import java.util.Scanner;

public class Q_8 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        float hora,valor;
        System.out.println("Insira as suas horas trabalhadas e o valor por hora, em reais");
        hora= cin.nextFloat();
        valor= cin.nextFloat();
        System.out.printf("Seu salário nesse mês foi R$%.2f",hora*valor);
        cin.close();
    }
}
