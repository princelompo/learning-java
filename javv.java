// ============================================================
// RÉSUMÉ JOUR 22 : List, ArrayList, LinkedList
// ============================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// --- Classe métier avec Comparable pour trier ---
class Etudiant implements Comparable<Etudiant> {
    private String nom;
    private double moyenne;

    public Etudiant(String nom, double moyenne) {
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String getNom()      { return nom; }
    public double getMoyenne()  { return moyenne; }

    @Override
    public String toString() { return nom + "(" + moyenne + ")"; }

    // Tri par moyenne décroissante
    @Override
    public int compareTo(Etudiant autre) {
        // décroissant : inverser le signe
        if (this.moyenne < autre.moyenne) return 1;
        if (this.moyenne > autre.moyenne) return -1;
        return 0;
    }
}

public class javv {
    public static void main(String[] args) {

        // ---------- 1. ArrayList : opérations de base ----------
        List<String> villes = new ArrayList<>();
        villes.add("Alger");           // fin
        villes.add("Oran");            // fin
        villes.add(1, "Constantine");  // insertion au milieu (index 1)

        System.out.println("Liste : " + villes);            // [Alger, Constantine, Oran]
        System.out.println("Taille : " + villes.size());    // 3
        System.out.println("get(0) : " + villes.get(0));    // Alger
        System.out.println("Contient Oran ? " + villes.contains("Oran")); // true

        villes.set(2, "Annaba");       // remplace "Oran"
        System.out.println("Après set : " + villes);        // [Alger, Constantine, Annaba]

        villes.remove("Constantine");  // suppression par valeur
        System.out.println("Après remove : " + villes);     // [Alger, Annaba]

        // ---------- 2. Parcours par index puis for-each ----------
        System.out.println("\n--- Parcours par index ---");
        for (int i = 0; i < villes.size(); i++) {
            System.out.println(i + " : " + villes.get(i));
        }

        System.out.println("\n--- Parcours for-each ---");
        for (String v : villes) System.out.println(v);

        // ---------- 3. LinkedList : méthodes aux extrémités ----------
        LinkedList<Integer> file = new LinkedList<>();
        file.addLast(10);
        file.addLast(20);
        file.addFirst(5);              // insère en tête
        System.out.println("\nLinkedList : " + file);       // [5, 10, 20]
        System.out.println("Premier : " + file.getFirst());// 5
        System.out.println("Dernier : " + file.getLast()); // 20
        file.removeFirst();
        file.removeLast();
        System.out.println("Après removals : " + file);     // [10]

        // ---------- 4. Liste d'objets personnalisés + tri ----------
        List<Etudiant> promo = new ArrayList<>();
        promo.add(new Etudiant("Alice", 14.5));
        promo.add(new Etudiant("Bob", 17.0));
        promo.add(new Etudiant("Carl", 11.0));
        promo.add(new Etudiant("Dina", 15.5));

        System.out.println("\nAvant tri : " + promo);
        Collections.sort(promo);       // utilise compareTo (décroissant)
        System.out.println("Après tri : " + promo);

        // ---------- 5. Collections : min, max, reverse ----------
        List<Integer> notes = new ArrayList<>();
        notes.add(14); notes.add(7); notes.add(19); notes.add(3);
        Collections.sort(notes);
        System.out.println("\nNotes triées : " + notes);    // [3, 7, 14, 19]
        System.out.println("Min : " + Collections.min(notes)); // 3
        System.out.println("Max : " + Collections.max(notes)); // 19
        Collections.reverse(notes);
        System.out.println("Inversé : " + notes);           // [19, 14, 7, 3]

        // ---------- 6. Suppression sûre : parcours inversé ----------
        List<String> lettres = new ArrayList<>();
        lettres.add("A"); lettres.add("B"); lettres.add("C"); lettres.add("B");
        System.out.println("\nAvant : " + lettres);         // [A, B, C, B]

        // Supprimer toutes les occurrences de "B" (parcours inversé)
        for (int i = lettres.size() - 1; i >= 0; i--) {
            if (lettres.get(i).equals("B")) {
                lettres.remove(i);
            }
        }
        System.out.println("Après suppression des B : " + lettres); // [A, C]

        // ---------- 7. Conversion tableau ↔ liste ----------
        String[] tab = {"X", "Y", "Z"};
        List<String> fixe = java.util.Arrays.asList(tab);
        // fixe.add("W");              // ❌ UnsupportedOperationException
        List<String> modif = new ArrayList<>(fixe);
        modif.add("W");
        System.out.println("\nListe modifiable : " + modif); // [X, Y, Z, W]

        // ❌ Interdits :
        // new List<String>();         // interface
        // for (String s : lettres) lettres.remove(s);  // ConcurrentModificationException
    }
}