import at.hollanderkalauner.s06.Schar;
import at.hollanderkalauner.s06.ente.GummiEnte;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rene on 12/17/14.
 */
public class TestSchar {

    private SystemOutRedirect sor;

    @Before
    public void reset() {
        this.sor = new SystemOutRedirect();
    }

    @Test
    public void testAddQuackable() {
        Schar schar = new Schar();
        schar.hinzufuegen(new GummiEnte());

        sor.startRedirect();
        schar.quaken();
        sor.stopRedirect();

        assertEquals(true, sor.getString().contains("Quietsch"));
    }
/*
    @Test
    public void testRegistriereBeobachtende() {
        Schar schar = new Schar();
        schar.hinzufuegen(new GummiEnte());

        sor.startRedirect();
        schar.quaken();
        sor.stopRedirect();

        assertEquals("Quietsch\n", sor.getString());
    }
*/
}
