package test;

import sodas.Gout;
import sodas.Soda;
import static test.Verification.*;

public class Test1 {
	public static void main(String[] args) {
	    Soda limonade = new Soda(Gout.CITRON, false);
	    Soda colazero = new Soda(Gout.COLA, true);
	    Soda energisantblanc = new Soda(Gout.CITRON, true);

	    
	    /* test de la methode toString de Soda */
	    verifieEgalite( limonade.toString(), "Soda au gout citron");
	    verifieEgalite( colazero.toString(), "Soda au gout cola + edulcorant");
	    verifieEgalite( energisantblanc.toString(), "Soda au gout citron + edulcorant");
	    	    
	    /* test de la methode equals de Soda */
        verifieVrai( limonade.equals(new Soda(Gout.CITRON, false)));
	    verifieVrai( limonade.equals(limonade));
	    verifieVrai( colazero.equals(new Soda(Gout.COLA)));	    
	    verifieFaux( energisantblanc.equals(limonade));
	    verifieFaux( colazero.equals(null));
	    verifieFaux( colazero.equals(energisantblanc));
	    verifieFaux( limonade.equals( "Soda au gout citron"));
	 }
}
