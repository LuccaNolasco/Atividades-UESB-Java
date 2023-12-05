package Apps;

import java.util.Scanner;
public class App_001 {
	public static void main(String[]args) {
		Scanner cin = new Scanner (System.in);
		long n;
		System.out.println("Insira o valor positivo que deseja descobrir o fatorial");
		n = cin.nextLong();
		if (n<0) {
			System.out.println("Esse valor eh negativo!");
		} else {
			System.out.printf("O fatorial de %d eh: %d", n, fat(n));
		}
		cin.close();
	}
	
	public static long fat(long x) {
		if (x==0) {
			return 1;
		} else {
			return x*fat(x-1);
		}
		
	}

}

