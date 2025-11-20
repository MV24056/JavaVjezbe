
public class Smjene {
protected int datum;
protected int pocetak;
protected int kraj;
protected int tipSmjene;

public Smjene(int datum, int pocetak, int kraj, int tipSmjene) {
	super();
	this.datum = datum;
	this.pocetak = pocetak;
	this.kraj = kraj;
	this.tipSmjene = tipSmjene;
}

public int getDatum() {
	return datum;
}

public void setDatum(int datum) {
	this.datum = datum;
}

public int getPocetak() {
	return pocetak;
}

public void setPocetak(int pocetak) {
	this.pocetak = pocetak;
}

public int getKraj() {
	return kraj;
}

public void setKraj(int kraj) {
	this.kraj = kraj;
}

public int getTipSmjene() {
	return tipSmjene;
}

public void setTipSmjene(int tipSmjene) {
	this.tipSmjene = tipSmjene;
}


}


