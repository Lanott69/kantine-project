public class Contant extends Betaalwijze {
    /**
     * Methode om betaling af te handelen
     */
    public void betaal(double tebetalen) {
        if(saldo >= tebetalen)
        {
            saldo -= tebetalen;
            return;
        }
        throw new TeWeinigGeldException("Niet genoeg saldo");
        //else
        //{
            //try {
                //    if(saldo < tebetalen)
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

