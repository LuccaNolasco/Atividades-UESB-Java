package Apps;

public class App_001 {
	public static void main(String[] args) {
		int inteiros[] = {2,9,2,1,2,7,2,2,2,2};
		int soma=0;
		for (int i=0;i<inteiros.length; i++) {
			soma+=inteiros[i];
		}
		System.out.println("A soma dos valores desse vetor eh : "+ soma);
	}
}
