

public class Personnage {
    private String nom;
    private int type;
    private int niveauDeVie;
    private int Forcedattaque;
    private String EquipementOffensif;
    private String EquipementDefensif;

    public Personnage() {
        this.nom = "bouba";
        this.niveauDeVie = 15;
        this.Forcedattaque = 25;
        this.EquipementOffensif = "arme";
        this.EquipementDefensif = "Bouclier";
    }

    public Personnage(String nom) {
        this.nom = nom;
        this.niveauDeVie = 7;
        this.Forcedattaque = 9;
        this.EquipementOffensif = "Epee";
        this.EquipementDefensif = "Bouclier";
    }

    public Personnage(String nom, int type) {
        this.nom = nom;
        this.type = type;
        this.niveauDeVie = 12;
        this.Forcedattaque = 13;
        this.EquipementOffensif = "Epee";
        this.EquipementDefensif = "Bouclier";

    }
}