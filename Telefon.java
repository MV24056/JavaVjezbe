
public class Telefon extends EProizvod{

	private String operativniSistem;
	private double velicinaEkrana;
	
	
	
	public Telefon(String opisProizvoda, String sifraProizvoda, double uvoznaCijena, String operativniSistem,
			double velicinaEkrana) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijena);
		this.operativniSistem = operativniSistem;
		this.velicinaEkrana = velicinaEkrana;
	}



	public String getOperativniSistem() {
		return operativniSistem;
	}



	public void setOperativniSistem(String operativniSistem) {
		this.operativniSistem = operativniSistem;
	}



	public double getVelicinaEkrana() {
		return velicinaEkrana;
	}



	public void setVelicinaEkrana(double velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}



	@Override
	public String toString() {
		return "Telefon [operativniSistem=" + operativniSistem + ", velicinaEkrana=" + velicinaEkrana + "]";
	}
	
	double maloprodajnaCijena() {
		
	    double maloprodajnaCijena = uvoznaCijena * 1.05;
	    
	    if (velicinaEkrana > 6) {
	    	maloprodajnaCijena = maloprodajnaCijena * 1.03;
	    }
	    return maloprodajnaCijena;
	}

	
}
