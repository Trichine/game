package Jeux;

import PersParent.*;
import java.util.Scanner;
public class Menu {
    private final Scanner scanner = new Scanner(System.in);

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
        String choix;
        do {
            System.out.println("Choisissez un type de personnage :");
            System.out.println("1. Guerrier");
            System.out.println("2. Magicien");
            choix = scanner.nextLine();
        } while (!choix.equals("1") && !choix.equals("2"));

        if (choix.equals("1")) {
            Guerrier guerrier = creationGuerrier();
            optionModifierPers(guerrier);
        } else {
            Magicien magicien = creationMagicien();
            optionModifierPers(magicien);
        }
    }

    // Un menu demandant à l'utilisateur de choisir un type de personnage (guerrier ou mage)
        // Suivant le choix instancier l'objet correspond au choix example choix 1 = Guerrier guerrier = new Guerrier ce qui instanciera un objet avec des valeurs par défaut
        // Une fois l'objet instancier appel à la fonction montrant le menu avec l'option de modification du personnage courant
        // optionModifierPers(guerrier)
        // L'utilisateur choisis oui ou non
        // Si oui changer la valeur avec loes setters
        // Si non appeller la fonction montrant le menu permettant de lancer une partie à l'utilisateur




    public Guerrier creationGuerrier(){

        System.out.println("Création d'un Guerrier");
        System.out.println("Entrez le nom du Guerrier : ");
        String nom = scanner.nextLine();
        Guerrier guerrier = new Guerrier(nom);
        optionModifierPers(guerrier);

        return guerrier;
    }
    public Magicien creationMagicien(){
        System.out.println("Création d'un Magicien");
        System.out.println("Entrez le nom du Magicien : ");
        String nom = scanner.nextLine();
        Magicien magicien = new Magicien(nom);
        optionModifierPers(magicien);
        return magicien;
    }
    public Personnage modifPersonnage(Personnage current){
        scanner.nextLine();
        System.out.println("Entrez le nouveau nom du personnage : ");
        String nom = scanner.nextLine();
        current.setNom(nom);

        System.out.println("test eq defensif");
        String test1 = scanner.nextLine();
        current.setEquipementDefensif(test1);

        System.out.println("Votre personnage est : " + nom + "\n de type " + current.getType() + "\n de niveau de vie : " + current.getNiveauDeVie() + "\n avec une force magique : de " + current.getForcedattaque() + "\n il porte un equipment Offensif : " + current.getEquipementDefensif() + "\n et un equipment Defensive : " + current.getEquipementOffensif());
        return current;
    }
    public void optionModifierPers(Personnage current) {
        System.out.println("vous etes sur ? (O/N)");
        String choix = scanner.nextLine();
        if (choix.equalsIgnoreCase("O")) {
            modifPersonnage(current);
            System.out.println("confirme ? (O/N)");
            String choix2 = scanner.nextLine();
            if (choix.equalsIgnoreCase("O")) {
                demarrerPartie();
            } else {
                modifPersonnage(current);
            }
        } else {
            afficherMenu();
        }
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
        int create = getIntResult("Principal menu : \n1 cree une nouvelle personnage\n2 la liste des PersParent.Personnage\n3 commencer le jeux  \n4 Quite le menus");
        switch (create) {
            case 1: {
                System.out.println("1.Vous avez chois l'Option 1 cree une nouvelle personnage");
                optionCreePers();
                    System.out.println("Voulez-vous modifier votre personnage ? (O/N)");
                String choix = scanner.nextLine();
                if (choix.equalsIgnoreCase("O")) {
//                    optionModifierPers();
                    demarrerPartie();
                } else {
                    demarrerPartie();
                    afficherMenu();
                }
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
            break;

            case 4: {
                System.out.println("4. A bientôt");
            }
            break;
        }
    }
}


