import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private  String getStringResult(String question){

        return getStringResult(question);
    }
    public int getIntResult(String question) {
        try {
            return Integer.parseInt(getResult(question));
        } catch (NumberFormatException e) {
            return getIntResult(question);
        }
    }
    private String getResult(String question) {
        System.out.println(question);
        return scanner.next();
    }
    public void optionCreePers(){
        System.out.println("Entrez le nouveau nom du personnage : ");
        String nom = scanner.nextLine();
        System.out.println("Entrez le nouveau type du personnage : ");
        String type = scanner.nextLine();
        Personnage abou = new Personnage();
        System.out.println("votre personnage est : " + nom +"\n de type " + type );
    }
    public void afficherMenu() {
        int create = getIntResult("Principal menu : \n1 cree une nouvelle personnage\n2 la liste des Personnage\n3 commencer le jeux");
        switch (create) {
            case 1 -> System.out.println("1.Vous avez chois l'Option 1");
            case 2 -> System.out.println("2. Vous avez chois l'Option 2");
            case 3 -> {
                System.out.println("go go go");
                System.exit(0);
            }
        }
    }
}


