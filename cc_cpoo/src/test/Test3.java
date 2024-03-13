package test;

import static test.Verification.*;
import sodas.*;

public class Test3 {
	public static void main(String[] args) {
        PireSoda energisantbleu = new PireSoda( Gout.MYRTILLE, Colorant.E132);
        PireSoda pchit = new PireSoda( Gout.CERISE, Colorant.E127);

	    /* test de la methode tauxDeSucreMoyen de PireSoda */
        verifieEgalite(energisantbleu.tauxDeSucreMoyen(),0.8f);
        verifieEgalite(pchit.tauxDeSucreMoyen(),0.4f);

        /* test de la methode toString de PireSoda */
        verifieEgalite(energisantbleu.toString(),"Soda au gout myrtille + edulcorant + bleu");


        /* test de la methode equals de PireSoda */
        verifieFaux(energisantbleu.equals(pchit));
        verifieFaux(energisantbleu.equals(new PireSoda(Gout.MYRTILLE,Colorant.E102)));
        verifieFaux(energisantbleu.equals(new PireSoda(Gout.CITRON,Colorant.E132)));
        verifieFaux(energisantbleu.equals(new Soda(Gout.MYRTILLE,true)));
        verifieFaux(pchit.equals(null));
        verifieVrai(pchit.equals(new PireSoda( Gout.CERISE, Colorant.E127)));

        /* complement de test de la methode equals de Soda */
        verifieFaux(new Soda(Gout.MYRTILLE,true).equals(energisantbleu));
        verifieFaux(new Soda(Gout.MYRTILLE,false).equals(energisantbleu));
	}
}
