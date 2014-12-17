import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Leitet System.out um
 *
 * @author Rene Hollander 4AHIT
 * @version 20141217.1
 */
public class SystemOutRedirect {

    private PrintStream old;
    private ByteArrayOutputStream output;

    private String string;

    /**
     * Startet die Umleitung
     */
    public void startRedirect() {
        if (this.output != null) {
            throw new RuntimeException("Sysout is currently redirected!");
        }
        this.output = new ByteArrayOutputStream();
        this.old = System.out;
        System.setOut(new PrintStream(this.output));
    }

    /**
     * Stoppt die Umleitung
     */
    public void stopRedirect() {
        System.out.flush();
        System.setOut(this.old);
        this.string = this.output.toString();
        this.output = null;
    }

    /**
     * Liefert den Inhalt zurueck
     *
     * @return String
     */
    public String getString() {
        return this.string;
    }

}
