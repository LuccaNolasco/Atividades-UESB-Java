public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Flakas", "2217", 9.78, 9.10,10.0 );
        Aluno a2 = new Aluno("Rusb", "Jambo", 7.8, 10.0, 10.0);
        Aluno a3 = new Aluno("Tess Tickles", "9308519", 5.56, 6.0, 10.0);
        System.out.printf("Média de %s, de matrícula %s  = %.2f\n",a1.getNome(), a1.getMatricula() ,a1.media());
        System.out.printf("Média de %s, de matrícula %s  = %.2f\n",a2.getNome(), a2.getMatricula() ,a2.media());
        System.out.printf("Média de %s, de matrícula %s  = %.2f\n",a3.getNome(), a3.getMatricula() ,a3.media());

    }
}
