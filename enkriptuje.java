import java.util.Scanner;

public class enkriptuje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Unesite string");
String unos =sc.nextLine ();

String s= " ";
	for (int i =0;i< unos.length ();i++) {
		char c = unos.charAt(i);
	
	int cifra = Character.getNumericValue(c);
	if ( cifra % 2 == 0) {
		s = s + "0";
	}
	else {
		s = s + "1";
	}
	}
	}
	}