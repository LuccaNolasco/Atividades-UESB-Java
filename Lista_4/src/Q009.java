import java.util.Scanner;

public class Q009 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String frase,f2="";
        String partes[];
        char letra1;
        System.out.println("Insira o nome: ");
        frase=cin.nextLine();
        frase=frase.toLowerCase();//para padronizar

        letra1=Character.toUpperCase(frase.charAt(0));
        //Separa a string em vetor
        partes=frase.split(" ");

        //Colocando a primeira letra do nome em maiúsculo, e o resto em minúsculo;
        f2+=letra1;
        f2+=partes[0].substring(1);

        //agora, para adicionar o resto

        for(int i=1;i<partes.length;i++){//começa em 1 pois o primeiro nome já foi colocado
            f2+=" ";
            f2+=partes[i].toUpperCase();
        }

        System.out.printf("Nova formatação: %s",f2);

        cin.close();
    }
}

