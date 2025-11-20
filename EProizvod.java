import java.util.ArrayList;

public class EProizvod {

	private String opisProizvoda;
	private String sifraProizvoda;
	protected double uvoznaCijena;

	public EProizvod(String opisProizvoda, String sifraProizvoda, double uvoznaCijena) {
		super();
		this.opisProizvoda = opisProizvoda;
		this.sifraProizvoda = sifraProizvoda;
		this.uvoznaCijena = uvoznaCijena;

	}

	public String getOpisProizvoda() {
		return opisProizvoda;
	}

	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}

	public String getSifraProizvoda() {
		return sifraProizvoda;
	}

	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}

	public double getUvoznaCijena() {
		return uvoznaCijena;
	}

	public double setUvoznaCijena(double setUvoznaCijena) {
		return uvoznaCijena * 1.05;
	}

	public String getTip() {
		String prvaDvaSlova = sifraProizvoda.substring(0, 2).toUpperCase();

		if (prvaDvaSlova.equals("RA")) {
			return "Racunari";
		} else if (prvaDvaSlova.equals("TE")) {
			return "Telefoni";
		} else if (prvaDvaSlova.equals("TV")) {
			return "TV";
		} else {
			return "Taj proizvod ne postoji";
		}
	}

	@Override
	public String toString() {

		return "EProizvod [opisProizvoda=" + opisProizvoda + ", sifraProizvoda=" + sifraProizvoda + ", uvoznaCijena="
				+ uvoznaCijena + "]";

	}

	double maloprodajnaCijena() {
		return uvoznaCijena * 1.05;
	}

	public static ArrayList<EProizvod> odredjenogtipa(ArrayList<EProizvod> lista) {
		ArrayList<EProizvod> novaLista = new ArrayList<EProizvod>();
		for (EProizvod p : lista) {
			if (p.getOpisProizvoda().equals("Racunari")) {
				novaLista.add(p);
			}
		}
		return novaLista;
	}

}
