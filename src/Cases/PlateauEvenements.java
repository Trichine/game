package Cases;

import Jeux.Game;
import PersParent.Personnage;

import java.util.ArrayList;
import java.util.Scanner;

public class PlateauEvenements {
    private final ArrayList<Case> evenements = new ArrayList<>();
    private int positionEvenement = 0;

    private final Scanner scanner = new Scanner(System.in);

    public PlateauEvenements() {
        initPlateau();
        System.out.println(evenements);
    }

    private void initPlateau(){
        for (int i = 0; i < 64; i++) {
            evenements.add(new EmptyCase());
        }
        ennemiEvent();
        armeEvent();


    }




    public int plateauSize(){
        return evenements.size();
    }
// mes evenement
    private  void ennemiEvent() {
        evenements.set(2,new Ennemi("Olivier la mafia rebeu",1));
        evenements.set(4,new Ennemi("Ballas",2));
        evenements.set(6,new Ennemi("Los Santos Vagos",13));
        evenements.set(8,new Ennemi("The Lost MC",4));
        evenements.set(10,new Ennemi("Varrios Los Aztecas",6));
        evenements.set(12,new Ennemi("Frères O'Neil",8));
        evenements.set(14,new Ennemi("Marabunta Grande",9));
        evenements.set(16,new Ennemi("Triades de Los Santos",12));
        evenements.set(18,new Ennemi("Cartel Madrazo",15));
        evenements.set(20,new Ennemi("Mafia arménienne",15));
    }

    private void armeEvent() {
        evenements.set(1,new Arme("Carabine",4));
        evenements.set(3,new Arme("Lance-grenades",16));
        evenements.set(5,new Arme("Lance-roquettes",9));
        evenements.set(7,new Arme("Minigun",10));
        evenements.set(9,new Arme("Lance-missiles",13));
        evenements.set(11,new Arme("Mitraillettes",9));
        evenements.set(13,new Arme("Pistolets",8));
        evenements.set(15,new Arme("Fusils de précision",8));
        evenements.set(17,new Arme("Pistolets LOURD",11));
        evenements.set(19,new Arme("Pistolets Mitrailleur",1));
    }
    public int lancerDe() {
        return ((int) (Math.random() * 6) + 1);
    }
    public String caseInfo(int i){
        return evenements.get(i).toString();
    }
    //gestion de combat
    public void timeToFight(int positionPlayer, Personnage current) throws PersonnageMortException {
        if (evenements.get(positionPlayer) instanceof Ennemi ennemi) {
            while (ennemi.getNiveaudeVie() > 0) {
                System.out.println("Votre ennemi a : " + ennemi.getNiveaudeVie() + " en point(s) de vie");
                System.out.println("Vous avez : " + current.getNiveauDeVie() + " en point(s) de vie");

                System.out.println("Vous frappez l'ennemi");
                ennemi.setNiveaudeVie(ennemi.getNiveaudeVie() - current.getForcedattaque());

                if (ennemi.getNiveaudeVie() <= 0) {
                    ennemi.setAlive(false);
                    System.out.println("Vous avez vaincu l'ennemi.");
                }

                if (ennemi.isAlive()) {
                    System.out.println("L'ennemi vous frappe à son tour : ");
                    current.setNiveauDeVie(current.getNiveauDeVie() - ennemi.getNiveauDeForc());
                    System.out.println("Il vous reste " + current.getNiveauDeVie() + " point(s) de vie");
                }

                if (current.getNiveauDeVie() <= 0) {
                    throw new PersonnageMortException("Vous êtes mort.");
                }
            }
        } else if (evenements.get(positionPlayer) instanceof Arme arme) {
            System.out.println("Vous avez trouvé une arme : " + arme.getNom() + " avec une force de " + arme.getNiveauDeForc());
            System.out.println("Voulez-vous prendre cette arme ? \n1 Oui \n2 Non");
            int takeWeaponResponse = scanner.nextInt();
            if (takeWeaponResponse == 1) {
                System.out.println("Vous avez pris l'arme " + arme.getNom() + ".");
                System.out.println("Votre nouveau niveau de vie est de : " + current.getNiveauDeVie());
            }
        }
    }


    public void avancer(int cases) {
        for (int i = 1; i < cases; i++) {
            evenements.add(new EmptyCase());
            System.out.println("Liste vide");
        }
        System.out.println("vous-étes dans la case : " + cases);
        action();
    }

    public void action() {
        Case caseCourante = evenements.get(positionEvenement);
        caseCourante.action();
    }
    public int getPositionEvenement() {
        return positionEvenement;
    }
    public Case getCaseAt(int position) {
        if (position >= 0 && position < evenements.size()) {
            return evenements.get(position);
        }
        return null; //  invalide

    }
}
