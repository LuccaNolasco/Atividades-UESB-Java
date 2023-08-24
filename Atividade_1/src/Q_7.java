import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q_7 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        float dist,vm;
        System.out.println("Insira a distância em km, e a velocidade em km/h:");
        dist= cin.nextFloat();
        vm= cin.nextFloat();
        dist=dist/vm;
        System.out.printf("O tempo estimado de viagem é de %.2f hora(s)",dist);
        cin.close();
    }
}
