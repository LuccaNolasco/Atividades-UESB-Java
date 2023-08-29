import java.util.Scanner;

public class Q007{
    public static void main (String[]args){
        Scanner cin=new Scanner(System.in);
        float x,y;
        System.out.println("Insira as coordenadas X e Y do seu ponto, nessa ordem");
        x=cin.nextFloat();
        y= cin.nextFloat();
        if(x==0 && y==0){
            System.out.println("Ponto na origem");
        } else if(x>=0){
            if(y>0){
                System.out.println("Primeiro quadrante");
            } else{
                System.out.println("Quarto quadrante");
            }
        } else{
            if(y>0){
                System.out.println("Segundo quadrante");
            } else{
                System.out.println("Terceiro quadrante");
            }
        }
        cin.close();
    }

}