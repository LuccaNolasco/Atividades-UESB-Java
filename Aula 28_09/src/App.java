import java.util.ArrayList;
import java.util.Scanner;
public class App {
	
	public static void main(String[]args) {
		Scanner cin= new Scanner (System.in);
		
		String nome;
		int idade;
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		
		for (int i = 0; i<5;i++) {
			System.out.println("Insila o nome , cidadao");
			nome=cin.nextLine();
			System.out.println("Insila a idade");
			idade=cin.nextInt();

			pessoas.add(new Pessoa (nome,idade));
		
		}
		
		

		
		double incremento;
		char resp;
		
		
		pessoas.get(0).getNome();
		
		System.out.println("Nome: "+p1.getNome() + " Credito Social: "+ p1.getSocCred());
		/*System.out.println("Insira um incremento ou decremento de Credito Social");
		incremento=cin.nextDouble();
		*/
		
		
		System.out.println(p1.getNome()+ " da o popoti? y/n");
		resp=cin.next().charAt(0);
			if (resp == 'y') {
				p1.transferirCredito(p2);
			}
		
		System.out.println("Nome: "+p1.getNome() + " Credito Social: "+ p1.getSocCred());
		System.out.println("Nome: "+p2.getNome() + " Credito Social: "+ p2.getSocCred());

		//System.out.println(p1);
		
		

		
		cin.close();
	}
}
