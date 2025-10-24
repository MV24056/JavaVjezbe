import java.util.Scanner;

public class palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite rečenicu:");
        
        String tekst = sc.nextLine().trim();
        String okrenuttekst = new StringBuilder(tekst).reverse().toString();
        
        if (tekst.equalsIgnoreCase(okrenuttekst)) {
            System.out.println("Rečenica je palindrom.");
        } else {
            System.out.println("Rečenica nije palindrom.");
        }

        sc.close();
    }
}
