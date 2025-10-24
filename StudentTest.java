import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentTest {

	public static void main(String[] args) throws Exception {
		Student.setProlazNaIspitu(50);
	
		Student s1 = new Student("Marko", "Markovic", "25/001", "Oktoih 1,81000 Podgorica", 65, false);
	System.out.println(s1.toString());
	
	s1.setBrojBodova(23);
	System.out.println(s1.toString());
	
	 ArrayList<Student> x = new ArrayList<Student>();
	 /*
	 x.add( new Student("Marko", "Markovic", "25/001","Oktoih 1,81000 Podgorica", 65));
	 x.add( new Student("Marko", "Marinkovic", "25/001","Njegoseva 1,81000 Podgorica", 92));
	 x.add( new Student("Maja", "Markovic", "25/101","oktoih 1,81400 Niksic", 11));
	 x.add( new Student("Marko", "Markovic", "25/301","Oktoih 1,81000 Podgorica", 34));
	 x.add( new Student("Majda", "Markovic", "25/021","Janka Djonovica 1,81000 Podgorica", 48));
	 */
	 
	 String ime, prezime, brojIndeksa, adresa;
	 float brojBodova;
	 int poz, poz1;
	 
	 Scanner upis = new Scanner(new File("C:\\Temp\\Studenti.txt"));
	 upis.useDelimiter("\\|"); 


	 while (upis.hasNext()) {
		 String linija = upis.nextLine();
		 poz=linija.indexOf("|");
		 ime=linija.substring(0,poz);
		 poz1= linija.indexOf("|",poz+ 1);
	     prezime = linija.substring(poz + 1 ,poz1);
	   	 poz=poz1;
	     poz1=linija.indexOf("|",poz+ 1);
	     brojIndeksa=linija.substring(poz+1,poz1);
	     poz=poz1;
	     poz1=linija.indexOf("|",poz+ 1);
	     adresa=linija.substring(poz+1,poz1);
	     brojBodova=Float.parseFloat(linija.substring(poz1 + 1));
	     
	 upis.close();
		   /* ime = u.next()
		    prezime = u.next()
		    brojIndeksa = u.next();
		    adresa = u.next();
		    brojBodova = Float.parseFloat(u.next();
		    x.add(new Student(ime, prezime, brojIndeksa, adresa, brojBodova));
		}
		*/


	 
	 System.out.println("Studenti iz ulice Oktoih:");

	 ArrayList <Student> izdvojeno = Student.izdvojUlica(x, "Oktoih");
	 for(Student s2: izdvojeno)
		 System.out.println(s2.toString());
	 
	 }
	 
	BufferedWriter u = new BufferedWriter(new FileWriter("C:\\Temp\\Polozili.txt"));



	 
	 ArrayList< Student> izdvojenoPolozili = Student.izdvojProlazNaIspitu(x, true);
	 
	 System.out.println(" Polozili:");
    
	 for(Student s: izdvojenoPolozili) {
		 System.out.println(s.toString());
	 u.write(s.toString());
	 u.newLine();
	 }
	 ArrayList<Student> izdvojenoNisuPolozili = Student.izdvojProlazNaIspitu(x, false);
	 System.out.println(" Nisu polozili:");
	 for(Student s2 : izdvojenoNisuPolozili) {
		 System.out.println(s2.toString());
	 }
u.close();

}
}