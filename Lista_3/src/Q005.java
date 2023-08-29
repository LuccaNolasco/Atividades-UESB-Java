import java.util.Scanner;

public class Q005{
    public static void main(String[]args){
        int num,fat=1,aux;
        Scanner cin=new Scanner(System.in);
        System.out.println("Insira um valor inteiro positvo para ver seu fatorial");
        num= cin.nextInt();
        aux=num;
        while(aux>0){
            fat*=aux;
            aux--;
        }
        if (num==0){
            System.out.println("Fatorial = 1");
        } else if(num<0){
            System.out.println("Número negativo inserido");
        } else{
            System.out.printf("Fatorial de %d é %d",num,fat);
        }
        cin.close();
    }
}