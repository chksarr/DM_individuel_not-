package test;

import static test.Verification.*;
import sodas.*;

public class Test2 {
	public static void main(String[] args) {
		Soda limonade = new Soda(Gout.CITRON, false);
		Soda colazero = new Soda(Gout.COLA, true);
		Soda energisantblanc = new Soda(Gout.CITRON, true);	    
		Panier monPanier = new Panier();
        monPanier.ajouter(colazero); 
        monPanier.ajouter(energisantblanc); 
        monPanier.ajouter(limonade); 
        monPanier.ajouter(colazero);
       
        
        
       	 /* test de la methode toString de Panier apres ajout de 4 Soda */
       	 verifieEgalite( monPanier.toString(), "[Soda au gout cola + edulcorant, "
        		+ "Soda au gout citron + edulcorant, Soda au gout citron, "
        		+ "Soda au gout cola + edulcorant]");

        
       	/* test de la methode tauxdeSucreMoyen de Panier apres ajout de 4 Soda */
//        verifieEgalite( monPanier.tauxDeSucreMoyen(), 0.225f);
//
//        /* test de la methode nombreArticles de Panier apres ajout de 4 Soda */
//        verifieVrai( monPanier.nombreArticles() == 4);
//
//        /* test de la methode contenu de Panier apres ajout de 4 Soda */
//        verifieVrai( monPanier.contenu().size() == 4);
//        verifieEgalite( monPanier.contenu().toString(), monPanier.contenu().toString());
//
//
//        /* test des methodes avec un panier vide */
//        Panier vide = new Panier();
//        verifieEgalite( vide.toString(), "[]");
//        verifieEgalite( vide.tauxDeSucreMoyen(), 0f);
//        verifieVrai( vide.nombreArticles() == 0);
	}
}
