import java.util.ArrayList;
import java.util.LinkedList;

public class KassaRij {

    ArrayList<Dienblad> = new ArrayList<>;

    /**
     * Constructor
     */
    public KassaRij() {
        // method body omitted
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        Dienblad.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit de rij verwijderen en retourneren. Als er
     * niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        if (Dienblad.size() > 0) {
            return Dienblad.get(0).Dienblad.remove(0);
        } else {
            return null;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        if (Dienblad.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
