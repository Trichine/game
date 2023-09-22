package Jeux;

import Cases.PlateauEvenements;
import PersParent.Personnage;
import Cases.*;
import java.util.Scanner;

public class Game {
    private final PlateauEvenements plateau;
    private final Scanner scanner;

    public Game() {
        this.plateau = new PlateauEvenements();
        this.scanner = new Scanner(System.in);
    }

    public void play(Personnage current) throws PersonnageMortException {
        int positionPlayer = 0;

        while (positionPlayer < plateau.plateauSize()) {
            boolean continu = false;
            System.out.println("Vous êtes sur la case : " + positionPlayer + "/" + plateau.plateauSize());

            System.out.println("Voulez-vous jeter les dés ? \n1 Oui \n2 Abandonner et retourner au menu principal \n3 Quitter le jeu");
            int response = scanner.nextInt();
            switch (response) {
                case 1 -> continu = true;
                case 2 -> new Menu().afficherMenu();
                case 3 -> {
                    System.out.println("Au revoir");
                    System.exit(0);
                }
            }

            if (continu) {
                positionPlayer += plateau.lancerDe();
                if (positionPlayer >= plateau.plateauSize()) {
                    System.out.println("Vous avez gagné");
                    new Menu().afficherMenu();
                }
            }

            if (current.getNiveauDeVie() <= 0) {
                System.out.println("Votre personnage est mort !");
                new Menu().afficherMenu();
            }

            System.out.println(plateau.caseInfo(positionPlayer));


            if (plateau.caseInfo(positionPlayer).contains("ennemi")) {
                System.out.println("Un ennemi apparaît !");
//                while (current.getNiveauDeVie() > 0) {
                    plateau.timeToFight(positionPlayer, current);
//                }
            } else if (plateau.caseInfo(positionPlayer).contains("arme")) {

                Case currentCase = plateau.getCaseAt(positionPlayer);
                if (currentCase instanceof Arme arme) {
                    System.out.println("Vous avez trouvé une arme : " + arme.getNom() + " avec une force de " + arme.getNiveauDeForc());
                    System.out.println("Voulez-vous prendre cette arme ? \n1 Oui \n2 Non");
                    int takeWeaponResponse = scanner.nextInt();
                    if (takeWeaponResponse == 1) {

                        current.setNiveauDeVie(current.getNiveauDeVie() + arme.getNiveauDeForc());
                        System.out.println("Vous avez pris l'arme " + arme.getNom() + ".");
                        System.out.println("Votre nouveau niveau de vie est de : " + current.getNiveauDeVie());
                    }
                }
            }
        }
    }
}
