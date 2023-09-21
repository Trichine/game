package PersParent;

public class Magicien extends Personnage {
    public Magicien(String nom) {
        super(nom, "magicien", 6, 6,"gillet explosif","pistle a la crémongene");
    }

    @Override
    public String toString() {
        return "Nom : " + getNom() + ", Type : " + getType() + ", Niveau de vie : "
                + getNiveauDeVie() + ", Force : " + getForcedattaque() +
                "equipement offensif"+getEquipementOffensif() +"equipement deffensif"+ getEquipementDefensif();
    }
}
