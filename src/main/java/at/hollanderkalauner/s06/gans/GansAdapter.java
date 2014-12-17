package at.hollanderkalauner.s06.gans;

import at.hollanderkalauner.s06.SenderRing;
import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * Schnittstelle von Quakfaehig zu Gans
 *
 * @author tlins
 * @version 1.0
 */
public class GansAdapter implements Quakfaehig {
    Gans gans;
    SenderRing senderRing;

    /**
     * Initialisiert den GansAdapter mit der angegebenen Gans
     *
     * @param gans Gans Instanz
     */
    public GansAdapter(Gans gans) {
        this.gans = gans;
        senderRing = new SenderRing(this);
    }

    public void quaken() {
        gans.schnattern();
        benachrichtigeBeobachtende();
    }

    public void registriereBeobachter(Beobachter beobachter) {
        senderRing.registriereBeobachter(beobachter);
    }

    public void benachrichtigeBeobachtende() {
        senderRing.benachrichtigeBeobachtende();
    }

    public String toString() {
        return "sich als Ente ausgebende Gans";
    }
}
