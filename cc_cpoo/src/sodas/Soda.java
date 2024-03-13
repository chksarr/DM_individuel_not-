package sodas;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Objects;
/**
 * Classe représentant un Soda.
 */
public class Soda {
    protected Gout gout; // Le goût du soda
    protected boolean edulcorant ; // Indique la présence d'édulcorant

    /**
     * Constructeur pour initialiser un Soda avec un goût donné et par défaut avec édulcorant.
     *
     * @param gout Le goût du soda.
     */
    public Soda(Gout gout) {
        this(gout, true);
    }

    /**
     * Constructeur pour initialiser un Soda avec un goût donné et une indication sur la présence d'édulcorant.
     *
     * @param gout Le goût du soda.
     * @param edulcorant Indique si le soda contient de l'édulcorant ou non.
     */
    public Soda(Gout gout, boolean edulcorant) {
        this.gout = gout;
        this.edulcorant = edulcorant;
    }
    /**
     * Vérifie l'égalité entre deux objets Soda en comparant leur goût et la présence d'édulcorant.
     *
     * @param o L'objet à comparer avec le Soda actuel.
     * @return true si les objets sont égaux, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || getClass() !=o.getClass()) return false;
        Soda soda = (Soda)o;
        return Objects.equals(this.gout , soda.gout) && Objects.equals(edulcorant , soda.edulcorant);
    }

    /**
     * Génère une représentation textuelle du Soda, indiquant son goût et la présence d'édulcorant.
     *
     * @return Une chaîne de caractères décrivant le Soda.
     */
    @Override
    public String toString() {
        String deb = "Soda au gout ";
        String fin =  " + edulcorant";
        if (edulcorant == true)
             return deb + gout.toString().toLowerCase()+ fin;
        return  deb + gout.toString().toLowerCase();
    }

    /**
     * Génère un code de hachage en prenant en compte le goût et la présence d'édulcorant du Soda.
     *
     * @return Le code de hachage du Soda.
     */
    @Override
    public int hashCode() {
        return Objects.hash(gout, edulcorant);
    }
    /**
     * Calcule et retourne le taux de sucre moyen du soda.
     *
     * @return Le taux de sucre moyen du soda.
     */
    public float tauxDeSucreMoyen() {
        if(edulcorant== true)
            return 0.1f;
        return 0.6f;
    }


}
