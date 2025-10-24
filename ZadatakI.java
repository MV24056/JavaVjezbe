
public class ZadatakI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tacka t = new Tacka(2.21,4.74);
System.out.println(t.toString());
	}

}

class Tacka {
double x, y ;
public Tacka (double x, double y) {

this.x=x;
this.y=y;
}
public String toString() {
return String.format("(%.2f, %.2f)", x , this.y); // metoda kreira String
}
}