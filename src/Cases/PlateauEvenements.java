package Cases;

import java.util.ArrayList;



public class PlateauEvenements {
    private final ArrayList<Case> evenements = new ArrayList<>();
    private int positionEvenement = 0;


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

    private void ennemiEvent() {
        evenements.set(2,new Ennemi("Olivier la mafia rebeu"));
        evenements.set(4,new Ennemi("Ballas"));
        evenements.set(6,new Ennemi("Los Santos Vagos"));
        evenements.set(8,new Ennemi("The Lost MC"));
        evenements.set(10,new Ennemi("Varrios Los Aztecas"));
        evenements.set(12,new Ennemi("Frères O'Neil"));
        evenements.set(14,new Ennemi("Marabunta Grande"));
        evenements.set(16,new Ennemi("Triades de Los Santos"));
        evenements.set(18,new Ennemi("Cartel Madrazo"));
        evenements.set(20,new Ennemi("Mafia arménienne"));
    }

    private void armeEvent() {
        evenements.set(1,new Arme("Carabine"));
        evenements.set(3,new Arme("Lance-grenades"));
        evenements.set(5,new Arme("Lance-roquettes"));
        evenements.set(7,new Arme("Minigun"));
        evenements.set(9,new Arme("Lance-missiles"));
        evenements.set(11,new Arme("Mitraillettes"));
        evenements.set(13,new Arme("Pistolets"));
        evenements.set(15,new Arme("Fusils de précision"));
        evenements.set(17,new Arme("Pistolets LOURD"));
        evenements.set(19,new Arme("Pistolets Mitrailleur"));
    }
    public int lancerDe() {
        return ((int) (Math.random() * 6) + 1);
    }


    public void avancer(int cases) {
        for (int i = 1; i < cases; i++) {
            evenements.add(new EmptyCase());
            System.out.println("Liste vide");
 //            positionEvenement = positionEvenement.get(positionEvenement.size() - 1) + cases;
 //           if (positionEvenement >= evenements.size()) {
 //               positionEvenement = evenements.size() - 1;

   //         }
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
}
