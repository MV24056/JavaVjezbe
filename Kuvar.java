
public class Kuvar {
	private int id;
	protected String ime;
	protected String prezime;
	protected double plataPoSatu;
	protected double ukupanBrojSati;
	protected int fiksniIznos;

	public Kuvar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, int fiksniIznos) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
		this.fiksniIznos = fiksniIznos;
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

	public int getFiksniIznos() {
		return fiksniIznos;
	}

	public void setFiksniIznos(int fiksniIznos) {
		this.fiksniIznos = fiksniIznos;


	}

	public double izracunajPlatu() {
		double fiksniIznos = 1500.0;
		return fiksniIznos + 4 * (ukupanBrojSati * plataPoSatu);

	}
}