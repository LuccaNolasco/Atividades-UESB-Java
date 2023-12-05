package Apps;
import java.util.Scanner;
public class App_003 {
	public static void main(String[] args) {
		Scanner cin = new Scanner (System.in);
		long x, y;
		System.out.println("Insira um valor");
		x=cin.nextLong();
		System.out.println("Insira um expoente positivo");
		y=cin.nextLong();
		if (y<0) {
			System.out.println("Esse expoente eh negativo!");
		} else {
			System.out.printf("%d elevado a %d = %d ",x , y, pot(x , y));
		}
		cin.close();
	}
	public static long pot(long x, long y) {
		if (y==0) {
			return 1;
		} else {
			return x*pot(x , y-1);
		}
	}
}
