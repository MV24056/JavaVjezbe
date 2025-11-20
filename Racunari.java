
public class Racunari extends EProizvod {

	private String procesor;
	private int memorija;

	public Racunari(String opisProizvoda, String sifraProizvoda, double uvoznaCijena, String procesor, int memorija) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}

	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public int getMemorija() {
		return memorija;
	}

	public void setMemorija(int memorija) {
		this.memorija = memorija;

	}

	double maloprodajnaCijena() {
		double maloprodajna = uvoznaCijena * 1.05;
		maloprodajna = maloprodajna * 1.05;
		return maloprodajna;
	}
}
