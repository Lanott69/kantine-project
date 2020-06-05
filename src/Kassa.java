import java.util.Iterator;

public class Kassa {
    
    private KassaRij kassarij;
    private Dienblad dienblad;
    private int aantalArtikelen;
    private double kassaInhoud;

    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        this.kassarij = kassarij;
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op. Tel deze gegevens op bij de controletotalen
     * die voor de kassa worden bijgehouden. De implementatie wordt later vervangen door een echte
     * betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        kassaInhoud = kassaInhoud + klant.getTotaalPrijs();
    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd, vanaf het moment dat de methode
     * resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return aantalArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass zijn gepasseerd, vanaf het moment dat
     * de methode resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return kassaInhoud;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en de totale hoeveelheid geld in de
     * kassa.
     */
    public void resetKassa() {
        aantalArtikelen = 0;
        kassaInhoud = 0.0;
    }

    public int dienbladArtikelen(Dienblad dienblad) {
        int artikelenaantal = 0;
        Iterator itr = dienblad.getIterator();
        while (itr.hasNext()) {
            artikelenaantal++;
            itr.next();
        } return artikelenaantal;
    }

    public double totaalPrijs(Dienblad dienblad) {
        double totaal = 0;
        Iterator itr = dienblad.getIterator();
        while (itr.hasNext()) {
            totaal += Artikel.getPrijs();
            itr.next();
        } return totaal;
    }
}
