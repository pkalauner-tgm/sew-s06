package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.QuakBeobachtungsSubjekt;

import java.util.ArrayList;
import java.util.Iterator;

public class SenderRing implements QuakBeobachtungsSubjekt {
    ArrayList<Beobachter> beobachtende = new ArrayList<Beobachter>();
    QuakBeobachtungsSubjekt ente;

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

    public Iterator<Beobachter> getBeobachtende() {
        return beobachtende.iterator();
    }
}
