
public class Konobar {

	private int id;
	protected String ime;
	protected String prezime;
	protected double plataPoSatu;
	protected double ukupanBrojSati;
	protected double prekovremeniRad;

	public Konobar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati,
			double prekovremeniRad) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
		this.prekovremeniRad = prekovremeniRad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getPlataPoSatu() {
		return plataPoSatu;
	}

	public void setPlataPoSatu(double plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}

	public double getUkupanBrojSati() {
		return ukupanBrojSati;
	}

	public void setUkupanBrojSati(double ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;
	}

	public double prekovremeniRad() {
		return prekovremeniRad;
	}

	public void prekovremeniRad(double prekovremeniRad) {
		this.prekovremeniRad = prekovremeniRad;
	}

	@Override
	public String toString() {
		return "Konobar [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", plataPoSatu=" + plataPoSatu
				+ ", ukupanBrojSati=" + ukupanBrojSati + "]";
	}

	public double izracunajPlatu() {
		double osnovna = ukupanBrojSati * plataPoSatu;
		double prekovremena = prekovremeniRad * plataPoSatu * 1.2;

		return 4 * (osnovna + prekovremena);
	}

}
