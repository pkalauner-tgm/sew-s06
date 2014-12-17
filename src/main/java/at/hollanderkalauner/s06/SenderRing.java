package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.QuakBeobachtungsSubjekt;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * SenderRing
 *
 * @author tlins
 * @version 1.0
 */
public class SenderRing implements QuakBeobachtungsSubjekt {
    private ArrayList<Beobachter> beobachtende = new ArrayList<Beobachter>();
    private QuakBeobachtungsSubjekt ente;

    /**
     * Initialisiert den SenderRing
     *
     * @param ente QuakBeobachtungsSubjekt
     */
    public SenderRing(QuakBeobachtungsSubjekt ente) {
        this.ente = ente;
    }

    public void registriereBeobachter(Beobachter beobachter) {
        beobachtende.add(beobachter);
    }

    public void benachrichtigeBeobachtende() {
        for (Beobachter beobachter : beobachtende) {
            beobachter.aktualisieren(ente);
        }
    }

    /**
     * Liefert die Beobachter zurueck
     *
     * @return Iterator
     */
    public Iterator<Beobachter> getBeobachtende() {
        return beobachtende.iterator();
    }
}
