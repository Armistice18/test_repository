import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
    String nom = "AKELE";

    Scanner scanner = new Scanner(System.in);

    boolean isOnRepeat = true;

    while (isOnRepeat) {

        System.out.println("Entrez votre nom :");
        nom = scanner.next();

        System.out.println( "Entrez votre prénom :");
        String prenom = scanner.next();

        System.out.println("Entrez votre taille");
        double taille = scanner.nextDouble();

        System.out.println("Est ce que vous etes en emploi ?");
        boolean hasJob = scanner.nextBoolean();
        String situationProfessionnelle = hasJob ? "En emploi" : " Au chomage";

        System.out.println("Entrez votre age :");
        int age = scanner.nextInt();
        if (age < 25 ) {
            System.out.println("votre age est inclut dans la tranche d'age supportée pour la bourse");
        } else {
            System.out.println("votre age est supérieur à la tranche d'age supportée pour la bourse");
        }
        System.out.println("Bonjour " + nom + " " + prenom + ", vous avez " + age + " ans et vous mesurez " + 
        taille + "m. Vous etes actuellement " + situationProfessionnelle);

        System.out.println("Voulez vous saisir une autre personne ? 1:Oui  - 2:Non");
        int repeat = scanner.nextInt();
        if (repeat == 2) {
            isOnRepeat = false;
        }
    }
    
}
}


