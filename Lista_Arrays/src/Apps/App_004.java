package Apps;

public class App_004 {
	public static void main(String[] args) {
		int vec []= {1,1,2,3,4,5,1,1,7,8,9,10,11,11,1,2,13};
		int quant=0;
		
		for (int i =0;i<vec.length;i++) {
			if (vec[i]==1) {
				quant++;
			}
		}
		System.out.println("A quantidade de vezes que 1 aparece no vetor eh " + quant );
		quant=0;
		for (int i =0;i<vec.length;i++) {
			if (vec[i]==11) {
				quant++;
			}
		}
		System.out.println("A quantidade de vezes que 11 aparece no vetor eh " + quant );
		
	}
}
