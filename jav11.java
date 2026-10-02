// ============================================================
// Fichier : ResumeJour11.java
// Objectif : resumer tout ce qui a ete vu au Jour 11.
// ============================================================

import java.util.StringJoiner;

public class jav11 {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1) Creation d'un StringBuilder
        // ----------------------------------------------------
        System.out.println("=== Creation ===");

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Bonjour");
        StringBuilder sb3 = new StringBuilder(50);

        System.out.println("sb1 (vide) : [" + sb1 + "]");
        System.out.println("sb2        : [" + sb2 + "]");
        System.out.println("sb3 capacite : " + sb3.capacity());
        System.out.println();

        // ----------------------------------------------------
        // 2) append
        // ----------------------------------------------------
        System.out.println("=== append ===");

        StringBuilder sb = new StringBuilder("Bonjour");
        sb.append(" monde");
        sb.append(42);
        sb.append(3.14);
        sb.append(true);
        sb.append('!');

        System.out.println(sb.toString());
        System.out.println();

        // ----------------------------------------------------
        // 3) insert
        // ----------------------------------------------------
        System.out.println("=== insert ===");

        StringBuilder sbInsert = new StringBuilder("Bonjour");
        sbInsert.insert(3, "XX");
        System.out.println(sbInsert.toString());   // BonXXjour
        System.out.println();

        // ----------------------------------------------------
        // 4) delete et deleteCharAt
        // ----------------------------------------------------
        System.out.println("=== delete ===");

        StringBuilder sbDelete = new StringBuilder("Bonjour");
        sbDelete.delete(3, 5);
        System.out.println("Apres delete(3, 5) : " + sbDelete);

        sbDelete.deleteCharAt(0);
        System.out.println("Apres deleteCharAt(0) : " + sbDelete);
        System.out.println();

        // ----------------------------------------------------
        // 5) replace
        // ----------------------------------------------------
        System.out.println("=== replace ===");

        StringBuilder sbReplace = new StringBuilder("Bonjour");
        sbReplace.replace(0, 3, "Sal");
        System.out.println(sbReplace.toString());   // Saljour
        System.out.println();

        // ----------------------------------------------------
        // 6) reverse
        // ----------------------------------------------------
        System.out.println("=== reverse ===");

        StringBuilder sbReverse = new StringBuilder("Bonjour");
        sbReverse.reverse();
        System.out.println(sbReverse.toString());   // ruojnoB
        System.out.println();

        // ----------------------------------------------------
        // 7) charAt et setCharAt
        // ----------------------------------------------------
        System.out.println("=== charAt / setCharAt ===");

        StringBuilder sbChar = new StringBuilder("Bonjour");
        System.out.println("charAt(0) : " + sbChar.charAt(0));

        sbChar.setCharAt(0, 'b');
        System.out.println("Apres setCharAt(0, 'b') : " + sbChar);
        System.out.println();

        // ----------------------------------------------------
        // 8) length et capacity
        // ----------------------------------------------------
        System.out.println("=== length / capacity ===");

        StringBuilder sbLC = new StringBuilder("Bonjour");
        System.out.println("length : " + sbLC.length());
        System.out.println("capacity : " + sbLC.capacity());
        System.out.println();

        // ----------------------------------------------------
        // 9) setLength
        // ----------------------------------------------------
        System.out.println("=== setLength ===");

        StringBuilder sbSL = new StringBuilder("Bonjour");
        sbSL.setLength(3);
        System.out.println(sbSL.toString());   // Bon
        System.out.println();

        // ----------------------------------------------------
        // 10) substring
        // ----------------------------------------------------
        System.out.println("=== substring ===");

        StringBuilder sbSub = new StringBuilder("Bonjour");
        System.out.println(sbSub.substring(3));       // jour
        System.out.println(sbSub.substring(0, 3));    // Bon
        System.out.println();

        // ----------------------------------------------------
        // 11) indexOf / lastIndexOf
        // ----------------------------------------------------
        System.out.println("=== indexOf / lastIndexOf ===");

        StringBuilder sbIdx = new StringBuilder("Bonjour tout le monde");
        System.out.println("indexOf(\"tout\") : " + sbIdx.indexOf("tout"));
        System.out.println("lastIndexOf(\"o\") : " + sbIdx.lastIndexOf("o"));
        System.out.println();

        // ----------------------------------------------------
        // 12) Chaineage
        // ----------------------------------------------------
        System.out.println("=== Chaineage ===");

        StringBuilder sbChain = new StringBuilder();
        sbChain.append("Bonjour")
               .append(" ")
               .append("le")
               .append(" ")
               .append("monde")
               .append("!");

        System.out.println(sbChain.toString());
        System.out.println();

        // ----------------------------------------------------
        // 13) equals
        // ----------------------------------------------------
        System.out.println("=== equals ===");

        StringBuilder sbA = new StringBuilder("Bonjour");
        StringBuilder sbB = new StringBuilder("Bonjour");

        System.out.println("sbA.equals(sbB) : " + sbA.equals(sbB));                        // false
        System.out.println("toString().equals : " + sbA.toString().equals(sbB.toString())); // true
        System.out.println();

        // ----------------------------------------------------
        // 14) Conversion
        // ----------------------------------------------------
        System.out.println("=== Conversion ===");

        String s = "Bonjour";
        StringBuilder sbConv = new StringBuilder(s);
        sbConv.append(" !");
        String resultat = sbConv.toString();

        System.out.println("String -> SB -> String : " + resultat);
        System.out.println();

        // ----------------------------------------------------
        // 15) Inverser une chaine
        // ----------------------------------------------------
        System.out.println("=== Inverser ===");

        String mot = "Bonjour";
        String inverse = new StringBuilder(mot).reverse().toString();
        System.out.println(mot + " inverse = " + inverse);
        System.out.println();

        // ----------------------------------------------------
        // 16) Palindrome
        // ----------------------------------------------------
        System.out.println("=== Palindrome ===");

        String palindrome = "radar";
        String palindromeInverse = new StringBuilder(palindrome).reverse().toString();
        System.out.println(palindrome + " est palindrome ? " + palindrome.equals(palindromeInverse));
        System.out.println();

        // ----------------------------------------------------
        // 17) Construire une chaine a partir d'un tableau
        // ----------------------------------------------------
        System.out.println("=== Tableau -> String ===");

        int[] nombres = {1, 2, 3, 4, 5};
        StringBuilder sbTab = new StringBuilder();

        for (int i = 0; i < nombres.length; i++) {
            sbTab.append(nombres[i]);
            if (i < nombres.length - 1) {
                sbTab.append(", ");
            }
        }

        System.out.println(sbTab.toString());
        System.out.println();

        // ----------------------------------------------------
        // 18) Supprimer les doublons consecutifs
        // ----------------------------------------------------
        System.out.println("=== Doublons consecutifs ===");

        String avecDoublons = "aabbccddeeff";
        StringBuilder sbDoublons = new StringBuilder();
        char precedent = '\0';

        for (int i = 0; i < avecDoublons.length(); i++) {
            char actuel = avecDoublons.charAt(i);
            if (actuel != precedent) {
                sbDoublons.append(actuel);
                precedent = actuel;
            }
        }

        System.out.println(avecDoublons + " -> " + sbDoublons.toString());
        System.out.println();

        // ----------------------------------------------------
        // 19) StringJoiner
        // ----------------------------------------------------
        System.out.println("=== StringJoiner ===");

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("pomme");
        sj.add("banane");
        sj.add("orange");

        System.out.println(sj.toString());
        System.out.println();

        // ----------------------------------------------------
        // 20) Comparaison de performances (petit test)
        // ----------------------------------------------------
        System.out.println("=== Performance (10000 iterations) ===");

        // Avec String
        long debutString = System.currentTimeMillis();
        String sPerf = "";
        for (int i = 0; i < 10000; i++) {
            sPerf += i;
        }
        long finString = System.currentTimeMillis();
        System.out.println("String : " + (finString - debutString) + " ms");

        // Avec StringBuilder
        long debutSB = System.currentTimeMillis();
        StringBuilder sbPerf = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sbPerf.append(i);
        }
        long finSB = System.currentTimeMillis();
        System.out.println("StringBuilder : " + (finSB - debutSB) + " ms");
        System.out.println();

        System.out.println("=== Fin du resume ===");
    }
}