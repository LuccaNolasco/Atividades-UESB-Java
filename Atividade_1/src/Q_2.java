import java.util.*;
public class Q_2 {
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);
        int a,b,c;
        float media;
        System.out.println("Insira as três notas do aluno");
        a= cin.nextInt();
        b= cin.nextInt();
        c= cin.nextInt();
        media=((float) a+b+c)/3;
        System.out.printf("A média aritmética foi %f",media);
    }
}
