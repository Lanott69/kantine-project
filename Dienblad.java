import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad {
    private ArrayList<Artikel> artikelen;
    private ArrayList<Persoon> klanten;

    /**
     * Constructor
     */
    public Dienblad() {
        ArrayList artikelen = new ArrayList();
    }

    public Dienblad(Persoon klant) {
        ArrayList<Persoon> klanten = new ArrayList();
        klanten.add(klant);
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen() {
       int aantalArtikelen = artikelen.size();
       return aantalArtikelen;
    }

    /**
     * Methode om de totaalprijs van de artikelen op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        while (artikelen.hasNext()) {
            float totaalPrijs = totaalPrijs + Artikel.prijs;
        }
    }
}

