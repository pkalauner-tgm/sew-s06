package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

public class QuakZaehler implements Quakfaehig {
    Quakfaehig ente;
    static int anzahlDerQuaks;

    public QuakZaehler(Quakfaehig ente) {
        this.ente = ente;
    }

    public void quaken() {
        ente.quaken();
        anzahlDerQuaks++;
    }

    public static int getQuaks() {
        return anzahlDerQuaks;
    }

    public void registriereBeobachter(Beobachter beobachter) {
        ente.registriereBeobachter(beobachter);
    }

    public void benachrichtigeBeobachtende() {
        ente.benachrichtigeBeobachtende();
    }

    public String toString() {
        return ente.toString();
    }
}
