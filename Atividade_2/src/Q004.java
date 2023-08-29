import java.util.Scanner;

public class Q004{
    public static void main (String[]args){
        Scanner cin=new Scanner(System.in);
        int age;
        System.out.println("Insira sua idade");
        age= cin.nextInt();
        if (age>=0 && age<12) {
            System.out.println("Tu és uma criança");
        } else if(age>=12 && age<18){
            System.out.println("Tu és um adolescente");
        } else if(age>=18 && age<60){
            System.out.println("Tu és um adulto");
        } else{
            System.out.println("Tu és idoso");
        }
        cin.close();
    }

}
