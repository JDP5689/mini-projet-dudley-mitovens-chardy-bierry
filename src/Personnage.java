// creation de la classe Personnage
public class Personnage {
    private int vie;
    private int attaque;
    private String nom;

    // Constructeur complet
    public Personnage(String nom, int vie, int attaque) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
    }

    // Constructeur alternatif
    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = 0; // valeur par défaut
    }

    /** Accesseurs */
    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}