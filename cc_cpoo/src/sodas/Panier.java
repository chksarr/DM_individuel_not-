package sodas;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un panier contenant des Sodas.
 */
public class Panier {
    private List<Soda> panier; // Liste des Sodas dans le panier


    /**
     * Constructeur pour initialiser un panier vide.
     */
    public Panier() {
        this.panier = new ArrayList<>();
    }

    /**
     * Ajoute un Soda au panier.
     *
     * @param s Le Soda à ajouter au panier.
     */
    public  void ajouter (Soda s){
        panier.add(s);
    }

    /**
     * Calcule et retourne le taux de sucre moyen de tous les Sodas dans le panier.
     *
     * @return Le taux de sucre moyen de tous les Sodas dans le panier.
     */
    public float tauxDeSucreMoyen(){
        if (panier.isEmpty()) return 0.0f;
        float result = 0.0f;
        for (Soda s :panier) {
            result += s.tauxDeSucreMoyen();
        }
        return result / panier.size() ;
    }

    /**
     * Renvoie le nombre total d'articles (Sodas) dans le panier.
     *
     * @return Le nombre total d'articles dans le panier.
     */
    public int  nombreArticles (){
       return panier.size();
    }

    /**
     * Renvoie la liste des Sodas dans le panier.
     *
     * @return La liste des Sodas dans le panier.
     */
    public List<Soda> contenu(){
        return  panier;

    }

    /**
     * Compte le nombre de fois où un Soda spécifique apparaît dans le panier.
     *
     * @param soda Le Soda à rechercher dans le panier.
     * @return Le nombre de fois où le Soda spécifié apparaît dans le panier.
     */
    public int nombreDe(Soda soda) {
        int count = 0;
        for (Soda sodas : panier) {
            if (sodas.equals(soda) )
                count++;

        }
        return count;
    }

    /**
     * Renvoie une représentation textuelle du contenu du panier.
     *
     * @return Une chaîne de caractères représentant le contenu du panier.
     */
    @Override
    public String toString() {
        return panier.toString();
    }

    /**
     * Fusionne le contenu des paniers donnés et répartit équitablement les sodas entre un nouveau panier.
     *
     * @param paniers Les paniers à fusionner et répartir
     * @return Un nouveau panier avec une répartition équilibrée des sodas
     */
    public static Panier repartir(Panier... paniers) {
        List<Soda> allSodas = new ArrayList<>();
        for (Panier panier : paniers) {
            allSodas.addAll(panier.contenu());
        }

        Panier panierType = new Panier();
        for (Soda soda : allSodas) {
            int occurrences = 0;
            for (Panier panier : paniers) {
                occurrences += panier.nombreDe(soda);
            }

            int expectedOccurrences = occurrences / paniers.length;
            while (panierType.nombreDe(soda) < expectedOccurrences) {
                panierType.ajouter(soda);
            }
        }

        return panierType;
    }



}
