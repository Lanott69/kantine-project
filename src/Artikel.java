
/**
 * Write a description of class Artikel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Artikel
{
    private String naam;
    private static double prijs;
    
    public Artikel(String naam, double prijs)
    {
        this.naam = naam;
        this.prijs = prijs;
    }
    
    public Artikel()
    {
        
    }

    private void setNaam(String naam)
    {
        this.naam = naam;
    }
    
    private void setPrijs(double prijs)
    {
        this.prijs = prijs;
    }
    
    public String getNaam()
    {
        return naam;
    }
    
    public static double getPrijs()
    {
        return prijs;
    }
    
    public String toString()
    {
        return naam + "\n" + prijs;
    }
}
