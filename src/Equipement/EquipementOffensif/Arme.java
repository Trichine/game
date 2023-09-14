package Equipement.EquipementOffensif;

public class Arme extends EquipementOffensif{
    public Arme() {
        super("Arme", 10, "abou");
    }

    @Override
    public String toString() {
        return ("Type " +getType()+ "niveau d attaque " +getNiveauDattaque()+ "le nom " + getNom());
    }
}
