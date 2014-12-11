package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * Created by Paul on 11.12.2014.
 */
public class QuakZaehler {
    private static int anzahlDerQuaks;
    private Quakfaehig ente;

    public QuakZaehler(Quakfaehig ente) {
        this.ente = ente;
    }

    public void quacken() {
        ente.quaken();
        anzahlDerQuaks++;
    }

    public static int getQuacks() {
        return anzahlDerQuaks;
    }

    public void registriereBeobachter(Beobachter beobachter) {

    }

    public void benachrichtigeBeobachtende() {

    }

    public String toString() {
        return "Quaks: " + anzahlDerQuaks + ", Ente: " + ente.toString();
    }

    public Quakfaehig getEnte() {
        return this.ente;
    }

    public void setEnte(Quakfaehig ente) {
        this.ente = ente;
    }
}
