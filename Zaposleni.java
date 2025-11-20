
public class Zaposleni {
	
private int id;
protected String ime;
protected String prezime;
protected double plataPoSatu; 
protected double ukupanBrojSati;


public Zaposleni(String naziv, String adresa, int pib, int id, String ime, String prezime, double plataPoSatu,
		double ukupanBrojSati) {
	super();
	this.id = id;
	this.ime = ime;
	this.prezime = prezime;
	this.plataPoSatu = plataPoSatu;
	this.ukupanBrojSati = ukupanBrojSati;
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


@Override
public String toString() {
	return "Zaposleni [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", plataPoSatu=" + plataPoSatu
			+ ", ukupanBrojSati=" + ukupanBrojSati + "]";
}



}
