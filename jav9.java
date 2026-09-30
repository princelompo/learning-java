// ============================================================
// Fichier : ResumeJour9.java
// Objectif : resumer tout ce qui a ete vu au Jour 9.
// ============================================================

import java.util.Arrays;

public class jav9 {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1) Declaration, creation, initialisation
        // ----------------------------------------------------
        System.out.println("=== Creation d'un tableau 2D ===");

        // Creation vide : 3 lignes, 4 colonnes, remplies de 0.
        int[][] vide = new int[3][4];
        System.out.println("vide : " + Arrays.deepToString(vide));

        // Initialisation directe.
        int[][] matrice = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        System.out.println("matrice : " + Arrays.deepToString(matrice));
        System.out.println();

        // ----------------------------------------------------
        // 2) Dimensions
        // ----------------------------------------------------
        System.out.println("=== Dimensions ===");

        System.out.println("Lignes : " + matrice.length);
        System.out.println("Colonnes de la ligne 0 : " + matrice[0].length);
        System.out.println();

        // ----------------------------------------------------
        // 3) Acces et modification
        // ----------------------------------------------------
        System.out.println("=== Acces et modification ===");

        System.out.println("matrice[0][0] = " + matrice[0][0]);
        System.out.println("matrice[1][2] = " + matrice[1][2]);

        matrice[1][1] = 99;
        System.out.println("Apres matrice[1][1] = 99 : " + Arrays.deepToString(matrice));
        System.out.println();

        // ----------------------------------------------------
        // 4) Parcours avec boucles imbriquees
        // ----------------------------------------------------
        System.out.println("=== Parcours avec for imbriques ===");

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ----------------------------------------------------
        // 5) Parcours avec for-each imbriques
        // ----------------------------------------------------
        System.out.println("=== Parcours avec for-each ===");

        for (int[] ligne : matrice) {
            for (int valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ----------------------------------------------------
        // 6) Tableau irregulier
        // ----------------------------------------------------
        System.out.println("=== Tableau irregulier ===");

        int[][] irregulier = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < irregulier.length; i++) {
            for (int j = 0; j < irregulier[i].length; j++) {
                System.out.print(irregulier[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ----------------------------------------------------
        // 7) Somme de tous les elements
        // ----------------------------------------------------
        System.out.println("=== Somme de tous les elements ===");

        int somme = 0;
        for (int[] ligne : matrice) {
            for (int valeur : ligne) {
                somme += valeur;
            }
        }
        System.out.println("Somme = " + somme);
        System.out.println();

        // ----------------------------------------------------
        // 8) Somme par ligne
        // ----------------------------------------------------
        System.out.println("=== Somme par ligne ===");

        for (int i = 0; i < matrice.length; i++) {
            int sommeLigne = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                sommeLigne += matrice[i][j];
            }
            System.out.println("Ligne " + i + " : " + sommeLigne);
        }
        System.out.println();

        // ----------------------------------------------------
        // 9) Somme par colonne (matrice reguliere)
        // ----------------------------------------------------
        System.out.println("=== Somme par colonne ===");

        int nbColonnes = matrice[0].length;
        for (int j = 0; j < nbColonnes; j++) {
            int sommeColonne = 0;
            for (int i = 0; i < matrice.length; i++) {
                sommeColonne += matrice[i][j];
            }
            System.out.println("Colonne " + j + " : " + sommeColonne);
        }
        System.out.println();

        // ----------------------------------------------------
        // 10) Transposee
        // ----------------------------------------------------
        System.out.println("=== Transposee ===");

        int[][] aTransposer = {
            {1, 2, 3},
            {4, 5, 6}
        };   // 2 x 3

        int[][] transposee = new int[aTransposer[0].length][aTransposer.length];
        // transposee : 3 x 2

        for (int i = 0; i < aTransposer.length; i++) {
            for (int j = 0; j < aTransposer[i].length; j++) {
                transposee[j][i] = aTransposer[i][j];
            }
        }

        System.out.println("Originale : " + Arrays.deepToString(aTransposer));
        System.out.println("Transposee : " + Arrays.deepToString(transposee));
        System.out.println();

        // ----------------------------------------------------
        // 11) Produit matriciel
        // ----------------------------------------------------
        System.out.println("=== Produit matriciel ===");

        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;

        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("A x B = " + Arrays.deepToString(C));
        System.out.println();

        // ----------------------------------------------------
        // 12) Copie profonde
        // ----------------------------------------------------
        System.out.println("=== Copie profonde ===");

        int[][] original = {{1, 2}, {3, 4}};
        int[][] copie = new int[original.length][];

        for (int i = 0; i < original.length; i++) {
            copie[i] = original[i].clone();
        }

        copie[0][0] = 99;
        System.out.println("original = " + Arrays.deepToString(original));
        System.out.println("copie    = " + Arrays.deepToString(copie));
        System.out.println();

        // ----------------------------------------------------
        // 13) Recherche dans un tableau 2D
        // ----------------------------------------------------
        System.out.println("=== Recherche ===");

        int cible = 5;
        boolean trouve = false;
        int ligneTrouvee = -1;
        int colonneTrouvee = -1;

        for (int i = 0; i < matrice.length && !trouve; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == cible) {
                    trouve = true;
                    ligneTrouvee = i;
                    colonneTrouvee = j;
                    break;
                }
            }
        }

        if (trouve) {
            System.out.println(cible + " trouve en [" + ligneTrouvee + "][" + colonneTrouvee + "]");
        } else {
            System.out.println(cible + " non trouve");
        }
        System.out.println();

        // ----------------------------------------------------
        // 14) Grille (tic-tac-toe)
        // ----------------------------------------------------
        System.out.println("=== Grille ===");

        char[][] grille = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {' ', ' ', 'X'}
        };

        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[i].length; j++) {
                System.out.print(grille[i][j]);
                if (j < grille[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < grille.length - 1) {
                System.out.println("---------");
            }
        }
        System.out.println();

        System.out.println("=== Fin du resume ===");
    }
}