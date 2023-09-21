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

        while (positionPlayer < plateau.plateauSize()){

            // Initialiser un boolean à false à chaque tour de boucle
            // Menu demandant de lancer les dé ou retour menu principal ou quitter le program
            // si 1 Passer la valeur du boolean à true pour que le programme entre dans la bonne condition
            // si 2 instancier un menu et appeler la method pour le menu principal
            // si 3 exit 0  stop le programme

            // Une condition pour gérer le cas ou la positionPlayer est supérieure ou égale à la taille du plateau
            // si position est supérieur ou égale à la taille du plateau alors afficher  Vous avez gagné.


            boolean continu = false;
            System.out.println("Vous êtes sur la case : "+ positionPlayer + "/" + plateau.plateauSize());


            System.out.println("Voulez-vous jetez les dés ? \n1 Oui \n2 Abandonner et retourner au menu principal \n3 Quitter le jeu");
            int response = scanner.nextInt();
            switch (response){
                case 1 -> continu = true;
                case 2 -> new Menu().afficherMenu();
                case 3 -> {
                    System.out.println("Au revoir");
                    System.exit(0);
                }
            }

            if (continu) {
                positionPlayer += plateau.lancerDe();
                if (positionPlayer >= plateau.plateauSize()){
                    System.out.println("Vous avez gagné");
                    new Menu().afficherMenu();
                }
            }

            if (current.getNiveauDeVie() <= 0) {
                System.out.println("Votre personnage est mort !");
                new Menu().afficherMenu();
            }

            // Condition si le current est sur une Case de type Ennemy
            if (plateau.caseInfo(positionPlayer).contains("ennemi") ) {
                plateau.timeToFight(positionPlayer, current);
//                while(current.getNiveauDeVie() > 0) {
//
//                }
            }
//            System.out.println("Niveau de vie : " + current.getNiveauDeVie());
//            Case evenement = plateau.getCaseAt(positionPlayer);
//            if (evenement != null) {
//                evenement.action();
//            }

            System.out.println(plateau.caseInfo(positionPlayer));
        }
    }
}
/*
 if (current.getNiveauDeVie() <= 0) {
                System.out.println("Votre personnage est mort !");
                new Menu().afficherMenu();
            }
            System.out.println("Niveau de vie : " + current.getNiveauDeVie());
            Case evenement = plateau.getCaseAt(positionPlayer);
            if (evenement != null) {
                evenement.action();
            }}
 */