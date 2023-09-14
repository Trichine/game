package Equipement.EquipementOffensif;

public abstract class EquipementOffensif {
    private String type;//Arme Sort
    private int niveauDattaque;
    private String nom;

    protected EquipementOffensif(String type, int niveauDattaque, String nom) {
        this.type = type;
        this.niveauDattaque = niveauDattaque;
        this.nom = nom;


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNiveauDattaque() {
        return niveauDattaque;
    }

    public void setNiveauDattaque(int niveauDattaque) {
        this.niveauDattaque = niveauDattaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract String toString();
}

