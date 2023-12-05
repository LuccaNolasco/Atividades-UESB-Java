public class Banco {
    private String modelo;
    private String fabricante;
    private double custo;

    public Banco (String fabricante, String modelo){
        this.fabricante=fabricante;
        this.modelo=modelo;
        switch(fabricante){
            case "GLUTEUS":
                if(modelo.equals("BASIC")){
                    this.custo=990;
                } else{
                    this.custo=1950;
                }
                break;
            case "BEAVERS":
                if(modelo.equals("BASIC")){
                    this.custo=1300;
                } else{
                    this.custo=3700;
                }
            default:
                break;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getCusto() {
        return custo;
    }
}
