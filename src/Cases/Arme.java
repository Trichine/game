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

    public String toString(){
        return "Vous êtes sur une case arme contenant -> " + nom;
    }
}

