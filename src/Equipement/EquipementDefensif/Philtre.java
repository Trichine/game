package Equipement.EquipementDefensif;

public class Philtre extends EquipementDefensif{

    public Philtre() {
        super("Philtre", 12, "youyou");
    }
    public String toString(){
        return ("type " + getType() + "niveau de defense " + getNiveauDefensif() + "le nom est : " + getNom());
    }
}
