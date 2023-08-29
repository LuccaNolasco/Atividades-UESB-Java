public class Q006{
    public static void main(String[]args){
        int num,ant=1,antt=0;
        num=ant+antt;
        System.out.printf("O número 1 da sequência de Fibonacci é %d\n",num);
        for(int i=2;i<=10;i++){
            num=ant+antt;
            antt=ant;
            ant=num;
            System.out.printf("O número %d da sequência de Fibonacci é %d\n", i,num);
        }
    }
}