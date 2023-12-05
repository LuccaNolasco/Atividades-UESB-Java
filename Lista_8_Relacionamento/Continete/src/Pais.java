public class Pais {
    private String nome;
    private int pop;
    private double area;

    public Pais(String nome, int pop, double area){
        this.nome=nome;
        this.pop=pop;
        this.area=area;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString(){
        return nome+"\nPopulação: "+pop+"\nDimensão: "+area+"km^2\n\n";
    }
}
