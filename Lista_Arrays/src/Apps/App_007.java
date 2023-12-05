package Apps;
import java.util.Scanner;

public class App_007 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        System.out.println("Insira o tamanho da matriz");
        int tam = cin.nextInt();
        int mat [][]= new int [tam][tam];
        int soma=0;
        //Para diagonal principal

        for (int i=0;i< mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.printf("Linha %d coluna %d: ",i,j);
                mat[i][j]=cin.nextInt();
            }
        }



        for (int i=0;i< mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (i==j){
                    soma+=mat[i][j];
                }
            }
        }
        System.out.printf("A soma da diagonal principal é: %d\n",soma);
        soma=0;
        //Para a diagonal secundária;
        int diaSec=tam+1;
        for (int i=0;i< mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if((i+j+2)==diaSec){
                    soma+=mat[i][j];
                }
            }
        }
        System.out.printf("A soma da diagonal sencundária é: %d\n",soma);
        cin.close();
    }
}
