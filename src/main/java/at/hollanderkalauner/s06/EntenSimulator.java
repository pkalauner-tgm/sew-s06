package at.hollanderkalauner.s06;

import at.hollanderkalauner.s06.fabrik.AbstrakteEntenFabrik;
import at.hollanderkalauner.s06.fabrik.ZaehlendeEntenFabrik;
import at.hollanderkalauner.s06.gans.Gans;
import at.hollanderkalauner.s06.gans.GansAdapter;
import at.hollanderkalauner.s06.interfaces.Quakfaehig;

/**
 * Hauptklasse
 *
 * @author tlins
 * @version 1.0
 */
public class EntenSimulator {

    /**
     * Eintrittspunkt des Programmes
     *
     * @param args nicht verwendet
     */
    public static void main(String[] args) {
        EntenSimulator simulator = new EntenSimulator();
        AbstrakteEntenFabrik entenFabrik = new ZaehlendeEntenFabrik();

        simulator.simulieren(entenFabrik);
    }

    /**
     * Startet Simulation mit der angegebenen entenfabrik
     *
     * @param entenfabrik Instanz von Entenfabrik
     */
    void simulieren(AbstrakteEntenFabrik entenfabrik) {

        Quakfaehig moorEnte = entenfabrik.erzeugeMoorEnte();
        Quakfaehig lockPfeife = entenfabrik.erzeugeLockPfeife();
        Quakfaehig gummiEnte = entenfabrik.erzeugeGummiEnte();
        Quakfaehig gansEnte = new GansAdapter(new Gans());

        Schar entenSchar = new Schar();

        entenSchar.hinzufuegen(moorEnte);
        entenSchar.hinzufuegen(lockPfeife);
        entenSchar.hinzufuegen(gummiEnte);
        entenSchar.hinzufuegen(gansEnte);

        Schar stockEntenSchar = new Schar();

        Quakfaehig stockEnte1 = entenfabrik.erzeugeStockEnte();
        Quakfaehig stockEnte2 = entenfabrik.erzeugeStockEnte();
        Quakfaehig stockEnte3 = entenfabrik.erzeugeStockEnte();
        Quakfaehig stockEnte4 = entenfabrik.erzeugeStockEnte();

        stockEntenSchar.hinzufuegen(stockEnte1);
        stockEntenSchar.hinzufuegen(stockEnte2);
        stockEntenSchar.hinzufuegen(stockEnte3);
        stockEntenSchar.hinzufuegen(stockEnte4);

        entenSchar.hinzufuegen(stockEntenSchar);

        System.out.println("\nEntensimulator: mit Observer");

        Quakologe quakologe = new Quakologe();
        entenSchar.registriereBeobachter(quakologe);

        simulieren(entenSchar);

        System.out.println("\nDie Enten haben " +
                QuakZaehler.getQuaks() +
                "-mal gequakt.");
    }

    /**
     * Laesst eine Ente quaken
     *
     * @param ente Instanz von Ente
     */
    void simulieren(Quakfaehig ente) {
        ente.quaken();
    }
}
