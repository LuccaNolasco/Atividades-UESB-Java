package Apps;

public class App_002 {

    public static void main(String[] args) {
        int n = 10; // Substitua 10 pelo valor de n que você deseja calcular
        int resultado = fibonacci(n);
        System.out.println("O " + n + "-ésimo número da sequência de Fibonacci é " + resultado + ".");
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}


