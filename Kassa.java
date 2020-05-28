import java.util.Iterator;

public class Kassa {

    private int geldInKassa;
    private int gepasseerdeArtikelen;

    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        this.kassarij;
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op. Tel deze gegevens op bij de controletotalen
     * die voor de kassa worden bijgehouden. De implementatie wordt later vervangen door een echte
     * betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        klant.getAantalArtikelen();
        klant.getTotaalPrijs();
    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd, vanaf het moment dat de methode
     * resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        gepasseerdeArtikelen = gepasseerdeArtikelen + klant.getArtikelen();
        return gepasseerdeArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass zijn gepasseerd, vanaf het moment dat
     * de methode resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        geldInKassa = geldInKassa + getTotaalPrijs();
        return geldInKassa;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en de totale hoeveelheid geld in de
     * kassa.
     */
    public void resetKassa() {
        geldInKassa = 0;
        gepasseerdeArtikelen = 0;
    }
}
