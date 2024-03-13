package sodas;

import java.util.Objects;
/**
 * Représente une variante de Soda, le PireSoda, avec un ajout de colorant.
 */
public class PireSoda extends Soda{
    private Colorant colorant;  // Le colorant ajouté au PireSoda

    /**
     * Constructeur pour initialiser un PireSoda avec un goût, en indiquant la présence d'édulcorant et en spécifiant le colorant.
     *
     * @param gout Le goût du PireSoda.
     * @param colorant Le colorant ajouté au PireSoda.
     */
    public PireSoda(Gout gout, Colorant colorant) {
        super(gout, true);
        this.colorant = colorant;
    }

    /**
     * Vérifie si deux PireSodas sont égaux en comparant leur goût, la présence d'édulcorant et le colorant ajouté.
     *
     * @param o L'objet à comparer avec le PireSoda actuel.
     * @return true si les objets sont égaux, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PireSoda pireSoda)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(colorant , pireSoda.colorant) ;
    }
    /**
     * Génère un code de hachage en prenant en compte le goût, la présence d'édulcorant et le colorant du PireSoda.
     *
     * @return Le code de hachage du PireSoda.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colorant);
    }

    /**
     * Génère une représentation textuelle du PireSoda, incluant le goût, la présence d'édulcorant et le colorant.
     *
     * @return Une chaîne de caractères décrivant le PireSoda.
     */
    @Override
    public String toString() {
        return super.toString() + " "+ "+ "+ this.colorant.getColor();
    }

    /**
     * Calcule et retourne le taux de sucre moyen du PireSoda en fonction du colorant ajouté.
     *
     * @return Le taux de sucre moyen du PireSoda en fonction du colorant.
     */
    @Override
    public float tauxDeSucreMoyen() {
        if ( colorant== Colorant.E132)
             return 0.8f;
        return 0.4f;
    }

    /**
     * Récupère le colorant ajouté au PireSoda.
     *
     * @return Le colorant du PireSoda.
     */
    public Colorant getColorant() {
        return colorant;
    }
}
