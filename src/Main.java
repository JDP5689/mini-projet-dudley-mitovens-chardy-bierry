//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // Création d'un personnage avec le constructeur complet
                Personnage guerrier = new Personnage("Chardy", 100, 25);

                // Création d'un personnage avec le constructeur alternatif (attaque par défaut = 0)
                Personnage mage = new Personnage("Bierry", 80);

                // Affichage des informations
                System.out.println("=== Personnage 1 ===");
                System.out.println("Nom : " + guerrier.getNom());
                System.out.println("Vie : " + guerrier.getVie());
                System.out.println("Attaque : " + guerrier.getAttaque());

                System.out.println("\n=== Personnage 2 ===");
                System.out.println("Nom : " + mage.getNom());
                System.out.println("Vie : " + mage.getVie());
                System.out.println("Attaque : " + mage.getAttaque());

                // Exemple de modification avec setter
                mage.setAttaque(15);
                System.out.println("\nAprès modification, attaque du mage : " + mage.getAttaque());
    }
}
