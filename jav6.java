// ============================================================
// Fichier : ResumeJour6.java
// Objectif : resumer tout ce qui a ete vu au Jour 6.
// ============================================================

public class jav6 {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1) Boucle for classique
        // ----------------------------------------------------
        System.out.println("=== Boucle for ===");

        // i va de 0 a 4.
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();

        // ----------------------------------------------------
        // 2) Boucle for decroissante
        // ----------------------------------------------------
        System.out.println("=== for decroissant ===");

        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // ----------------------------------------------------
        // 3) Boucle for avec pas de 2
        // ----------------------------------------------------
        System.out.println("=== for avec pas de 2 ===");

        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // ----------------------------------------------------
        // 4) Boucle while
        // ----------------------------------------------------
        System.out.println("=== Boucle while ===");

        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;   // sans cette ligne, boucle infinie !
        }
        System.out.println();

        // ----------------------------------------------------
        // 5) Boucle do-while
        // ----------------------------------------------------
        System.out.println("=== Boucle do-while ===");

        int j = 0;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 5);
        System.out.println();

        // Difference : do-while execute au moins une fois.
        int k = 10;
        System.out.println("--- while avec k = 10 ---");
        while (k < 5) {
            System.out.println("while : " + k);
        }

        System.out.println("--- do-while avec k = 10 ---");
        do {
            System.out.println("do-while : " + k);
        } while (k < 5);
        System.out.println();

        // ----------------------------------------------------
        // 6) break
        // ----------------------------------------------------
        System.out.println("=== break ===");

        for (int n = 0; n < 10; n++) {
            if (n == 5) {
                break;   // sort de la boucle
            }
            System.out.println("n = " + n);
        }
        System.out.println();

        // ----------------------------------------------------
        // 7) continue
        // ----------------------------------------------------
        System.out.println("=== continue (ignorer les pairs) ===");

        for (int n = 0; n < 10; n++) {
            if (n % 2 == 0) {
                continue;   // passe au tour suivant
            }
            System.out.println("n = " + n);
        }
        System.out.println();

        // ----------------------------------------------------
        // 8) Boucles imbriquees : table de multiplication
        // ----------------------------------------------------
        System.out.println("=== Boucles imbriquees ===");

        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.println(a + " x " + b + " = " + (a * b));
            }
            System.out.println("---");
        }
        System.out.println();

        // ----------------------------------------------------
        // 9) Triangle d'etoiles
        // ----------------------------------------------------
        System.out.println("=== Triangle d'etoiles ===");

        for (int ligne = 1; ligne <= 5; ligne++) {
            for (int col = 1; col <= ligne; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // ----------------------------------------------------
        // 10) break avec etiquette
        // ----------------------------------------------------
        System.out.println("=== break avec etiquette ===");

        externe: for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                if (a == 2 && b == 2) {
                    break externe;   // sort des deux boucles
                }
                System.out.println("a=" + a + ", b=" + b);
            }
        }
        System.out.println();

        // ----------------------------------------------------
        // 11) Exemple : somme des 1 a 100
        // ----------------------------------------------------
        System.out.println("=== Somme des 1 a 100 ===");

        int somme = 0;
        for (int n = 1; n <= 100; n++) {
            somme += n;
        }
        System.out.println("Somme = " + somme);
        System.out.println();

        // ----------------------------------------------------
        // 12) Exemple : factorielle
        // ----------------------------------------------------
        System.out.println("=== Factorielle ===");

        int nombre = 5;
        long factorielle = 1;
        for (int n = 1; n <= nombre; n++) {
            factorielle *= n;
        }
        System.out.println(nombre + "! = " + factorielle);
        System.out.println();

        // ----------------------------------------------------
        // 13) Exemple : Fibonacci
        // ----------------------------------------------------
        System.out.println("=== Fibonacci (10 premiers) ===");

        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int n = 2; n < 10; n++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println();

        System.out.println("=== Fin du resume ===");
    }
}