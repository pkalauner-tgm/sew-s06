package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.QuakBeobachtungsSubjekt;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by rene on 12/11/14.
 */
public class SenderRing implements QuakBeobachtungsSubjekt {

    private QuakBeobachtungsSubjekt quakBeobachtungsSubjekt;

    private ArrayList<Beobachter> beobachters;

    public SenderRing(QuakBeobachtungsSubjekt quakBeobachtungsSubjekt) {
        this.quakBeobachtungsSubjekt = quakBeobachtungsSubjekt;
    }

    public Iterator<Beobachter> getBeobachtende() {
        return beobachters.iterator();
    }

    @Override
    public void benachrichtigeBeobachtende() {
        for (Beobachter b : this.beobachters) {
            b.aktualisiere(this);
        }
    }

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.beobachters.add(beobachter);
    }
}
