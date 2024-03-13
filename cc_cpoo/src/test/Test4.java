package test;

import static test.Verification.*;
import sodas.*;

public class Test4 {
	public static void main(String[] args) {
		Soda limonade = new Soda(Gout.CITRON, false);
	    Soda colazero = new Soda(Gout.COLA, true);
	    Soda energisantblanc = new Soda(Gout.CITRON, true);	    
        PireSoda energisantbleu = new PireSoda( Gout.MYRTILLE, Colorant.E132);
        PireSoda pchit = new PireSoda( Gout.CERISE, Colorant.E127);
	    
        Panier monPanier = new Panier();
        monPanier.ajouter(colazero); 
        monPanier.ajouter(energisantblanc); 
        monPanier.ajouter(limonade); 
        monPanier.ajouter(energisantbleu);
        monPanier.ajouter(colazero);          
        monPanier.ajouter(pchit);
        
        /* test de la methode nombreArticles de Panier apres ajout de 4 Soda et 2 PireSoda */
        verifieVrai( monPanier.nombreArticles() == 6);
        
        /* test de la methode tauxDeSucreMoyen de Panier apres ajout de 4 Soda et 2 PireSoda */
        verifieEgalite( monPanier.tauxDeSucreMoyen(), 0.35f);

        
        /* test de la methode toString de Panier apres ajout de 4 Soda et 2 PireSoda */
        verifieEgalite( monPanier.toString(), "[Soda au gout cola + edulcorant, "
        		+ "Soda au gout citron + edulcorant, "
        		+ "Soda au gout citron, "
        		+ "Soda au gout myrtille + edulcorant + bleu, "
        		+ "Soda au gout cola + edulcorant, "
        		+ "Soda au gout cerise + edulcorant + cerise]");

        /* test de la methode nombreDe de Panier apres ajout de 4 Soda et 2 PireSoda */
        verifieVrai( monPanier.nombreDe(limonade) == 1);
        verifieVrai( monPanier.nombreDe(pchit) == 1);
        verifieVrai( monPanier.nombreDe(colazero) == 2);
        verifieVrai( monPanier.nombreDe(new Soda(Gout.COCO)) == 0);
	}
}
