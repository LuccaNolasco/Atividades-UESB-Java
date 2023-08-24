import java.util.*;
public class Q_4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float preco, desconto;
        System.out.print("Insira o preço do produto: R$");
        preco = cin.nextFloat();
        System.out.print("Insira o percentual de desconto: ");
        desconto = cin.nextFloat();
        preco = preco * desconto / 100;
        System.out.printf("O preço final é R$%f", preco);
        cin.close();
    }
}