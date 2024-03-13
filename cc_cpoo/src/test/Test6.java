package test;

import static test.Verification.*;
import sodas.*;

public class Test6 {
	public static void main(String[] args) {
		Soda limonade = new Soda(Gout.CITRON, false);
	    Soda colazero = new Soda(Gout.COLA, true);
	    Soda energisantblanc = new Soda(Gout.CITRON, true);
        PireSoda energisantbleu = new PireSoda( Gout.MYRTILLE, Colorant.E132);
        PireSoda pchit = new PireSoda( Gout.CERISE, Colorant.E127);

        MeilleurPanier monMeilleurPanier = new MeilleurPanier();
        monMeilleurPanier.ajouter(colazero);
        monMeilleurPanier.ajouter(limonade);
        monMeilleurPanier.ajouter(limonade);
        monMeilleurPanier.ajouter(pchit);
        monMeilleurPanier.ajouter(pchit);
        verifieVrai( monMeilleurPanier.nombreArticles() == 5);

        Panier monPanier = new Panier();
        monPanier.ajouter(limonade);
        monPanier.ajouter(limonade);
        monPanier.ajouter(limonade);
        monPanier.ajouter(limonade);
        monPanier.ajouter(energisantblanc);
        monPanier.ajouter(energisantbleu);
        monPanier.ajouter(energisantbleu);
        monPanier.ajouter(energisantbleu);
        monPanier.ajouter(new PireSoda(Gout.COLA, Colorant.E127));
        verifieVrai( monPanier.nombreDe(limonade) == 4);
        verifieVrai( monPanier.nombreDe(energisantblanc) == 1);
        verifieVrai( monPanier.nombreDe(energisantbleu) == 3);
        verifieVrai( monPanier.nombreDe(pchit) == 0);
        verifieVrai( monPanier.nombreDe(new PireSoda(Gout.COLA, Colorant.E127)) == 1);

        /* test de la methode repartir de Panier pour 2 paniers qui contiennent en tout :
         * 6 limonade, 1 colazero, 2 pchit, 1 energisantblanc, 3 energisantbleu, 2 PireSoda au cola
         * => apres repartition equitable, chaque panier type doit contenir au moins 3 limonade, 1 pchit et 1 energisant bleu
         */
        Panier panierType = Panier.repartir(monPanier, monMeilleurPanier);
        verifieVrai( panierType.nombreDe(limonade) == 3);
            verifieVrai( panierType.nombreDe(pchit) == 1);
        verifieVrai( panierType.nombreDe(energisantbleu) == 1);
        verifieVrai( panierType.nombreArticles() == 5);

        /* test de la methode repartir de Panier pour des paniers tous identiques*/
        verifieVrai(Panier.repartir(monPanier, monPanier, monPanier, monPanier).nombreArticles() == monPanier.nombreArticles());
        verifieVrai(Panier.repartir(monMeilleurPanier, monMeilleurPanier, monMeilleurPanier, monMeilleurPanier,
        		monMeilleurPanier,monMeilleurPanier,monMeilleurPanier).nombreArticles() == monMeilleurPanier.nombreArticles());
    }
}
