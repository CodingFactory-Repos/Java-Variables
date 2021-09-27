package me.loule;

public class Main {

    public static void main(String[] args) {
        // Clear Console
        System.out.print("\033[H\033[2J");

        /////////////////////////
        /* Exercice Variables */
        ///////////////////////

        // Manipulez des variables
        // Déclarez une variable de chaque type (entier, décimal, chaîne de caractères, booléen)
        int entier = 0;
        float decimal = 0.0f;
        String chaine = "";
        boolean booleen = false;

        // Initialisez vos variables avec des valeurs arbitraires
        entier = 123;
        decimal = 1.23f;
        chaine = "Hello World!";
        booleen = true;

        // Affichez les valeurs de vos variables pour vérifier que votre initialisation est correcte
        System.out.println("entier = " + entier);
        System.out.println("decimal = " + decimal);
        System.out.println("chaine = " + chaine);
        System.out.println("booleen = " + booleen);

        // Utilisez chacun des opérateurs arithmétiques vus précédemment (+, -, *, /, %) pour modifier les valeurs des variables
        entier = ((entier + 1) * 2)/4;

        // Utilisez chacun des opérateurs arithmétiques pour combiner les valeurs de 2 variables et stockez le résultat dans une troisième variable
        int num1 = 2;
        int num2 = 7;

        int resultat = num1 + num2;

        // Opérations décimales et entières
        // Initialisez une variable décimale et une autre entière avec une valeur impaire
        float decimal1 = 1.23f;
        int entier1 = 3;

        // Divisez ces deux valeurs par 2
        decimal1 = decimal1 / 2;
        entier1 = entier1 / 2;

        // Affichez le résultat et analysez-le
        System.out.println("decimal1 = " + decimal1);
        System.out.println("entier1 = " + entier1);
    }
}
