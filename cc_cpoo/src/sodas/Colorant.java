package sodas;
/**
 * Énumération représentant différents colorants pour les sodas.
 */
public enum Colorant {
    E127("cerise"), E126("rouge"), E102("jaune"), E110("orange"), E132("bleu"), E142("vert");
    private String color;
    /**
     * Constructeur privé pour l'énumération Colorant.
     *
     * @param color La couleur associée au colorant
     */
    public String getColor() {
        return color;
    }
    /**
     * Renvoie la couleur associée au colorant.
     *
     * @return La couleur du colorant
     */
    Colorant(String color) {
        this.color = color;
    }
}
