import at.hollanderkalauner.s06.QuakZaehler;
import at.hollanderkalauner.s06.fabrik.AbstrakteEntenFabrik;
import at.hollanderkalauner.s06.fabrik.ZaehlendeEntenFabrik;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paul on 17.12.2014.
 */
public class TestZaehlendeEntenfabrik {

    private AbstrakteEntenFabrik entenFabrik;

    @Before
    public void setUp() {
        this.entenFabrik = new ZaehlendeEntenFabrik();
    }

    @Test
    public void testErzeugeGummiEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeGummiEnte();
        q.quaken();
        assertEquals(1, QuakZaehler.getQuaks());
    }

    @Test
    public void testErzeugeStockEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeStockEnte();
        q.quaken();
        assertEquals(1, QuakZaehler.getQuaks());
    }

    @Test
    public void testErzeugeMoorEnte() {
        Quakfaehig q = this.entenFabrik.erzeugeMoorEnte();
        q.quaken();
        assertEquals(1, QuakZaehler.getQuaks());
    }

    @Test
    public void testErzeugeLockPfeife() {
        Quakfaehig q = this.entenFabrik.erzeugeLockPfeife();
        q.quaken();
        assertEquals(1, QuakZaehler.getQuaks());
    }
}
