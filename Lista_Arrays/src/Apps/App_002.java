package Apps;

import java.util.Arrays;

public class App_002 {
	public static void main(String[] args) {
		double maior;
		double vecD []= {0.56, 0.14, 0.5, 28.90, 50, 72, -98};
		
		maior = vecD[0];
		for (int i = 1; i<vecD.length; i++) {
			if (vecD[i]>maior) {
				maior=vecD[i];
			}
		}
	
		System.out.printf("O maior vetor do array %s eh %.2f",Arrays.toString(vecD), maior);
	}
}
