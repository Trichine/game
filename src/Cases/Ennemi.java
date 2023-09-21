package Cases;

public class Ennemi implements Case {
    private String nom;
    private int niveauDeForc;
    private int niveaudeVie = 2;

    boolean isAlive;
    public Ennemi(String nom ,int niveauDeForc) {

        this.nom = nom;
        this.niveauDeForc = niveauDeForc;
    }
    @Override
    public void action() {
        System.out.println("Vous avez rencontré un ennemi !" + nom + "avec un niveau de vie --> " + niveauDeForc);
    }

    public String toString(){
        return "Vous êtes sur une case ennemi qui est -> "+ nom + "avec un niveau de vie --> " + niveauDeForc;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauDeForc() {
        return niveauDeForc;
    }

    public int getNiveaudeVie() {
        return niveaudeVie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveauDeForc(int niveauDeForc) {
        this.niveauDeForc = niveauDeForc;
    }

    public void setNiveaudeVie(int niveaudeVie) {
        this.niveaudeVie = niveaudeVie;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

