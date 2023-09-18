package Jeux;
import java.util.ArrayList;
import Cases.*;
public class Plateau {
    ArrayList<Integer> position= new ArrayList<Integer>();


    public Plateau() {
        position.add(0);
    }

    public void lancerDe() {
        int de = (int) (Math.random() * 6) + 1;
        avancer(de);
    }

    public void avancer(int cases) {
        int newPosition = position.get(position.size() - 1) + cases;
        if (newPosition >= 64) {
            System.out.println("FÉLICITATIONS, VOUS AVEZ GAGNÉ.");

            newPosition = 64;



        }
        position.add(newPosition);
        System.out.println("BRAVO, VOUS AVANCEZ SUR LA CASE " + newPosition + " / 64");
    }

    public int getPosition(){
    return  position.get(position.size() - 1);
    }


}