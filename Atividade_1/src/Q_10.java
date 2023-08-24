import java.util.Scanner;

public class Q_10 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        float dist, tempo;
        System.out.println("Insira uma distância em km e o tempo percorrido em horas");
        dist= cin.nextFloat();
        tempo= cin.nextFloat();
        System.out.printf("A velocidade média é %.2fkm/h",dist/tempo);
        cin.close();
    }
}
