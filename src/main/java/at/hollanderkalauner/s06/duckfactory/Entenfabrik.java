package at.hollanderkalauner.s06.duckfactory;

import at.hollanderkalauner.s06.LockPfeife;
import at.hollanderkalauner.s06.ducks.GummiEnte;
import at.hollanderkalauner.s06.ducks.MoorEnte;
import at.hollanderkalauner.s06.ducks.StockEnte;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * Created by Paul on 11.12.2014.
 */
public class Entenfabrik extends AbstraktEntenFabrik {
    @Override
    public Quakfaehig erzeugeStockEnte() {
        return new StockEnte();
    }

    @Override
    public Quakfaehig erzeugeMoorEnte() {
        return new MoorEnte();
    }

    @Override
    public Quakfaehig erzeugeLockPfeife() {
        return new LockPfeife();
    }

    @Override
    public Quakfaehig erzeugeGummiEnte() {
        return new GummiEnte();
    }
}
