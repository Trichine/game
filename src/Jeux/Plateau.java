package Jeux;

public class Plateau {
    public int[] position = new int[1];

    public Plateau() {
        position[0] = 0;
    }

    public void lancerDe() {
        int de = (int) (Math.random() * 6) + 1;
        avancer(de);
    }

    public void avancer(int cases) {
        position[0] += cases;
        if (position[0] >= 64) {
            System.out.println("FÉLICITATIONS, VOUS AVEZ GAGNÉ.");
            position[0] = 64;
        }
        System.out.println("BRAVO, VOUS AVANCEZ SUR LA CASE " + position[0] + " / 64");
    }

    public int getPosition() {
        return position[0];
    }


}