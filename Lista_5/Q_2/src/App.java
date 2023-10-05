public class App {
    public static void main(String[] args) {
        Livro l1 = new Livro ( 200, "Jorge George", "História de Gorge");
        Livro l2 = new Livro (389, "Flakas Power", "Apostando no Vasco");
        Livro l3 = new Livro (1897, "Franco Borba", "Errei fui muleque");
        Livro l4 = new Livro (570, "João Pedrão", "Limão Bonzão");
        Livro l5 = new Livro (367, "Flaulles Victory", "Provando Calculus");

        String novo_nome="Vascaíno até murrer";
        l2.setNome(novo_nome);

        System.out.printf("Livro 1: %s\nAutor:%s\nNúmero de Pág:%d\n\n",l1.getNome(),l1.getAut(),l1.getPag());
        System.out.printf("Livro 2: %s\nAutor:%s\nNúmero de Pág:%d\n\n",l2.getNome(),l2.getAut(),l2.getPag());
        System.out.printf("Livro 3: %s\nAutor:%s\nNúmero de Pág:%d\n\n",l3.getNome(),l3.getAut(),l3.getPag());
        System.out.printf("Livro 4: %s\nAutor:%s\nNúmero de Pág:%d\n\n",l4.getNome(),l4.getAut(),l4.getPag());
        System.out.printf("Livro 5: %s\nAutor:%s\nNúmero de Pág:%d\n\n",l5.getNome(),l5.getAut(),l5.getPag());

    }
}
