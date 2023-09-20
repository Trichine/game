package Cases;

public class Ennemi implements Case {
    private String nom;
    public Ennemi(String nom) {

        this.nom = nom;
    }
    @Override
    public void action() {
        System.out.println("Vous avez rencontré un ennemi !" + nom);
    }

    public String toString(){
        return "Vous êtes sur une case ennemi qui est -> "+ nom;
    }
}

