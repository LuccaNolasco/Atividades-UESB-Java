import java.lang.Math;

public class Funcao2Grau {
    private final double a;
    private final double b;
    private final double c;
    private final double[] raizes = new double[2];
    public Funcao2Grau(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double[] raiz(){
        if (b==0 && c==0){
            raizes[0]=0;
            raizes[1]=0;
            return raizes;
        } else if (c==0) {
            raizes[0]=0;
            raizes[1]=-this.b/this.a;
            return raizes;
        } else if (b==0){
            if(realCheck(this.a, -this.c)){
                System.out.println("Sem raizes reais");//esse Println não aparece
                return raizes;
            } else{
                raizes[0]=Math.sqrt((-this.c)/a);
                raizes[1]=-Math.sqrt((-this.c)/a);
                return raizes;
            }
        } else if (a==0){
            System.out.println("Não é equação do segundo grau");
            return raizes;
        } else{
            if(realCheck(this.b*this.b-4*this.a*this.c)){
                raizes[0]= (-this.b+Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
                raizes[1]=(-this.b-Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
                return raizes;
            } else{
                System.out.println("Sem raizes reais");
                return raizes;
            }
        }
    }

    public boolean realCheck(double x, double y){
        return -y / x < 0;
    }

    public boolean realCheck (double x){
        return x > 0;
    }
}
