import at.hollanderkalauner.s06.Quakologe;
import at.hollanderkalauner.s06.Schar;
import at.hollanderkalauner.s06.ente.GummiEnte;
import at.hollanderkalauner.s06.ente.StockEnte;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testet die Schar und den Quakologen
 *
 * @author Rene Hollander 4AHIT
 * @version 20141217.1
 */
public class TestScharQuakologe {

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

    /**
     * Testet das Registrieren des Beobachters
     */
    @Test
    public void testRegistriereBeobachtende() {
        Schar schar = new Schar();
        schar.hinzufuegen(new GummiEnte());
        schar.hinzufuegen(new StockEnte());
        Quakologe quakologe = new Quakologe();
        schar.registriereBeobachter(quakologe);

        sor.startRedirect();
        schar.quaken();
        sor.stopRedirect();


        assertEquals("Quietsch" + System.lineSeparator() + "Quakologe: Gummiente hat gerade gequakt." + System.lineSeparator() + "Quak" + System.lineSeparator() + "Quakologe: Stockente hat gerade gequakt." + System.lineSeparator(), sor.getString());
    }

}
