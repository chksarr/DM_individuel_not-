package test;

import static test.Verification.*;
import sodas.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test5 {
	public static void main(String[] args) {
		Soda limonade = new Soda(Gout.CITRON, false);
	    Soda colazero = new Soda(Gout.COLA, true);
	    Soda energisantblanc = new Soda(Gout.CITRON, true);
        PireSoda energisantbleu = new PireSoda( Gout.MYRTILLE, Colorant.E132);
        PireSoda pchit = new PireSoda( Gout.CERISE, Colorant.E127);
        System.out.println(pchit.getColorant());
	    	          
        MeilleurPanier monMeilleurPanier = new MeilleurPanier();
        monMeilleurPanier.ajouter(colazero);
        monMeilleurPanier.ajouter(limonade);
        monMeilleurPanier.ajouter(limonade);
        
        /* test de la methode nombreArticles de MeilleurPanier apres ajout de 3 Soda */        
        verifieVrai( monMeilleurPanier.nombreArticles() == 3);       
 
        /* test de la methode nombreArticles de MeilleurPanier apres ajout de 3 Soda et 1 PireSoda interdit*/        
        monMeilleurPanier.ajouter(energisantbleu);
        verifieVrai( monMeilleurPanier.nombreArticles() == 3);  
        
        /* test de la methode nombreArticles de MeilleurPanier apres ajout de 3 Soda et 2 PireSoda autorises */        
        monMeilleurPanier.ajouter(pchit);
        monMeilleurPanier.ajouter(pchit);
        verifieVrai( monMeilleurPanier.nombreArticles() == 5);     
        
        /* test de la methode toString de MeilleurPanier apres ajout de 3 Soda et 2 PireSoda autorises */
        verifieEgalite( monMeilleurPanier.toString(), "[Soda au gout cola + edulcorant, "
        		+ "Soda au gout citron, "
        		+ "Soda au gout citron, "
        		+ "Soda au gout cerise + edulcorant + cerise, "
        		+ "Soda au gout cerise + edulcorant + cerise]");
        System.out.println(monMeilleurPanier.toString());
        
        /* test de la methode tauxDeSucreMoyen de MeilleurPanier apres ajout de 3 Soda et 2 PireSoda autorises */               
        verifieEgalite( monMeilleurPanier.tauxDeSucreMoyen(), 0.42f);

        /* test de la methode nombreDe de PanierSansColorantsInterdits apres ajout de 3 Soda et 2 PireSoda autorises */               
        verifieVrai( monMeilleurPanier.nombreDe(limonade) == 2);
        verifieVrai( monMeilleurPanier.nombreDe(colazero) == 1);
        verifieVrai( monMeilleurPanier.nombreDe(pchit) == 2);
        verifieVrai( monMeilleurPanier.nombreDe(energisantblanc) == 0);
	}
}
