import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        double a, b ,c;
        double[] raizes = new double[2];
        System.out.println("Insira os coeficientes a, b e c de sua função");
        a=cin.nextDouble();
        b=cin.nextDouble();
        c=cin.nextDouble();

        Funcao2Grau f1 = new Funcao2Grau(a,b,c);

        raizes=f1.raiz();
        System.out.printf("As raízes são %.2f e %.2f", raizes[0],raizes[1]);
        cin.close();
    }
}