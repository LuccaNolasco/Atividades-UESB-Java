package Apps;

public class App_003 {
	public static void main(String[] args) {
		double media=0;
		double vec []= {2.33, 4, 5, 6 ,7.4, -3.25};
		for (int i = 0; i<vec.length;i++) {
			media+=vec[i];
		}
		media=media/vec.length;
		System.out.printf("A media desses valores eh %.4f",media);
	}
}
