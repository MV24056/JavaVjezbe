
public class Menadzer {
	private int id;
	protected String ime;
	protected String prezime;
	protected double plataPoSatu;
	protected double ukupanBrojSati;
    protected double bonus;
    
	

	public Menadzer(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double bonus) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
		this.bonus = bonus;
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
	public double bonus() {
		return bonus;
	}

	public void bonus(double bonus) {
		this.bonus = bonus;
	
	}
	
	public double izracunajPlatu() {
		return 1300 + 4 * ukupanBrojSati * plataPoSatu + bonus;
		}
		
}


