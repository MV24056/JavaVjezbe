import java.util.ArrayList;

class Auto {
	
private String markaAuta;
private int godisteAuta;
private int snagaMotora;
private boolean prodato;
private float kubikaza;
private boolean registrovan;
private static int brojProdatih = 0; // veze se za klasu jer mi racunamo na nivou klase koliko je automobila

//KREIRAMO KONSTRUKTOR

public Auto(String markaAuta, int godisteAuta, int snagaMotora, boolean prodato, float kubikaza, boolean registrovan) {
	//ON JE KORISTAN U METODAMA AKO KORISTIMO VARIJABLE KOJE IMAJU ISTO IME 
	this.markaAuta = markaAuta;
	this.godisteAuta = godisteAuta;
	this.snagaMotora = snagaMotora;
	this.kubikaza = kubikaza;
	this.prodato = prodato;
	if (prodato) brojProdatih++;
	this.registrovan = godisteAuta <1985 ? false: registrovan;
	
}
/*public Auto () {
	this.markaAuta=""; ovo kada nam je dato u tekstu koju vrijednost imammo
	this.godisteAuta=1991;		
}*/

//KREIRAMO GETERE I SETERE
public String getMarkaAuta() {
	return this.markaAuta;
}
public int getGodisteAuta() {
	return this.godisteAuta;
}
public int getSnagaMotora() {
	return this.snagaMotora;
}
public float getKubikaza() {
	return this.kubikaza;
}
public void setMarkaAuta(String markaAuta) {
	this.markaAuta = markaAuta;
}
public void setGodisteAuta(int godisteAuta) {
	if (godisteAuta>=2025) {
System.out.print("Još nismo stigli do te godine");
return; // izadje iz funkcije, vrati null
}
this.godisteAuta=godisteAuta;
if(godisteAuta <1985)this.registrovan=false;
}

public void setSnagaMotora(int snagaMotora) {
	this.snagaMotora = snagaMotora;
}
public boolean jeProdato() {
	return this.prodato;
}
public void setProdato(boolean prodato) {
	if(this.prodato != prodato && prodato)brojProdatih++;
	this.prodato=prodato;
}
public void setKubikaza(float kubikaza) {
	this.kubikaza = kubikaza;
}
public void setRegistrovan(boolean registrovan) {
if(this.godisteAuta>= 1985)this.registrovan=registrovan;
}
public boolean jeRegistrovan() {
	return this.registrovan;
}
public static int brojProdatih () {
	return brojProdatih;
}

public boolean mozeSeRegistrovati() {  //pravimo metode
    return this.godisteAuta >= 1985 && !this.prodato;
}

public static float koeficjentZaGodiste (int godiste) {
	if (godiste <1985) return 0.0f;
	if (godiste <=2000) return 3.0f;
	if (godiste <=2010)return 2.0f;
	return 1.5f;
}
public float cijenaRegistracije() {
	if (!mozeSeRegistrovati())return 0.0f;
		return koeficjentZaGodiste(godisteAuta)*kubikaza*snagaMotora;
	}

@Override
public String toString(){
    return String.format("Auto [marka=%s, godiste=%d, snaga=%d, kubikaza=%.1f, registrovan=%s, cijenaReg=%.2f]",markaAuta, godisteAuta, snagaMotora, kubikaza,
        registrovan ? "da" : "ne", cijenaRegistracije()  );
}
}

class AutoServis  {
	public static ArrayList<Auto>neregistrovaniKojiSeMoguRegistrovati (ArrayList<Auto>auta) {
	ArrayList<Auto>lista = new ArrayList<>();
	for (Auto a:auta) {
		if(a.mozeSeRegistrovati()&& !a.jeRegistrovan()) {
			lista.add(a);
		}
	}
	return lista;
	}
	public static float ukupnaRegistracija (ArrayList<Auto>auta) {
		float suma=0;
		for(Auto a:auta) {
			suma+=a.cijenaRegistracije();
		}
		return suma;
	}
}
//ovo smo odvojili zato sto mi u onoj klasi samo imali jedno auto a u ovoj vise i onda ne mozemo u onoj klasi
public class TestAuto {

	public static void main(String[] args) {
		ArrayList<Auto>auta=new ArrayList<>();
		
		Auto a1= new Auto("VW Golf 3",1995,55,true,1600,false);
		auta.add(a1);
		auta.add(new Auto("BMW 320d",2020,140,true,1995,false));
		
		for(Auto a: AutoServis.neregistrovaniKojiSeMoguRegistrovati(auta)) {
			System.out.println(a);
		}
		System.out.print(auta.get(0));
	}
}

