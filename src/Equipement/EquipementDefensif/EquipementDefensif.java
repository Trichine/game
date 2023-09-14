package Equipement.EquipementDefensif;

public abstract class EquipementDefensif {
    private String type;
    private   int niveauDefensif;
    private String nom;

    public  EquipementDefensif(String type, int niveauDefensif, String nom){
        this.type= type;
        this.niveauDefensif = niveauDefensif;
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNiveauDefensif() {
        return niveauDefensif;
    }

    public void setNiveauDefensif(int niveauDefensif) {
        this.niveauDefensif = niveauDefensif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
