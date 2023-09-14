package Equipement.EquipementOffensif;

public class Sort extends EquipementOffensif{
    public Sort() {
        super("Sort", 12, "seb");
    }

    public String toString(){
        return ("Type " +getType()+ "niveau d attaque " +getNiveauDattaque()+ "le nom " + getNom());
    }
}
