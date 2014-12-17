package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.QuakBeobachtungsSubjekt;

/**
 * Quakologe
 *
 * @author tlins
 * @version 1.0
 */
public class Quakologe implements Beobachter {

    public void aktualisieren(QuakBeobachtungsSubjekt ente) {
        System.out.println("Quakologe: " + ente + " hat gerade gequakt.");
    }

    public String toString() {
        return "Quakologe";
    }
}
