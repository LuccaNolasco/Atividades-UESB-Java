package Apps;
import java.util.Scanner;
public class App_009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int tam=5;
        System.out.println("Insira valores inteiros para um vetor de  " +tam+ " casas");
        int vec []= new int [tam];
        for(int i=0;i<tam;i++){
            vec[i]=scan.nextInt();
        }
        System.out.printf("A soma dos valores no vetor é %d", somaVec(vec,0,tam-1));
        scan.close();
    }

    public static int somaVec(int vec[],int soma,int tam){
        if(tam<0){
            return soma;
        } else{
            soma+=vec[tam];
            return somaVec(vec,soma,--tam);
        }
    }
}
