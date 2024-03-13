package sodas;

import java.util.ArrayList;
import java.util.List;

import static sodas.Colorant.*;
/**
 * Représente une version améliorée de Panier, le MeilleurPanier, avec une logique d'ajout spécifique pour certains Sodas.
 */
public class MeilleurPanier extends Panier {

    /**
     * Ajoute un Soda au MeilleurPanier en appliquant une logique spécifique pour certains PireSodas.
     * Ne permet pas l'ajout de PireSodas avec certains colorants.
     *
     * @param soda Le Soda à ajouter au panier.
     */
    @Override
    public void ajouter(Soda soda) {
        if (soda instanceof PireSoda && (((PireSoda) soda).getColorant() == E126  ||
                ((PireSoda) soda).getColorant() == E102  ||
                ((PireSoda) soda).getColorant() == E132 )){

            return;
        }
        super.ajouter(soda);
    }


}
