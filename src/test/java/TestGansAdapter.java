import at.hollanderkalauner.s06.gans.Gans;
import at.hollanderkalauner.s06.gans.GansAdapter;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Paul on 17.12.2014.
 */
public class TestGansAdapter {
        private SystemOutRedirect sor;

    @Before
    public void setUp() {
        this.sor = new SystemOutRedirect();
    }

    @Test
    public void testGans() {
        Gans g = new Gans();
        GansAdapter ga = new GansAdapter(g);
        ga.quaken();
       // assertEquals("Schnatter", outContent.toString());
    }
}
