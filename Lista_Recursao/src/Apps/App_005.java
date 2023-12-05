package Apps;
import java.util.Scanner;

public class App_005 {

    public static void main(String[] args) {
        String testString = "A man a plan a canal Panama";
        boolean result = isPalindrome(testString);
        if (result) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Remove espaços em branco e converta para minúsculas para evitar diferenças de caso e espaços.
        str = str.replaceAll("\\s", "").toLowerCase();
        // Chama a função auxiliar recursiva para verificar se a string é um palíndromo.
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeRecursive(String str, int start, int end) {
        // Caso base: se a string tiver 0 ou 1 caractere, ela é um palíndromo.
        if (start >= end) {
            return true;
        }
        // Verifica se os caracteres nos extremos da string são iguais.
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Chama a função recursiva para verificar os caracteres internos da string.
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

}

