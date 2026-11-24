/*
 * ===== RESUME JOUR 23 =====
 * Notions vues :
 * - Set : ensemble SANS doublons, sans index ; add() renvoie false si deja present
 *     HashSet (aucun ordre garanti), LinkedHashSet (ordre d'insertion),
 *     TreeSet (trie ; first(), last())
 * - Operations ensemblistes : addAll (union), retainAll (intersection),
 *   removeAll (difference), containsAll (inclusion) -> travailler sur une COPIE
 * - Supprimer les doublons d'une liste : new LinkedHashSet<>(liste)
 * - HashSet/HashMap : table de hachage -> hashCode() choisit le casier, puis
 *   equals() tranche. Contrat : equals vrai => hashCode identique.
 *   equals SANS hashCode => doublons possibles dans un HashSet.
 *   Elements/cles de preference IMMUABLES.
 * - Map : paires cle -> valeur ; cles uniques, valeurs repetables ; PAS une Collection
 *     HashMap, LinkedHashMap, TreeMap ; deux types entre chevrons <Cle, Valeur>
 * - Methodes : put (renvoie l'ancienne valeur), get (null si absent),
 *   getOrDefault, putIfAbsent, containsKey, containsValue, remove(cle), size,
 *   isEmpty, clear, putAll
 * - Piege : int x = map.get(cle) -> NullPointerException si la cle est absente
 * - Parcours : keySet(), values(), entrySet() avec Map.Entry (getKey/getValue) ;
 *   suppression pendant le parcours -> Iterator sur entrySet()
 * - Motifs : compteur (getOrDefault + 1), regroupement Map<K, List<V>>
 * - Set.of / Map.of : collections NON modifiables
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class jav19 {

    public static void main(String[] args) {

        // ================= SET =================

        Set<String> couleurs = new LinkedHashSet<>();    // ordre d'insertion conserve
        System.out.println(couleurs.add("rouge"));       // true
        System.out.println(couleurs.add("vert"));        // true
        System.out.println(couleurs.add("rouge"));       // false : doublon refuse
        System.out.println(couleurs);                    // [rouge, vert]
        System.out.println(couleurs.contains("vert"));   // true
        couleurs.remove("vert");
        System.out.println(couleurs.size());             // 1

        // --- Operations ensemblistes (TreeSet : affichage trie, donc previsible) ---
        Set<Integer> a = new TreeSet<>(List.of(1, 2, 3, 4));
        Set<Integer> b = new TreeSet<>(List.of(3, 4, 5));

        Set<Integer> union = new TreeSet<>(a);
        union.addAll(b);
        System.out.println(union);                       // [1, 2, 3, 4, 5]

        Set<Integer> inter = new TreeSet<>(a);
        inter.retainAll(b);
        System.out.println(inter);                       // [3, 4]

        Set<Integer> diff = new TreeSet<>(a);
        diff.removeAll(b);
        System.out.println(diff);                        // [1, 2]

        // --- TreeSet : methodes propres (type declare TreeSet) ---
        TreeSet<Integer> t = new TreeSet<>(List.of(5, 1, 9, 3));
        System.out.println(t.first() + " " + t.last());  // 1 9

        // --- Suppression des doublons d'une liste, ordre conserve ---
        List<Integer> avecDoublons = List.of(3, 1, 3, 2, 1);
        List<Integer> sansDoublons = new ArrayList<>(new LinkedHashSet<>(avecDoublons));
        System.out.println(sansDoublons);                // [3, 1, 2]
        // ================= MAP =================

        Map<String, Integer> notes = new LinkedHashMap<>();   // ordre d'insertion
        notes.put("Amine", 14);
        notes.put("Sara", 17);
        Integer ancienne = notes.put("Amine", 15);            // cle existante : remplacement
        System.out.println(ancienne);                         // 14 (ancienne valeur)
        System.out.println(notes);                            // {Amine=15, Sara=17}

        System.out.println(notes.get("Sara"));                // 17
        System.out.println(notes.get("Zoe"));                 // null : cle absente
        System.out.println(notes.getOrDefault("Zoe", 0));     // 0 : valeur par defaut
        // int piege = notes.get("Zoe");                      // NullPointerException (unboxing de null)

        notes.putIfAbsent("Sara", 0);                         // Sara existe : inchange
        notes.putIfAbsent("Zoe", 9);                          // Zoe absente : ajoutee
        System.out.println(notes.containsKey("Zoe"));         // true
        System.out.println(notes.containsValue(17));          // true

        // --- Les trois facons de parcourir ---
        for (String nom : notes.keySet()) {                   // les cles
            System.out.println(nom + " -> " + notes.get(nom));
        }
        int somme = 0;
        for (int v : notes.values()) {                        // les valeurs
            somme += v;
        }
        System.out.println(somme);                            // 15 + 17 + 9 = 41
        for (Map.Entry<String, Integer> e : notes.entrySet()) {   // les paires
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // --- Suppression pendant un parcours : Iterator sur entrySet ---
        Iterator<Map.Entry<String, Integer>> it = notes.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() < 10) {
                it.remove();                                  // retire la paire courante (Zoe)
            }
        }
        System.out.println(notes);                            // {Amine=15, Sara=17}

        // --- TreeMap : cles triees ---
        Map<String, Integer> trie = new TreeMap<>();
        trie.put("Sara", 17);
        trie.put("Amine", 15);
        System.out.println(trie);                             // {Amine=15, Sara=17}

        // --- Motif compteur ---
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String mot : "le chat et le chien et le rat".split(" ")) {
            freq.put(mot, freq.getOrDefault(mot, 0) + 1);
        }
        System.out.println(freq);     // {le=3, chat=1, et=2, chien=1, rat=1}

        // --- Motif regroupement : une cle, plusieurs valeurs ---
        Map<String, List<String>> parVille = new LinkedHashMap<>();
        String[][] donnees = { {"Oran", "Amine"}, {"Alger", "Sara"}, {"Oran", "Lina"} };
        for (String[] ligne : donnees) {
            if (!parVille.containsKey(ligne[0])) {
                parVille.put(ligne[0], new ArrayList<>());   // premiere fois : creer la liste
            }
            parVille.get(ligne[0]).add(ligne[1]);
        }
        System.out.println(parVille); // {Oran=[Amine, Lina], Alger=[Sara]}

        // --- Collections non modifiables ---
        Set<String> fixe = Set.of("a", "b");
        // fixe.add("c");              // UnsupportedOperationException a l'execution
        Set<String> modifiable = new HashSet<>(fixe);        // copie modifiable
        modifiable.add("c");
        System.out.println(modifiable.size());               // 3
    }
}