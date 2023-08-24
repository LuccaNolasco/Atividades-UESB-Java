import java.util.Scanner;

public class Q_5 {
    public static void main(String[]args){
        Scanner cin = new Scanner(System.in);
        float peso, altura;
        System.out.println("Insira o seu peso em kg, e sua altura em metros:");
        peso= cin.nextFloat();
        altura=cin.nextFloat();
        peso=(peso/(altura*altura));
        System.out.printf("Seu imc é %f",peso);
        cin.close();
    }
}
