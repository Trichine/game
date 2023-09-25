package Jeux;
import Cases.PlateauEvenements;
import PersParent.Personnage;
import Cases.*;
import java.util.Scanner;

public class Game {
    private final PlateauEvenements plateau;
    private final Scanner scanner;
    private Menu menu;

    public Game(Menu menu) {
        this.plateau = new PlateauEvenements();
        this.scanner = new Scanner(System.in);
        this.menu = menu;
    }

    /**
     *
     * @param current les info du joueurs
     */

    public void play(Personnage current)  {
        int positionPlayer = 0;

        while (positionPlayer < plateau.plateauSize()) {
            boolean continu = false;
            menu.showInfos("Vous êtes sur la case : " + positionPlayer + "/" + plateau.plateauSize() + "\r\n");
            int response = menu.getIntResult("Voulez-vous jeter les dés ? \n1 Oui \n2 Abandonner et retourner au menu principal \n3 Quitter le jeu");

            switch (response) {
                case 1 -> continu = true;
                case 2 -> menu.afficherMenu();
                case 3 -> {
                    if (!menu.showDialog("Au revoir")) System.exit(0);
                    else menu.afficherMenu();
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
                    plateau.timeToFight(positionPlayer, current);

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
