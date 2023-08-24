import java.util.*;
public class Q_3 {
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);
        float t1,t2;
        System.out.println("Insira uma temperatura em graus Celsius:");
        t1= cin.nextFloat();
        t2=(t1* 9/5) + 32;
        System.out.printf("%f° Celsius são %f° Fahrenheit",t1,t2);

    }
}

