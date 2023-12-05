package Apps;

public class App_008 {
    public static String reverseString(String input) {
        if (input.isEmpty()) {
            return input;
        } else {
            char firstChar = input.charAt(0);
            String restOfString = input.substring(1);
            String reversedRest = reverseString(restOfString);
            return reversedRest + firstChar;
        }
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println("String original: " + originalString);
        System.out.println("String invertida: " + reversedString);
    }
}
