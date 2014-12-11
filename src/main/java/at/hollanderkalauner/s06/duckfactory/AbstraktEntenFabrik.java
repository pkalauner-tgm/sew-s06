package at.hollanderkalauner.s06.duckfactory;

import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * Created by Paul on 11.12.2014.
 */
public abstract class AbstraktEntenFabrik {

    public abstract Quakfaehig erzeugeStockEnte();

    public abstract Quakfaehig erzeugeMoorEnte();

    public abstract Quakfaehig erzeugeLockPfeife();

    public abstract Quakfaehig erzeugeGummiEnte();

}
