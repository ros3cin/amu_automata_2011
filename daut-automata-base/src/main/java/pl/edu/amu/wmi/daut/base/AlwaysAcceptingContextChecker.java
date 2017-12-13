package pl.edu.amu.wmi.daut.base;

/**
 * Klasa, dla której kontekst jest zawsze prawdziwy.
 */
public class AlwaysAcceptingContextChecker implements ContextChecker {

    /**
     * Metoda zwraca true.
     */
    public boolean check(TransitionLabel label) {
        return true;
    }

}
