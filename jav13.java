// ============================================================
// Fichier : ResumeJour13.java
// Objectif : resumer tout ce qui a ete vu au Jour 13.
// ============================================================

public class jav13 {

    // ========================================================
    // Champ de classe (apercu, vu au Jour 16)
    // ========================================================
    static int valeur = 100;

    // ========================================================
    // Methodes surchargees : additionner
    // ========================================================

    public static int additionner(int a, int b) {
        return a + b;
    }

    public static double additionner(double a, double b) {
        return a + b;
    }

    public static int additionner(int a, int b, int c) {
        return a + b + c;
    }

    // ========================================================
    // Methodes surchargees : afficher
    // ========================================================

    public static void afficher(int n) {
        System.out.println("int : " + n);
    }

    public static void afficher(double d) {
        System.out.println("double : " + d);
    }

    public static void afficher(String s) {
        System.out.println("String : " + s);
    }

    public static void afficher(boolean b) {
        System.out.println("boolean : " + b);
    }

    // ========================================================
    // Methodes surchargees : somme
    // ========================================================

    public static int somme(int[] t) {
        int total = 0;
        for (int n : t) total += n;
        return total;
    }

    public static int somme(int a, int b) {
        return a + b;
    }

    public static int somme(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // ========================================================
    // main
    // ========================================================

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1) Surcharge : additionner
        // ----------------------------------------------------
        System.out.println("=== Surcharge : additionner ===");
        System.out.println("additionner(3, 5)       = " + additionner(3, 5));
        System.out.println("additionner(3.5, 5.5)   = " + additionner(3.5, 5.5));
        System.out.println("additionner(1, 2, 3)    = " + additionner(1, 2, 3));
        System.out.println();

        // ----------------------------------------------------
        // 2) Surcharge : afficher
        // ----------------------------------------------------
        System.out.println("=== Surcharge : afficher ===");
        afficher(42);
        afficher(3.14);
        afficher("Bonjour");
        afficher(true);
        System.out.println();

        // ----------------------------------------------------
        // 3) Surcharge : somme
        // ----------------------------------------------------
        System.out.println("=== Surcharge : somme ===");
        int[] t = {1, 2, 3};
        System.out.println("somme(t)              = " + somme(t));
        System.out.println("somme(10, 20)         = " + somme(10, 20));
        System.out.println("somme(1, 2, 3, 4)     = " + somme(1, 2, 3, 4));
        System.out.println();

        // ----------------------------------------------------
        // 4) Portee de bloc
        // ----------------------------------------------------
        System.out.println("=== Portee de bloc ===");

        int a = 10;
        {
            int b = 20;
            System.out.println("Dans le bloc : a = " + a + ", b = " + b);
        }
        System.out.println("Hors du bloc : a = " + a);
        System.out.println();

        // ----------------------------------------------------
        // 5) Portee de methode
        // ----------------------------------------------------
        System.out.println("=== Portee de methode ===");
        methodeA();
        methodeB();
        System.out.println();

        // ----------------------------------------------------
        // 6) Masquage
        // ----------------------------------------------------
        System.out.println("=== Masquage ===");

        System.out.println("Champ valeur : " + valeur);

        int valeur = 50;   // masque le champ
        System.out.println("Locale valeur : " + valeur);
        System.out.println("Champ via classe : " + jav13.valeur);
        System.out.println();

        // ----------------------------------------------------
        // 7) Masquage avec parametre
        // ----------------------------------------------------
        System.out.println("=== Fin du resume ===");
    }

    // ========================================================
    // Methodes utilitaires pour la portee
    // ========================================================

    public static void methodeA() {
        int x = 10;   // locale a methodeA
        System.out.println("methodeA : x = " + x);
    }

    public static void methodeB() {
        int x = 20;   // locale a methodeB (differente de celle de methodeA)
        System.out.println("methodeB : x = " + x);
    }

}