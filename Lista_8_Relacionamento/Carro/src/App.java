public class App {
    public static void main(String[] args) {
       /* Montagem m = new Montagem();
        m.menuMont();

        */

        Teste t = new Teste("Teste1","1");

        Teste t2 = new Teste ("Teste2","1");

        Teste t3 = new Teste ("Teste 3","2");
        System.out.println(t.getNome()+t.getId());
        System.out.println(t2.getNome()+t2.getId());
        System.out.println(t3.getNome()+t3.getId());
    }
}
