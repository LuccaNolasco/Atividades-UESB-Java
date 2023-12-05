package Apps;
import java.util.Scanner;
public class App_004 {
	public static void main(String[] args) {
		Scanner cin = new Scanner (System.in);
		int x;
		System.out.println("Insira um valor positivo para saber a soma de seus algarismos");
		x=cin.nextInt();
		if (x<0) {
			System.out.println("Valor negativo!");
		} else {
			System.out.printf("A soma dos algarismos de %d eh  %d", x, somaDigito(x));
		}
		
		cin.close();
	}
	
	public static int somaDigito(int x) {
		
		if ((x /10)<=0) { // ou (x%10)==x
			return x;
		}
		else {
			
			return x % 10 + somaDigito(x/10); 
		}
	}
}
