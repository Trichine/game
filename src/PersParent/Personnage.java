package PersParent;

public abstract class Personnage {
    private String nom;
    private String type;
    private int niveauDeVie;
    private int Forcedattaque;
    private String EquipementOffensif;
    private String EquipementDefensif;


    public Personnage(String nom, String type, int niveauDeVie, int forcedattaque,String EquipementOffensif,String EquipementDefensif){
        this.nom = nom;
        this.type = type;
        this.niveauDeVie = niveauDeVie;
        this.Forcedattaque = forcedattaque;
        this.EquipementDefensif = EquipementOffensif;
        this.EquipementOffensif = EquipementDefensif;
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
    public abstract String toString();

//    System.out.println(thor.toString());

}