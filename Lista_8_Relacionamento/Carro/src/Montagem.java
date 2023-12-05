import java.util.ArrayList;
import java.util.Scanner;
public class Montagem {
    private ArrayList <Carro> listaCarro;
    Scanner cin = new Scanner (System.in);

    public Montagem (){
        listaCarro = new ArrayList<Carro>();

    }

    public void menuMont(){
        int option=1;
        while(option!=4){
            System.out.println("---------------------");
            System.out.println("1 - Montar Carro");
            System.out.println("2 - Acessar Carro");
            System.out.println("3 - Listar Carros");
            System.out.println("4 - Fechar Programa");
            System.out.println("---------------------");
            System.out.println("Sua escolha?");
            option = cin.nextInt();
            cin.nextLine();
            switch(option){
                case 1:
                    telaMontaCarro();
                    break;
                case 2:
                    telaAcessarCarro();
                    break;
                case 3:
                    for(Carro c: listaCarro){
                        System.out.println(c.toString());
                    }
                    break;
                case 4:
                    cin.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public Carro buscaCarro(String nome){
        for(Carro c : listaCarro){
            if(c.getNome().equals(nome)){
                return c;
            }
        }
        return null;
    }

    public void addCarro(Carro carro){
        if(buscaCarro(carro.getNome()) == null){
            listaCarro.add(carro);
        }
    }

    public void telaMontaCarro(){
        Carro carro = new Carro();
        System.out.println("-------------------");
        System.out.println("O carro já possui um custo base de 10.000 reais");
        System.out.println("Escolha o pneu:");
        System.out.println(" AEOLUS , 200 reais cada");
        System.out.println(" CONTINENTAL, 350 reais cada");
        System.out.println(" MICHELIN , 530 reais cada");
        System.out.print("Sua escolha: ");
        String pneu = cin.next().toUpperCase();
        Pneu [] listaPneu = new Pneu[4];
        for(int i=0;i<4;i++){
            listaPneu[i]=new Pneu(pneu);
        }
        carro.setPneus(listaPneu);

        System.out.println("-------------------");
        System.out.println("Escolha o motor:");
        System.out.println("Minus, 100 cavalos, 7500 reais ");
        System.out.println("Argus, 250 cavalos, 18900 reais");
        System.out.println("Magnus, 1100 cavalos, 99500 reais");
        System.out.print("Sua escolha: ");
        String marca = cin.next().toUpperCase();
        Motor motor = new Motor(marca);
        carro.setMotor(motor);

        System.out.println("-------------------");
        System.out.println("Escolha os bancos: ");
        System.out.println("Marca Gluteus, Basic: 990 cada, Confort:1950 cada ");
        System.out.println("Marca Beavers, Baseic: 1300 cada, Confort: 3700 cada");
        System.out.print("Sua escolha de marca: ");
        String marcaB=cin.next().toUpperCase();
        System.out.print("Sua escolha de modelo: ");
        String modelo = cin.next().toUpperCase();
        cin.nextLine();
        Banco [] listaBancos = new Banco[5];
        for (int i =0; i<5;i++){
            listaBancos[i]=new Banco(marcaB,modelo);
        }
        carro.setBancos(listaBancos);
        System.out.println("Insira o nome do carro:");
        String carroNome = cin.nextLine().toUpperCase();
        carro.setNome(carroNome);

        addCarro(carro);

    }

    public void telaAcessarCarro(){
        System.out.println("Insira o nome do carro");
        String nome = cin.nextLine().toUpperCase();
        Carro c = buscaCarro(nome);
        if(c!=null){
            System.out.println(c.toString());
        }
    }
}
