
public class Restoran {

	private String naziv;
	private String adresa;
	private int pib;

	public Restoran(String naziv, String adresa, int pib) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}

	@Override
	public String toString() {
		return "Restoran [naziv=" + naziv + ", adresa=" + adresa + ", pib=" + pib + "]";
	}

}
