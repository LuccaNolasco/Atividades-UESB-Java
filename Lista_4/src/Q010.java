import java.util.Scanner;
public class Q010 {
    public static void main(String[]args){
        Scanner cin =new Scanner (System.in);
        String nome,email="";
        String partes[];

        System.out.print("Insira seu nome: ");
        nome=cin.nextLine();
        partes=nome.split(" ");

        if(partes.length>1) {
            for (int i = 0; i < partes.length; i++) {
                email += partes[i].charAt(0);
            }
            email+="@empresa.com.br";
            email=email.toLowerCase();
        } else{
            System.out.println("Insira o nome completo");
        }

        System.out.printf("Seu email institucional é: %s",email);

        cin.close();
    }
}
