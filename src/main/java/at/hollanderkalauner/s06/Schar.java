package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

import java.util.ArrayList;

public class Schar implements Quakfaehig {
    ArrayList<Quakfaehig> quakende = new ArrayList<Quakfaehig>();

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
