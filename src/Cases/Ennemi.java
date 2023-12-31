package Cases;

import PersParent.Combattant;

public class Ennemi implements Case, Combattant {
    private String nom;
    private final int niveauDeForc;
    private int niveaudeVie = 2;
    private boolean isAlive;
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

    public void setNiveaudeVie(int niveaudeVie) {
        this.niveaudeVie = niveaudeVie;
    }

    @Override
    public boolean isAlive() {
        return this.niveaudeVie>0;
    }

    public boolean receiveAttack(Combattant fighter) {
        this.niveaudeVie-= fighter.getForcedattaque();
        if(this.isAlive()) fighter.receiveAttack(this);
        return isAlive();
    }

    @Override
    public int getForcedattaque() {
        return this.niveauDeForc;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

