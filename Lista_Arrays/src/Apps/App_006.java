package Apps;
import java.lang.reflect.Array;
import java.util.Scanner;
public class App_006 {
	public static void main(String[] args) {
		Scanner cin = new Scanner (System.in);
		int tam;
		System.out.println("Insira o tamanho das matrizes quadradas que deseja calcular");
		tam=cin.nextInt();
		double mat1[][] = new double [tam][tam];
		double mat2[][] = new double [tam][tam];
		double mat3[][] = new double [tam][tam];

		
		double soma=0, prod;

		for (int i=0;i<mat1.length;i++){
			for(int j=0; j<mat1[i].length;j++){
				System.out.printf("Matriz 1. Insira o elemento da linha %d e coluna %d: ",i,j);
				mat1[i][j]=cin.nextDouble();
			}
		}

		for (int i=0;i< mat2.length;i++){
			for(int j=0;j<mat2[i].length;j++){
				System.out.printf("Matriz 2. Insira o elemento da linha %d e coluna %d: ",i,j);
				mat2[i][j]=cin.nextDouble();
			}
		}

		for(int i=0;i<mat3.length;i++){
			for(int j=0;j<mat3[i].length;j++){
				prod=0;
				for(int z=0;z<mat3[i].length;z++) {
					prod += mat1[i][z] * mat2[z][j];
					mat3[i][j]=prod;
				}
			}
		}


		for (int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				System.out.printf("%10.2f",mat3[i][j]);
			}
			System.out.println();
		}
		
		cin.close();
	}
}
/*for (int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				mat3[i][j]+=mat1[i][j]*mat2[i][j];
			}
		}*/