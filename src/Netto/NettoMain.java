package Netto;
import java.util.Scanner;
public class NettoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean berechnen = true;
        System.out.println("Herzlich Willkommen");
        while (berechnen) {
            System.out.println("Bitte geben Sie ihr Gehalt ein:");
            double gehalt = scanner.nextDouble();
            Netto.berechnen(gehalt);
            scanner.nextLine();
            System.out.println("Möchten Sie einen weiteren Gehalt berechnen?(J/N)");
            String entscheidung = scanner.nextLine();
            if (entscheidung.equalsIgnoreCase("N")) {
                System.out.println("Auf Wiedersehen");
                berechnen = false;
            }


        }
    }
}