public class Motor {
    private int pot;
    private String fabricante;
    private double custo;

    public Motor(String fabricante){
        this.fabricante=fabricante;
        switch (fabricante){
            case "MINUS":
                this.pot=100;
                this.custo=7500;
                break;
            case "ARGUS":
                this.pot=250;
                this.custo=18900;
                break;
            case "MAGNUS":
                this.pot=1100;
                this.custo=99500;
                break;
            default:
                break;
        }
    }

    public int getPot(){
        return this.pot;
    }

    public double getCusto(){
        return this.custo;
    }

    public String getFabricante(){
        return this.fabricante;
    }
}
