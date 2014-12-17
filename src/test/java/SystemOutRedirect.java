import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by rene on 12/17/14.
 */
public class SystemOutRedirect {

    private PrintStream old;
    private ByteArrayOutputStream output;

    private String string;

    public SystemOutRedirect() {

    }

    public void startRedirect() {
        if (this.output != null) {
            throw new RuntimeException("Sysout is currently redirected!");
        }
        this.output = new ByteArrayOutputStream();
        this.old = System.out;
        System.setOut(new PrintStream(this.output));
    }

    public void stopRedirect() {
        System.out.flush();
        System.setOut(this.old);
        this.string = this.output.toString();
        this.output = null;
    }

    public String getString() {
        return this.string;
    }

}
