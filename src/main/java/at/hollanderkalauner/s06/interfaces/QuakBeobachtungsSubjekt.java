package at.hollanderkalauner.s06.interfaces;

/**
 * Kann beobachtet werden
 *
 * @author tlins
 * @version 1.0
 */
public interface QuakBeobachtungsSubjekt {
    /**
     * registriert einen nuen Beobachter
     *
     * @param beobachter der zu registrierende Beobachter
     */
    public void registriereBeobachter(Beobachter beobachter);

    /**
     * Benachrichtigt Beobachtende
     */
    public void benachrichtigeBeobachtende();
}
