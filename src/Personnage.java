

public class Personnage {
    private String nom;
    private String type;
    private int niveauDeVie;
    private int Forcedattaque;
    private String EquipementOffensif;
    private String EquipementDefensif;

    public Personnage() {
        this.nom = "ABOU";
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

    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
        this.niveauDeVie = 12;
        this.Forcedattaque = 13;
        this.EquipementOffensif = "Epee";
        this.EquipementDefensif = "Bouclier";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public int getForcedattaque() {
        return Forcedattaque;
    }

    public void setForcedattaque(int forcedattaque) {
        Forcedattaque = forcedattaque;
    }

    public String getEquipementOffensif() {
        return EquipementOffensif;
    }

    public void setEquipementOffensif(String equipementOffensif) {
        EquipementOffensif = equipementOffensif;
    }

    public String getEquipementDefensif() {
        return EquipementDefensif;
    }

    public void setEquipementDefensif(String equipementDefensif) {
        EquipementDefensif = equipementDefensif;
    }
}