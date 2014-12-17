package at.hollanderkalauner.s06.fabrik;

import at.hollanderkalauner.s06.LockPfeife;
import at.hollanderkalauner.s06.QuakZaehler;
import at.hollanderkalauner.s06.ente.GummiEnte;
import at.hollanderkalauner.s06.ente.MoorEnte;
import at.hollanderkalauner.s06.ente.StockEnte;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * Erzeugt Enten. <br>
 * Die Quaks werden mitgezaehlt
 *
 * @author tlins
 * @version 1.0
 */
public class ZaehlendeEntenFabrik extends AbstrakteEntenFabrik {

    public Quakfaehig erzeugeStockEnte() {
        return new QuakZaehler(new StockEnte());
    }

    public Quakfaehig erzeugeMoorEnte() {
        return new QuakZaehler(new MoorEnte());
    }

    public Quakfaehig erzeugeLockPfeife() {
        return new QuakZaehler(new LockPfeife());
    }

    public Quakfaehig erzeugeGummiEnte() {
        return new QuakZaehler(new GummiEnte());
    }
}
