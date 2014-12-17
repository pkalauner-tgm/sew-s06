import at.hollanderkalauner.s06.Schar;
import at.hollanderkalauner.s06.ente.GummiEnte;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testet die Schar
 *
 * @author Rene Hollander 4AHIT
 * @version 20141217.1
 */
public class TestSchar {

    private SystemOutRedirect sor;

    /**
     * Before
     */
    @Before
    public void reset() {
        this.sor = new SystemOutRedirect();
    }

    /**
     * Testet das Hinzufuegen von Quackfaehig Objekten
     */
    @Test
    public void testAddQuackable() {
        Schar schar = new Schar();
        schar.hinzufuegen(new GummiEnte());

        sor.startRedirect();
        schar.quaken();
        sor.stopRedirect();

        assertEquals("Quietsch" + System.lineSeparator(), sor.getString());
    }
/*
    @Test
    public void testRegistriereBeobachtende() {
        Schar schar = new Schar();
        schar.hinzufuegen(new GummiEnte());

        sor.startRedirect();
        schar.quaken();
        sor.stopRedirect();

        assertEquals("Quietsch" + System.lineSeparator(), sor.getString());
    }
*/
}
