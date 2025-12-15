public class Joueur {
    //                ATTRIBUTS
    // Caractéristiques du joueur
    private String nom;
    private Personnage[] equipe;

    //                 CONSTRUCTEUR
    // Crée un nouveau joueur avec son nom
    public Joueur(String nom) {
        this.nom = nom;
        this.equipe = new Personnage[3];
    }
    //                  MÉTHODE 1
    public Personnage choisirPersonnageVivant() {
        for (Personnage p : equipe) {
            if (p != null && p.estVivant()) {
                return p;
            }
        }
        return null;  // Aucun personnage vivant
    }
    //                   METHODE 2
    public boolean aEncoreDesPersonnagesVivants() {
        // Cherche au moins un personnage vivant
        for (Personnage p : equipe) {
            if (p != null && p.estVivant()) {
                return true;
            }
        }
        return false;
    }
    // Affiche tous les personnages de l'équipe
    public void afficherEquipe() {
        System.out.println("Équipe de " + nom + ":");
        // Affiche chaque personnage qui existe
        for (Personnage p : equipe) {
            if (p != null) {
                p.afficherEtat();
            }
        }
    }
    // ========== GETTER/SETTER ==========
    public String getNom() {
        return nom;
    }

    // Place un personnage à une position spécifique (0, 1 ou 2)
    public void setPersonnage(Personnage p, int index) {
        if (index >= 0 && index < 3) {
            equipe[index] = p;
        }
    }

