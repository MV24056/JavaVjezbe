import java.util.ArrayList;
import java.util.Scanner;

public class TestEProizvod {

	public static void main(String[] args) {

		System.out.print("unesite sifru proizvoda");
		Scanner sc = new Scanner(System.in);
		ArrayList<EProizvod> lista = new ArrayList<>();

		lista.add(new Racunari("Laptop", "RA01", 500, "Intel i5", 8));
		lista.add(new Telefon("Samsung", "TE01", 300, "Android", 6.5));
		lista.add(new TVuredjaji("LG TV", "TV01", 800, 70));

		for (EProizvod p : lista) {
			System.out.println(
					p.getTip() + " - " + p.getOpisProizvoda() + " | Maloprodajna cijena: " + p.maloprodajnaCijena());
		}

		System.out.println("Spisak telefona");
		for (EProizvod p : lista) {

			if (p.getTip().equalsIgnoreCase("Telefoni")) {
				System.out.println(p.getTip() + " - " + p.getOpisProizvoda() + " | Maloprodajna cijena: "
						+ p.maloprodajnaCijena());
			}
		}
		sc.close();
	}

}
