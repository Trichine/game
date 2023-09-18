package Cases ;
public class Arme implements Case {
    private String nom;

    public Arme(String nom) {

        this.nom = nom;
    }

    @Override
    public void action() {
        System.out.println("Vous avez trouver : " + nom);

    }
}

