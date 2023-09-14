package Jeux;
import PersParent.*;
public class Plateau {
    private int position = 1;

    public void lancerDe() {
        int de = (int) (Math.random() * 6) + 1;
        avancer(de);
    }

    public void avancer(int cases) {
        position += cases;
        if (position > 64) {
            System.out.println("FELECITTION VOUS AVEZ GAGNE.");
            position = 64;
        }
        System.out.println("BRAVO VOUS AVENCEZ SUR :LA  case " + position + " / 64");
    }

    public int getPosition() {
        return position;
    }
}
