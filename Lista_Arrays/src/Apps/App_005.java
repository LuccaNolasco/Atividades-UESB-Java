package Apps;

public class App_005 {
	public static void main(String[] args) {
		int mat [][]= {{1,2,3,4},{4,5,6},{7,8,9}};
		int soma=0;
		for (int i=0; i<mat.length ;i++) {
			for (int j=0 ; j <mat[i].length ;j++) {
				soma+=mat[i][j];
			}
			System.out.printf("A soma da linha %d eh %d\n", i, soma);
			soma=0;
		}
		
	}
}
