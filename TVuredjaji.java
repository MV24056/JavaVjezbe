
public class TVuredjaji extends EProizvod {

	private double velicinaEkrana;

	public TVuredjaji(String opisProizvoda, String sifraProizvoda, double uvoznaCijena, double velicinaEkrana) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijena);
	}

	public double getVelicinaEkrana() {
		return velicinaEkrana;
	}

	public void setVelicinaEkrana(double velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}

	public String prikazivanjeTvuredjaja() {
		return "TVuredjaji [velicinaEkrana=" + velicinaEkrana + "]";
	}

	double maloprodajnaCijena() {
		double maloprodajnaCijena = uvoznaCijena * 1.05;
		if (velicinaEkrana > 65) {
			maloprodajnaCijena = maloprodajnaCijena * 1.03;
		}
		return maloprodajnaCijena;
	}

}
