import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    private String getStringResult(String question) {

        return getStringResult(question);
    }

    public int getIntResult(String question) {
        try {
            return Integer.parseInt(getResult(question));
        } catch (NumberFormatException e) {
            return getIntResult(question);
        }
    }

    private String getResult(String question) {
        System.out.println(question);
        return scanner.next();
    }

    public void optionCreePers() {
        scanner.nextLine();
        System.out.println("Entrez le nouveau nom du personnage : ");
        String nom = scanner.nextLine();

        System.out.println("Entrez le nouveau type du personnage : ");
        String type = scanner.nextLine();


        Personnage nouveauPersonnage = new Personnage(nom, type);
        System.out.println("Votre personnage est : " + nouveauPersonnage.getNom() + "\n de type " + nouveauPersonnage.getType() + "\n de niveau de vie : " + nouveauPersonnage.getNiveauDeVie() + "\n avec une force magique : de " + nouveauPersonnage.getForcedattaque() + "\n il porte un equipment Offensif : " + nouveauPersonnage.getEquipementOffensif() + "\n et un equipment Defensive : " + nouveauPersonnage.getEquipementDefensif());
    }

    Plateau plateau = new Plateau();

    // ...

    public void demarrerPartie() {
        System.out.println("Démarrer la partie !");
        while (plateau.getPosition() < 64) {
            System.out.println("Appuyez sur Entrée pour lancer le dé.");
            scanner.nextLine();
            plateau.lancerDe();
        }
        System.out.println("Voulez-vous recommencer une partie ? (O/N)");
        String choix = scanner.nextLine();
        if (choix.equalsIgnoreCase("O")) {
            plateau.avancer(-plateau.getPosition() + 1);

        } else {
            System.out.println("Merci d'avoir joué !");
        }
    }

    public void afficherMenu() {
        int create = getIntResult("Principal menu : \n1 cree une nouvelle personnage\n2 la liste des Personnage\n3 commencer le jeux  \n4 Quite le menus");
        switch (create) {
            case 1: {
                System.out.println("1.Vous avez chois l'Option 1");
                optionCreePers();
                demarrerPartie();
                afficherMenu();

                break;
            }
            case 2: {

                System.out.println("2. Vous avez chois l'Option 2 la liste des personages elle est pas configure choisissez l option 1 pour cree votre personnage");
                afficherMenu();
            }

            break;
            case 3: {
                System.out.println("Go go go");
                demarrerPartie();
                afficherMenu();
            }
            case 4: {
                System.out.println("4. A bientôt");
            }
            break;
        }
    }
}


