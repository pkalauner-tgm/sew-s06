package at.hollanderkalauner.s06.ente;

import at.hollanderkalauner.s06.SenderRing;
import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * StockEnte
 *
 * @author tlins
 * @version 1.0
 */
public class StockEnte implements Quakfaehig {
    SenderRing senderRing;

    /**
     * Initialisiert eine StockEnte
     */
    public StockEnte() {
        senderRing = new SenderRing(this);
    }

    public void quaken() {
        System.out.println("Quak");
        benachrichtigeBeobachtende();
    }

    public void registriereBeobachter(Beobachter beobachter) {
        senderRing.registriereBeobachter(beobachter);
    }

    public void benachrichtigeBeobachtende() {
        senderRing.benachrichtigeBeobachtende();
    }

    public String toString() {
        return "Stockente";
    }
}
