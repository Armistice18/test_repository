import java.util.Scanner;

public class Userinput2 {
    public static void main(String[] args) {
    String nom = "AKELE";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Entrez votre nom :");
    nom = scanner.nextLine();

    System.out.println( "Entrez votre prénom :");
    String prenom = scanner.nextLine();
    

   
    

    System.out.println("Entrez votre taille");
    double taille = scanner.nextDouble();

    System.out.println("Est ce que vous etes en emploi ?");
    boolean hasJob = scanner.nextBoolean();
    String situationProfessionnelle = hasJob ? "En emploi" : " Au chomage";

    System.out.println("Entrez votre age :");
    int age = scanner.nextInt();
    switch (age) {
        case 16: System.out.println(50000);
        break;
        case 17: System.out.println(40000);
        break;
        case 18: System.out.println(30000);
            break;
        default: System.out.println(20000);
            break;
    }

/**(age < 25 ) {
        System.out.println("votre age est inclut dans la tranche d'age supportée pour la bourse");
     } else {
        System.out.println("votre age est supérieur à la tranche d'age supportée pour la bourse");
        
    }*/
    System.out.println("Bonjour " + nom + " " + prenom + ", vous avez " + age + " ans et vous mesurez " + 
    taille + "m. Vous etes actuellement " + situationProfessionnelle);
    }
}

