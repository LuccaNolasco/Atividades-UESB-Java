package Apps;
import java.util.Scanner;

public class App_009 {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        System.out.println("Insira o tamanho do seu array");
        int tam = cin.nextInt();
        int maior,menor;
        int vec[]= new int [tam];
        System.out.printf("Elemento 0: ");
        vec[0]=cin.nextInt();
        maior=vec[0];
        menor=vec[0];
        for(int i=1;i<vec.length;i++){
            System.out.printf("Elemento %d : ",i);
            vec[i]=cin.nextInt();
            if(vec[i]<menor){
                menor=vec[i];
            }
            if(vec[i]>maior){
                maior=vec[i];
            }
        }

        System.out.printf("O maior elemento é %d e o menor é %d",maior, menor);

        cin.close();
    }
}
