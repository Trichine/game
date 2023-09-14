package PersParent;

public class Magicien extends Personnage {
    public Magicien(String nom) {
        super(nom, "magicien", 6, 6);
    }

    @Override
    public String toString() {
        return "Nom : " + getNom() + ", Type : " + getType() + ", Niveau de vie : " + getNiveauDeVie() + ", Force : " + getForcedattaque();
    }
}
