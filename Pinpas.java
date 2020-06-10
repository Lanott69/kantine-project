public class Pinpas extends Betaalwijze {

    private double kredietlimiet;

    /**
     * Methode om kredietlimiet te zetten
     *
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     */
    public void betaal(double tebetalen) {
        if(saldo + kredietlimiet >= tebetalen)
        {
            saldo -= tebetalen;
            return;
        }
        throw new TeWeinigGeldException("niet genoeg saldo of krediet");
        //else
        //{
            //try {
            //    if(saldo + kredietlimiet < tebetalen)
            //    {
            //        throw new TeWeinigGeldException();
            //    }
            //}
            //catch(TeWeinigGeldException e) {
            //    TeWeinigGeldException ex = new TeWeinigGeldException("niet genoeg saldo");
            //}
            
            
        //}
    }
}
