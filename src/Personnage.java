

public class Personnage {
    private String nom;
    private String type;
    private int  niveauDeVie;
    private int Forcedattaque;
    private    String EquipementOffensif;
    private    String EquipementDefensif;

    public Personnage(){
        this.nom = "Bob";
        this.niveauDeVie = 5;
        this.Forcedattaque = 5;
        this.EquipementOffensif = "Epee";
        this.EquipementDefensif = "Bouclier";
    }
    public Personnage(String nom){
        this.nom = nom;
        this.niveauDeVie = 5;
        this.Forcedattaque = 5;
        this.EquipementOffensif = "Epee";
        this.EquipementDefensif = "Bouclier";
    }

    public Personnage(String nom, String type){
        this.nom = nom;
        this.type = type;

    }

}
