package Cases;
import java.util.ArrayList;

public class PlateauEvenements {
    ArrayList<Case> plateauEvenement = new ArrayList<Case>();
    private int positionPersonnage = 0;
    public PlateauEvenements (){

        plateauEvenement.add (new Arme("Carabine"));
        plateauEvenement.add(new Ennemi("olivier"));
        Case caseCourante = plateauEvenement.get(positionPersonnage );
        caseCourante.action();

    }
    public void deplacerPersonnage(ArrayList <Integer> position ) {

        System.out.println(plateauEvenement.get(position.get(0)));
    }
}