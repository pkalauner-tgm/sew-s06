package at.hollanderkalauner.s06.fabrik;

import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * Stellt Enten her
 *
 * @author tlins
 * @version 1.0
 */
public abstract class AbstrakteEntenFabrik {

    /**
     * erzeugt eine StockEnte
     *
     * @return Stockente
     */
    public abstract Quakfaehig erzeugeStockEnte();

    /**
     * erzeugt eine MoorEnte
     *
     * @return MoorEnte
     */
    public abstract Quakfaehig erzeugeMoorEnte();

    /**
     * erzeugt eine LockPfeife
     *
     * @return LockPfeife
     */
    public abstract Quakfaehig erzeugeLockPfeife();

    /**
     * erzeugt eine GummiEnte
     *
     * @return GummiEnte
     */
    public abstract Quakfaehig erzeugeGummiEnte();
}
