package PersParent;

public interface Combattant {
    boolean isAlive();
    boolean receiveAttack(Combattant fighter);
    int getForcedattaque();
}