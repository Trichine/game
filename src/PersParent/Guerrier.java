package PersParent;

public class Guerrier extends Personnage {
    public Guerrier(){
        super("Abou","guerrier",6,6);
    }

    @Override
    public String toString() {
        return ("le nom " + getNom() +" le type " + getType() +"niveau de vie "+ getNiveauDeVie() +" force " + getForcedattaque() );
    }

    // Sort sort = new Sort();
}
