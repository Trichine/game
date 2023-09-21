package Cases ;
public class Arme implements Case {
    private String nom;
    private int niveauDeForc;

    public Arme(String nom, int niveauDeForc) {

        this.nom = nom;
        this.niveauDeForc =niveauDeForc;
    }

    @Override
    public void action() {
        System.out.println("Vous avez trouver : " + nom +"une niveau de force " + niveauDeForc);

    }

    public String toString(){
        return "Vous êtes sur une case arme contenant -> " + nom + "avec une force de " + niveauDeForc;
    }
}

