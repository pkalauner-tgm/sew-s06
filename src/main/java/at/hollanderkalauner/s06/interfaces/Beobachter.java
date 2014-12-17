package at.hollanderkalauner.s06.interfaces;

/**
 * Beobachtet ein Beobachtungssubjekt
 *
 * @author tlins
 * @version 1.0
 */
public interface Beobachter {
    /**
     * Wird vom Subjekt aufgerufen, falls eine Aenderung erfolgt ist
     *
     * @param ente Beobachtungssubjekt
     */
    public void aktualisieren(QuakBeobachtungsSubjekt ente);
}
