package Cases;

public class EmptyCase implements Case{
    @Override
    public void action() {
        System.out.println("Vous êtes sur une case vide");
    }
    public String toString(){
        return "Vous êtes sur une case vide";
    }
}
