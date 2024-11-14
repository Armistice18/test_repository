public class tableau {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int tab [] = new int[5];
        String[] noms = new String[5];
        noms [0] = "Morad";
        noms [3] = "Akele";
        noms [4] = "Epiphane";

        /*String[] prenom = {"prenom1" , "prenom2" , "prenom3" };
        System.out.println(prenom.length);
        System.out.println(prenom [1]);
        System.out.println(prenom [2]);{//* */

        for (int i = 0; i < noms.length; i++) {

            if (i == 1) {
                break;
            }
            System.out.println(noms [i]);
        }

        for (String nom : noms) {
            System.out.println(nom);
            
        }


        /*int age = 15;
        float taille = 1.82f;
        char sexe = 'M';
        boolean hasJob = true;
        String nom = "AKELE";

        String prenom = "Armistice";

        System.out.println(hasJob);
        System.out.println(age);
        System.out.println(taille);
        System.out.println(sexe);
        System.out.println(hasJob);
        System.out.println(nom);
        System.out.println(prenom);

        System.out.println("Bonjour" + nom + prenom + "votre age est" + age );
        String situationProfessionnelle = hasJob ? "En emploi" : " Au chomage";*/
      





        
    }
}
