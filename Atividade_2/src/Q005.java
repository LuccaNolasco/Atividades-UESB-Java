import java.util.Scanner;

public class Q005{
    public static void main (String[]args){
        Scanner cin=new Scanner(System.in);
        char let;
        System.out.println("Insira uma letra");
        let=cin.next().charAt(0);
        switch(let){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("É uma vogal");
                break;
            default:
                System.out.println("É uma consoante");
        }
        cin.close();
    }

}