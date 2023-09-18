package Cases;


import java.util.ArrayList;

public class PlateauEvenements {
    ArrayList<Case> plateauEvenement = new ArrayList<Case>();
    private int positionPersonnage = 0;
    public PlateauEvenements (){
        plateauEvenement.add(new Ennemi("olivier"));
        plateauEvenement.add (new Arme("Carabine"));

        Case caseCourante = plateauEvenement.get(positionPersonnage );

        if (caseCourante instanceof Arme arme) {
            arme.action();
            positionPersonnage++;

        } else if (caseCourante instanceof Ennemi ennemi) {
            ennemi.action();
            positionPersonnage++;

        }



    }
    public void deplacerPersonnage(ArrayList <Integer> position ) {

        System.out.println(plateauEvenement.get(position.get(0)));
    }
}