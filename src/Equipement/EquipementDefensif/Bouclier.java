package Equipement.EquipementDefensif;

public class Bouclier extends EquipementDefensif {
    public Bouclier() {
        super("Bouclier", 10, "olivier");

    }
    public String toString(){
        return ("Type " +getType()+ "niveau defensif " +getNiveauDefensif()+ "le nom " + getNom());
    }
}
