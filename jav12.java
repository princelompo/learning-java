// ============================================================
// Fichier : ResumeJour12.java
// Objectif : resumer tout ce qui a ete vu au Jour 12.
// ============================================================

public class jav12 {

    // ========================================================
    // Methodes sans parametre et sans retour (void)
    // ========================================================

    public static void direBonjour() {
        System.out.println("Bonjour !");
    }

    // ========================================================
    // Methodes avec parametres et sans retour (void)
    // ========================================================

    public static void saluer(String nom) {
        System.out.println("Bonjour, " + nom + " !");
    }

    public static void afficherAddition(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    // ========================================================
    // Methodes avec valeur de retour
    // ========================================================

    public static int additionner(int a, int b) {
        return a + b;
    }

    public static int factorielle(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static double calculerMoyenne(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // ========================================================
    // Methode avec return anticipe
    // ========================================================

    public static int diviser(int a, int b) {
        if (b == 0) {
            return 0;   // sortie anticipee
        }
        return a / b;
    }

    public static void afficherPositif(int n) {
        if (n <= 0) {
            return;   // sortie anticipee, rien n'est affiche
        }
        System.out.println(n + " est positif");
    }

    // ========================================================
    // Methodes avec tableaux
    // ========================================================

    public static int somme(int[] t) {
        int total = 0;
        for (int n : t) {
            total += n;
        }
        return total;
    }

    public static int maximum(int[] t) {
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) max = t[i];
        }
        return max;
    }

    public static int minimum(int[] t) {
        int min = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] < min) min = t[i];
        }
        return min;
    }

    public static int[] creerTableau(int taille, int valeur) {
        int[] t = new int[taille];
        for (int i = 0; i < taille; i++) {
            t[i] = valeur;
        }
        return t;
    }

    // ========================================================
    // Methode recursive (apercu)
    // ========================================================

    public static int factorielleRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorielleRecursive(n - 1);
    }

    // ========================================================
    // Methode main : point d'entree
    // ========================================================

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1) Methode void sans parametre
        // ----------------------------------------------------
        System.out.println("=== Methode void sans parametre ===");
        direBonjour();
        System.out.println();

        // ----------------------------------------------------
        // 2) Methode void avec parametre
        // ----------------------------------------------------
        System.out.println("=== Methode void avec parametre ===");
        saluer("Alice");
        saluer("Bob");
        System.out.println();

        // ----------------------------------------------------
        // 3) Methode void avec plusieurs parametres
        // ----------------------------------------------------
        System.out.println("=== Methode void avec plusieurs parametres ===");
        afficherAddition(3, 5);
        afficherAddition(10, 20);
        System.out.println();

        // ----------------------------------------------------
        // 4) Methode avec retour
        // ----------------------------------------------------
        System.out.println("=== Methode avec retour ===");
        int resultat = additionner(3, 5);
        System.out.println("additionner(3, 5) = " + resultat);
        System.out.println("additionner(10, 20) = " + additionner(10, 20));
        System.out.println();

        // ----------------------------------------------------
        // 5) Factorielle
        // ----------------------------------------------------
        System.out.println("=== Factorielle ===");
        System.out.println("5! = " + factorielle(5));
        System.out.println();

        // ----------------------------------------------------
        // 6) Moyenne
        // ----------------------------------------------------
        System.out.println("=== Moyenne ===");
        double moyenne = calculerMoyenne(12, 15, 18);
        System.out.println("Moyenne = " + moyenne);
        System.out.println();

        // ----------------------------------------------------
        // 7) Return anticipe
        // ----------------------------------------------------
        System.out.println("=== Return anticipe ===");
        System.out.println("diviser(10, 2) = " + diviser(10, 2));
        System.out.println("diviser(10, 0) = " + diviser(10, 0));

        afficherPositif(5);
        afficherPositif(-3);
        System.out.println();

        // ----------------------------------------------------
        // 8) Passage par valeur : types primitifs
        // ----------------------------------------------------
        System.out.println("=== Passage par valeur (primitif) ===");

        int a = 10;
        modifierInt(a);
        System.out.println("a apres modifierInt : " + a);   // 10
        System.out.println();

        // ----------------------------------------------------
        // 9) Passage par valeur : tableaux
        // ----------------------------------------------------
        System.out.println("=== Passage par valeur (tableau) ===");

        int[] tab = {1, 2, 3};
        modifierTableau(tab);
        System.out.println("tab[0] apres modifierTableau : " + tab[0]);   // 99

        int[] tab2 = {1, 2, 3};
        reassigner(tab2);
        System.out.println("tab2[0] apres reassigner : " + tab2[0]);        // 1
        System.out.println();

        // ----------------------------------------------------
        // 10) Methodes avec tableaux
        // ----------------------------------------------------
        System.out.println("=== Methodes avec tableaux ===");

        int[] notes = {12, 15, 8, 17, 10};

        System.out.println("Somme   : " + somme(notes));
        System.out.println("Maximum : " + maximum(notes));
        System.out.println("Minimum : " + minimum(notes));
        System.out.println();

        // ----------------------------------------------------
        // 11) Retourner un tableau
        // ----------------------------------------------------
        System.out.println("=== Retourner un tableau ===");

        int[] rempli = creerTableau(5, 7);
        System.out.print("Tableau cree : ");
        for (int n : rempli) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        // ----------------------------------------------------
        // 12) Recursivite (apercu)
        // ----------------------------------------------------
        System.out.println("=== Recursivite ===");
        System.out.println("5! (recursif) = " + factorielleRecursive(5));
        System.out.println();

        System.out.println("=== Fin du resume ===");
    }

    // ========================================================
    // Methodes utilitaires pour la demonstration
    // ========================================================

    public static void modifierInt(int x) {
        x = 99;   // modifie la copie locale, pas l'original
    }

    public static void modifierTableau(int[] t) {
        t[0] = 99;   // modifie le contenu du tableau original
    }

    public static void reassigner(int[] t) {
        t = new int[]{99, 98, 97};   // reassigne la reference locale
    }
}