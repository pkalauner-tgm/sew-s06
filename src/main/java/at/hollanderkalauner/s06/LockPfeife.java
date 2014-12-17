package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.interfaces.Beobachter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * LockPfeife
 *
 * @author tlins
 * @version 1.0
 */
public class LockPfeife implements Quakfaehig {
    private SenderRing senderRing;

    /**
     * Initialisiert die LockPfeife
     */
    public LockPfeife() {
        senderRing = new SenderRing(this);
    }

    public void quaken() {
        System.out.println("Kwaak");
        benachrichtigeBeobachtende();
    }

    public void registriereBeobachter(Beobachter beobachter) {
        senderRing.registriereBeobachter(beobachter);
    }

    public void benachrichtigeBeobachtende() {
        senderRing.benachrichtigeBeobachtende();
    }

    public String toString() {
        return "Lockpfeife";
    }
}
