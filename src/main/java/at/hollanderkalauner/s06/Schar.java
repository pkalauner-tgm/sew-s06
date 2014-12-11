package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

import java.util.ArrayList;

/**
 * Schar
 *
 * @author Paul Kalauner 4AHIT
 * @version 20141211.1
 */
public class Schar {
    private ArrayList<Quakfaehig> ar;

    public Schar() {
        this.ar = new ArrayList<Quakfaehig>();
    }

    public void hinzufuegen(Quakfaehig ente) {
        ar.add(ente);
    }

    public void quaken() {
        for (Quakfaehig cur : ar)
            cur.quaken();
    }

    public void registriereBeobachter(Beobachter beobachter) {

    }

    public void benachrichtigeBeobachtende() {

    }

    public String toString() {
        return ar.toString();
    }

}
