package Netto;

public class Netto {

    public static void berechnen(double gehalt) {

        double prozent;

        if (gehalt > 10000.00) {prozent = 50.00;}

        else if ((gehalt < 2000.00)) {prozent = 20.00;}

        else   {prozent = 30.00;}

        double netto = gehalt - gehalt*prozent/100;

        System.out.println("Sie zahlen " + prozent + "% Steuer.");

        System.out.println("Netto = " + netto + " €");
    }
}