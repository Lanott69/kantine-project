public class Persoon {

    private int bsn;
    private String voornaam;
    private String achternaam;
    private int dag = 0;
    private int maand = 0;
    private int jaar = 0;
    private char geslacht;

    public Persoon(bsn, voornaam, achternaam, dag, maand, jaar, geslacht) {
        setBSN(bsn);
        setVoornaam();
        setAchternaam();
        setGeboortedatum();
        setGeslacht();
    }

    public Persoon() {

    }

    private void setBSN(bsn) {
        this.bsn;
    }

    private void setVoornaam(voornaam) {
        this.voornaam;
    }

    private void setAchternaam(achternaam) {
        this.achternaam;
    }

    private void setGeboortedatum(dag, maand, jaar) {
        this.dag;
        this.maand;
        this.jaar;
    }

    private void setGeslacht(geslacht) {
        if (geslacht == M || geslacht == V || geslacht == X) {
            this.geslacht;
        }
        else {
            System.out.println("onbekend geslacht")
        }
    }

    public int getBsn() {
        return bsn;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getGeboortedatum() {
        if (dag != 0 && maand != 0 && jaar != 0) {
            Datum.getDatumAsString();
        }
        else {
            return "Onbekend";
        }
    }

    public char getGeslacht() {
        String geslachtString = "";
        if (geslacht == V) {
            geslachtString == "Vrouw";
        }
        else if (geslacht == M) {
            geslachtString == "Man";
        }
        else if (geslacht == X){
            geslachtString == "Intersex";
        }
        else {
            geslachtString == "Onbekend";
        }

        return geslachtString;
    }

    public String toString() {
        String informatie = bsn + " " + voornaam + " " + achternaam + " "
                + dag + "-" + maand + "-" + jaar + " " + geslacht;
        return info;
    }


}