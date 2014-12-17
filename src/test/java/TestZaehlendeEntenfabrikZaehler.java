import at.hollanderkalauner.s06.QuakZaehler;
import at.hollanderkalauner.s06.Quakologe;
import at.hollanderkalauner.s06.ente.MoorEnte;
import at.hollanderkalauner.s06.fabrik.AbstrakteEntenFabrik;
import at.hollanderkalauner.s06.fabrik.ZaehlendeEntenFabrik;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testet die zaehlende Entenfabrik und den QuakZaehler
 *
 * @author Paul Kalauner 4AHIT
 * @version 20141217.1
 */
public class TestZaehlendeEntenfabrikZaehler {

    private AbstrakteEntenFabrik entenFabrik;
    private SystemOutRedirect sor;

    /**
     * Intialisiert vor jedem Testcase die Entenfabrik und setzt den Zaehler zurueck
     */
    @Before
    public void setUp() {
        this.entenFabrik = new ZaehlendeEntenFabrik();
        QuakZaehler.resetZaehler();
        this.sor = new SystemOutRedirect();
    }

    /**
     * Testet das Erzeugen einer GummiEnte
     */
    @Test
    public void testErzeugeGummiEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeGummiEnte();
        q.quaken();
        assertEquals(1, QuakZaehler.getQuaks());
    }

    /**
     * Testet das Erzeugen einer StockEnte
     */
    @Test
    public void testErzeugeStockEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeStockEnte();
        q.quaken();
        assertEquals(1, QuakZaehler.getQuaks());
    }

    /**
     * Testet das Erzeugen einer MoorEnte
     */
    @Test
    public void testErzeugeMoorEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeMoorEnte();
        q.quaken();
        assertEquals(1, QuakZaehler.getQuaks());
    }

    /**
     * Testet das Erzeugen einer LockPfeife
     */
    @Test
    public void testErzeugeLockPfeife() {
        Quakfaehig q = this.entenFabrik.erzeugeLockPfeife();
        q.quaken();
        assertEquals(1, QuakZaehler.getQuaks());
    }

    /**
     * Testet den Zaehler ohne Quaks
     */
    @Test
    public void testNoQuaks() {
        this.entenFabrik.erzeugeLockPfeife();
        assertEquals(0, QuakZaehler.getQuaks());
    }

    /**
     * Testet den Zaehler mit mehreren Quaks
     */
    @Test
    public void testMultipleQuaks() {
        Quakfaehig q = this.entenFabrik.erzeugeMoorEnte();
        for (int i = 0; i < 10; i++)
            q.quaken();
        assertEquals(10, QuakZaehler.getQuaks());
    }

    @Test
    public void testRegistriereBeobachter() {
        QuakZaehler zaehler = new QuakZaehler(new MoorEnte());
        Quakologe quakologe = new Quakologe();
        zaehler.registriereBeobachter(quakologe);
        sor.startRedirect();
        zaehler.quaken();
        sor.stopRedirect();


        assertEquals("Quak" + System.lineSeparator() + "Quakologe: Moorente hat gerade gequakt." + System.lineSeparator(), sor.getString());
    }

}
