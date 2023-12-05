public class Pneu {
    private String marca;
    private double custo;

    public Pneu(String marca){
        this.marca=marca;
        switch(marca){
            case "AEOLUS":
                this.custo=200;
                break;
            case "CONTINENTAL":
                this.custo=350;
                break;
            case "MICHELIN":
                this.custo=530;
                break;
            default:
                break;
        }
    }

    public String getMarca(){
        return this.marca;
    }
    public double getCusto(){
       return this.custo;
    }

}
