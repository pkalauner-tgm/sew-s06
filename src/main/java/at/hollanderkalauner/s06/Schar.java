package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

import java.util.ArrayList;

/**
 * Schar
 *
 * @author tlins
 * @version 1.0
 */
public class Schar implements Quakfaehig {
    ArrayList<Quakfaehig> quakende = new ArrayList<Quakfaehig>();

    /**
     * Fuegt ein Quakfaehig Objekt zur Schar hinzu
     *
     * @param quaker Quafaehig Instanz
     */
    public void hinzufuegen(Quakfaehig quaker) {
        quakende.add(quaker);
    }

    public void quaken() {
        for (Quakfaehig quaker : quakende) {
            quaker.quaken();
        }
    }

    public void registriereBeobachter(Beobachter beobachter) {
        for (Quakfaehig quaker : quakende) {
            quaker.registriereBeobachter(beobachter);
        }
    }

    public void benachrichtigeBeobachtende() {
    }

    public String toString() {
        return "Entenschar";
    }
}
