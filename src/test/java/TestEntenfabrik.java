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
 * Testet die Entenfabrik
 *
 * @author Paul Kalauner 4AHIT
 * @version 20141217.1
 */
public class TestEntenfabrik {

    private AbstrakteEntenFabrik entenFabrik;

    /**
     * Intialisiert vor jedem Testcase die Entenfabrik
     */
    @Before
    public void setUp() {
        this.entenFabrik = new Entenfabrik();
    }

    /**
     * Testet das Erzeugen einer GummiEnte
     */
    @Test
    public void testErzeugeGummiEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeGummiEnte();
        assertEquals(true, q instanceof GummiEnte);
    }

    /**
     * Testet das Erzeugen einer StockEnte
     */
    @Test
    public void testErzeugeStockEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeStockEnte();
        assertEquals(true, q instanceof StockEnte);
    }

    /**
     * Testet das Erzeugen einer MoorEnte
     */
    @Test
    public void testErzeugeMoorEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeMoorEnte();
        assertEquals(true, q instanceof MoorEnte);
    }

    /**
     * Testet das Erzeugen einer LockPfeife
     */
    @Test
    public void testErzeugeLockPfeife() {
        Quakfaehig q = this.entenFabrik.erzeugeLockPfeife();
        assertEquals(true, q instanceof LockPfeife);
    }
}