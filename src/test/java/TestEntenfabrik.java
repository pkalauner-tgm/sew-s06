import at.hollanderkalauner.s06.LockPfeife;
import at.hollanderkalauner.s06.ente.GummiEnte;
import at.hollanderkalauner.s06.ente.MoorEnte;
import at.hollanderkalauner.s06.ente.StockEnte;
import at.hollanderkalauner.s06.fabrik.AbstrakteEntenFabrik;
import at.hollanderkalauner.s06.fabrik.Entenfabrik;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paul on 17.12.2014.
 */
public class TestEntenfabrik {

    private AbstrakteEntenFabrik entenFabrik;

    @Before
    public void setUp() {
        this.entenFabrik = new Entenfabrik();
    }

    @Test
    public void testErzeugeGummiEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeGummiEnte();
        assertEquals(true, q instanceof GummiEnte);
    }

    @Test
    public void testErzeugeStockEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeStockEnte();
        assertEquals(true, q instanceof StockEnte);
    }

    @Test
    public void testErzeugeMoorEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeMoorEnte();
        assertEquals(true, q instanceof MoorEnte);
    }

    @Test
    public void testErzeugeLockPfeife() {
        Quakfaehig q = this.entenFabrik.erzeugeLockPfeife();
        assertEquals(true, q instanceof LockPfeife);
    }
}
