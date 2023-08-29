import java.util.Scanner;

public class Q008 {
    public static void main (String[]args){
        Scanner cin=new Scanner(System.in);
        float l1,l2,l3;
        boolean teste=false;
        System.out.println("Insira os três lados do seu triângulo");
        l1= cin.nextFloat();
        l2= cin.nextFloat();
        l3= cin.nextFloat();

        if(l1>Math.abs(l2-l3) && l1<l2+l3){
            teste=true;
        }
        if(l2>Math.abs(l1-l3) && l2<l1+l3){
            teste=true;
        }
        if(l3>Math.abs(l2-l1) && l3<l2+l1){
            teste=true;
        }

        if(teste){
            if(l1==l2 && l1==l3){
                System.out.println("É um triângulo equilátero");
            } else if(l1!=l2 && l1!=l3 && l2!=l3 ){
                System.out.println("É um triângulo escaleno");
            } else{
                System.out.println("É isóceles");
            }

        } else{
            System.out.println("Esses valores não formam triângulo");
        }

        cin.close();
    }
}
