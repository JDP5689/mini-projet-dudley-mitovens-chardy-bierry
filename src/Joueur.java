public class Joueur {
    // ========== ATTRIBUTS ==========
    // Caractéristiques du joueur
    private String nom;
    private Personnage[] equipe;

    // ========== CONSTRUCTEUR ==========
    // Crée un nouveau joueur avec son nom
    public Joueur(String nom) {
        this.nom = nom;
        this.equipe = new Personnage[3];
    }
