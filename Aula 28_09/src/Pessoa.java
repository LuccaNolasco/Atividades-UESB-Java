public class Pessoa {
	private String nome;
	private int idade;
	private double socCred;
	private boolean vivo;
	
	public Pessoa(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
		this.socCred=80;
		this.vivo=true;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSocCred() {
		return this.socCred;
	}
	
	public void setSocCred(double c) {
		this.socCred=c;
	}
	
	public void changeSocCred(double c) {
		if (c>10) {
			this.socCred+=10;
		}else {
			this.socCred+=c;
		
		}
	}
	
	// Objeto como parametro
	
	public void transferirCredito(Pessoa p2) {
		p2.socCred+=this.socCred;
		this.socCred=0;
	}
	
	
	
	@Override//para sobrescrever o toString padrão
	public String toString() {
		if (this.socCred<50 && this.socCred>15) {
			return "Peligo de extelminio";
		} else if(socCred<=15){
			vivo=false;
			return "Molte instantanea";
		} else {
			return "Muito bem, china";
		}
	}
	
	
}
