// ============================================================
// Fichier : ResumeJour8.java
// Objectif : resumer tout ce qui a ete vu au Jour 8.
// ============================================================

import java.util.Arrays;   // pour Arrays.toString, sort, fill, copyOf

public class jav8 {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1) Declaration et creation d'un tableau
        // ----------------------------------------------------
        System.out.println("=== Declaration et creation ===");

        // Declaration : la reference est null pour l'instant.
        int[] nombres;

        // Creation : 5 entiers, initialises a 0.
        nombres = new int[5];

        System.out.println("Taille : " + nombres.length);
        System.out.println("Contenu par defaut : " + Arrays.toString(nombres));
        System.out.println();

        // ----------------------------------------------------
        // 2) Initialisation directe
        // ----------------------------------------------------
        System.out.println("=== Initialisation directe ===");

        int[] notes = {12, 15, 8, 17, 10};
        System.out.println("notes = " + Arrays.toString(notes));
        System.out.println();

        // ----------------------------------------------------
        // 3) Acces et modification
        // ----------------------------------------------------
        System.out.println("=== Acces et modification ===");

        System.out.println("notes[0] = " + notes[0]);
        System.out.println("notes[4] = " + notes[4]);

        notes[2] = 20;
        System.out.println("Apres notes[2] = 20 : " + Arrays.toString(notes));
        System.out.println();

        // ----------------------------------------------------
        // 4) Parcours avec for classique
        // ----------------------------------------------------
        System.out.println("=== Parcours avec for ===");

        for (int i = 0; i < notes.length; i++) {
            System.out.println("notes[" + i + "] = " + notes[i]);
        }
        System.out.println();

        // ----------------------------------------------------
        // 5) Parcours avec for-each
        // ----------------------------------------------------
        System.out.println("=== Parcours avec for-each ===");

        for (int n : notes) {
            System.out.println(n);
        }
        System.out.println();

        // ----------------------------------------------------
        // 6) Somme et moyenne
        // ----------------------------------------------------
        System.out.println("=== Somme et moyenne ===");

        int somme = 0;
        for (int n : notes) {
            somme += n;
        }
        double moyenne = (double) somme / notes.length;

        System.out.println("Somme = " + somme);
        System.out.println("Moyenne = " + moyenne);
        System.out.println();

        // ----------------------------------------------------
        // 7) Minimum et maximum
        // ----------------------------------------------------
        System.out.println("=== Minimum et maximum ===");

        int[] t = {45, 12, 78, 3, 99, 25};
        int min = t[0];
        int max = t[0];

        for (int i = 1; i < t.length; i++) {
            if (t[i] < min) min = t[i];
            if (t[i] > max) max = t[i];
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println();

        // ----------------------------------------------------
        // 8) Copie de tableau
        // ----------------------------------------------------
        System.out.println("=== Copie de tableau ===");

        int[] original = {1, 2, 3};
        int[] copie = original.clone();

        copie[0] = 99;
        System.out.println("original = " + Arrays.toString(original));   // [1, 2, 3]
        System.out.println("copie    = " + Arrays.toString(copie));      // [99, 2, 3]
        System.out.println();

        // ----------------------------------------------------
        // 9) Remplissage avec Arrays.fill
        // ----------------------------------------------------
        System.out.println("=== Arrays.fill ===");

        int[] rempli = new int[5];
        Arrays.fill(rempli, 7);
        System.out.println(Arrays.toString(rempli));   // [7, 7, 7, 7, 7]
        System.out.println();

        // ----------------------------------------------------
        // 10) Tri avec Arrays.sort
        // ----------------------------------------------------
        System.out.println("=== Arrays.sort ===");

        int[] desordre = {50, 20, 40, 10, 30};
        System.out.println("Avant : " + Arrays.toString(desordre));
        Arrays.sort(desordre);
        System.out.println("Apres : " + Arrays.toString(desordre));
        System.out.println();

        // ----------------------------------------------------
        // 11) Recherche lineaire
        // ----------------------------------------------------
        System.out.println("=== Recherche lineaire ===");

        int[] recherche = {10, 20, 30, 40, 50};
        int cible = 30;
        int position = -1;

        for (int i = 0; i < recherche.length; i++) {
            if (recherche[i] == cible) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println(cible + " trouve a l'indice " + position);
        } else {
            System.out.println(cible + " non trouve");
        }
        System.out.println();

        // ----------------------------------------------------
        // 12) Recherche binaire (tableau trie)
        // ----------------------------------------------------
        System.out.println("=== Arrays.binarySearch ===");

        int[] trie = {10, 20, 30, 40, 50};
        int pos = Arrays.binarySearch(trie, 40);
        System.out.println("40 est a l'indice " + pos);
        System.out.println();

        // ----------------------------------------------------
        // 13) Inversion d'un tableau
        // ----------------------------------------------------
        System.out.println("=== Inversion ===");

        int[] aInverser = {1, 2, 3, 4, 5};

        for (int i = 0; i < aInverser.length / 2; i++) {
            int temp = aInverser[i];
            aInverser[i] = aInverser[aInverser.length - 1 - i];
            aInverser[aInverser.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(aInverser));   // [5, 4, 3, 2, 1]
        System.out.println();

        // ----------------------------------------------------
        // 14) Compter les occurrences
        // ----------------------------------------------------
        System.out.println("=== Occurrences ===");

        int[] occurrences = {1, 2, 3, 2, 1, 2, 4, 2};
        int cible2 = 2;
        int compteur = 0;

        for (int n : occurrences) {
            if (n == cible2) {
                compteur++;
            }
        }

        System.out.println(cible2 + " apparait " + compteur + " fois");
        System.out.println();

        System.out.println("=== Fin du resume ===");
    }
}