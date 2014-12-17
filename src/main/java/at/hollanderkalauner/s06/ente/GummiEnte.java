package at.hollanderkalauner.s06.ente;

import at.hollanderkalauner.s06.SenderRing;
import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * GummiEnte
 *
 * @author tlins
 * @version 1.0
 */
public class GummiEnte implements Quakfaehig {
    private SenderRing senderRing;

    /**
     * Initialisiert eine GummiEnte
     */
    public GummiEnte() {
        senderRing = new SenderRing(this);
    }

    public void quaken() {
        System.out.println("Quietsch");
        benachrichtigeBeobachtende();
    }

    public void registriereBeobachter(Beobachter beobachter) {
        senderRing.registriereBeobachter(beobachter);
    }

    public void benachrichtigeBeobachtende() {
        senderRing.benachrichtigeBeobachtende();
    }

    public String toString() {
        return "Gummiente";
    }
}
