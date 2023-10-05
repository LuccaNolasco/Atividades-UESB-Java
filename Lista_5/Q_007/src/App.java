public class App {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("00001",999.89);
        ContaBancaria c2 = new ContaBancaria("00002",55.50);
        ContaBancaria c3 = new ContaBancaria("00003", -50);

        c1.deposito(0.11);
        c2.saque((5.5));
        c3.saque(10.0);

        System.out.printf("Saldo da conta %s: %.2f\n", c1.getNumConta(),c1.getSaldo());
        System.out.printf("Saldo da conta %s: %.2f\n", c2.getNumConta(),c2.getSaldo());
        System.out.printf("Saldo da conta %s: %.2f\n", c3.getNumConta(),c3.getSaldo());
    }
}
