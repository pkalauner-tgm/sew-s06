import at.hollanderkalauner.s06.Quakologe;
import at.hollanderkalauner.s06.gans.Gans;
import at.hollanderkalauner.s06.gans.GansAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Testet den GansAdapter
 *
 * @author Paul Kalauner 4AHIT
 * @version 20141217.1
 */
public class TestGansAdapter {
    private SystemOutRedirect sor;

    /**
     * Before
     */
    @Before
    public void setUp() {
        this.sor = new SystemOutRedirect();
    }

    /**
     * Testet den GansAdapter
     */
    @Test
    public void testGans() {
        Gans g = new Gans();
        GansAdapter ga = new GansAdapter(g);
        sor.startRedirect();
        ga.quaken();
        sor.stopRedirect();
        assertEquals("Schnatter" + System.lineSeparator(), sor.getString());
    }

    /**
     * Testet das Registrieren des Beobachters
     */
    @Test
    public void testRegistriereBeobachtende() {
        GansAdapter gansAdapter = new GansAdapter(new Gans());
        Quakologe quakologe = new Quakologe();
        gansAdapter.registriereBeobachter(quakologe);

        sor.startRedirect();
        gansAdapter.quaken();
        sor.stopRedirect();

        assertEquals("Schnatter" + System.lineSeparator() + "Quakologe: sich als Ente ausgebende Gans hat gerade gequakt." + System.lineSeparator(), sor.getString());
    }

}
