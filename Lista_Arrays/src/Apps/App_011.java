package Apps;
import Classes.Restaurante;
import java.util.Scanner;

public class App_011 {
    public static void main (String []args){
        Scanner scan = new Scanner (System.in);
        Restaurante restaurante[] = new Restaurante [3];
        String opcao;
        int tam=3;

        for(int i=0;i<tam;i++){
            restaurante[i] = new Restaurante();
            System.out.printf("Qual o nome do restaurante %d?\n",i+1);
            restaurante[i].setNome(scan.nextLine());
            System.out.printf("Qual a comida do restaurante %d?\n",i+1);
            restaurante[i].setComida(scan.nextLine());
            System.out.printf("Insira o preço medio do restaurante %d: ", i+1);
            restaurante[i].setPrecoMedio(scan.nextDouble());
            scan.nextLine();//consumir o enter do scanDouble
        }

        System.out.printf("Qual tipo de comida deseja?");
        opcao= scan.nextLine().toLowerCase();

        for (int i=0;i<tam;i++){
            if(opcao.equals(restaurante[i].getComida())){
                System.out.println(restaurante[i]);
            }
        }
        scan.close();
    }
}
