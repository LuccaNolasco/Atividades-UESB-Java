package Apps;

import java.util.Scanner;

public class App_010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int tam=5,maior,menor;
        System.out.println("Insira valores inteiros para um vetor de  " +tam+ " casas");
        int vec []= new int [tam];
        for(int i=0;i<tam;i++){
            vec[i]=scan.nextInt();
        }
        maior=vec[0];
        System.out.printf("O maior valor é %d",calcMaior(vec,maior,0));
        scan.close();
    }

    public static int calcMaior(int vec[],int maior,int tam){
        if(tam==vec.length){
            return maior;
        } else{
            if (vec[tam]>maior){
                maior=vec[tam];
            }
            tam++;
            return calcMaior(vec,maior,tam++);
        }
    }
}
