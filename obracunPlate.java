
public class obracunPlate {
	protected int mesec;
	protected int godina;
	protected String ime;
	protected String prezime;
	protected String tip;
	protected double iznos;
	protected String napomena;

	public obracunPlate(int mesec, int godina, String ime, String prezime, String tip, double iznos, String napomena) {
		super();
		this.mesec = mesec;
		this.godina = godina;
		this.ime = ime;
		this.prezime = prezime;
		this.tip = tip;
		this.iznos = iznos;
		this.napomena = napomena;
	}

	public int getMesec() {
		return mesec;
	}

	public void setMesec(int mesec) {
		this.mesec = mesec;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
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

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	
	
}
