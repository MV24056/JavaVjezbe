import java.util.Scanner;

public class brojrijeci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite recenicu:");
           
        String tekst = sc.nextLine();

        String[] rijeci = tekst.split("\\s+");

        System.out.println("Broj rijeci je " + rijeci.length);

        sc.close();
    }
}
