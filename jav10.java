// ============================================================
// Fichier : ResumeJour10.java
// Objectif : resumer tout ce qui a ete vu au Jour 10.
// ============================================================

public class jav10 {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1) Creation
        // ----------------------------------------------------
        System.out.println("=== Creation ===");

        String a = "Bonjour";
        String b = new String("Bonjour");
        String vide = "";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("vide length = " + vide.length());
        System.out.println();

        // ----------------------------------------------------
        // 2) Immutabilite
        // ----------------------------------------------------
        System.out.println("=== Immutabilite ===");

        String s = "Bonjour";
        s.toUpperCase();            // ne modifie PAS s
        System.out.println("Apres toUpperCase sans reassignation : " + s);

        s = s.toUpperCase();        // reassignation
        System.out.println("Apres reassignation : " + s);
        System.out.println();

        // ----------------------------------------------------
        // 3) length et charAt
        // ----------------------------------------------------
        System.out.println("=== length et charAt ===");

        String mot = "Bonjour";
        System.out.println("length = " + mot.length());
        System.out.println("charAt(0) = " + mot.charAt(0));
        System.out.println("charAt(6) = " + mot.charAt(6));
        System.out.println();

        // ----------------------------------------------------
        // 4) Comparaison
        // ----------------------------------------------------
        System.out.println("=== Comparaison ===");

        String x = "Bonjour";
        String y = "Bonjour";
        String z = new String("Bonjour");
        String w = "bonjour";

        System.out.println("x == y        : " + (x == y));        // true
        System.out.println("x == z        : " + (x == z));        // false
        System.out.println("x.equals(z)   : " + x.equals(z));     // true
        System.out.println("x.equals(w)   : " + x.equals(w));     // false
        System.out.println("x.equalsIgnoreCase(w) : " + x.equalsIgnoreCase(w)); // true
        System.out.println("x.compareTo(w) : " + x.compareTo(w)); // negatif
        System.out.println();

        // ----------------------------------------------------
        // 5) Concatenation
        // ----------------------------------------------------
        System.out.println("=== Concatenation ===");

        String p1 = "Bonjour";
        String p2 = " monde";
        System.out.println(p1 + p2);
        System.out.println(p1.concat(p2));

        int age = 25;
        System.out.println("Age : " + age);
        System.out.println("Calcul : " + (1 + 2));
        System.out.println();

        // ----------------------------------------------------
        // 6) Recherche
        // ----------------------------------------------------
        System.out.println("=== Recherche ===");

        String phrase = "Bonjour tout le monde";
        System.out.println("indexOf('o')      : " + phrase.indexOf('o'));
        System.out.println("lastIndexOf('o')  : " + phrase.lastIndexOf('o'));
        System.out.println("indexOf(\"tout\")  : " + phrase.indexOf("tout"));
        System.out.println("contains(\"tout\") : " + phrase.contains("tout"));
        System.out.println("startsWith(\"Bon\"): " + phrase.startsWith("Bon"));
        System.out.println("endsWith(\"de\")   : " + phrase.endsWith("de"));
        System.out.println();

        // ----------------------------------------------------
        // 7) Extraction
        // ----------------------------------------------------
        System.out.println("=== Extraction ===");

        String mot2 = "Bonjour";
        System.out.println("substring(3)    : " + mot2.substring(3));
        System.out.println("substring(0, 3) : " + mot2.substring(0, 3));
        System.out.println();

        // ----------------------------------------------------
        // 8) Transformation
        // ----------------------------------------------------
        System.out.println("=== Transformation ===");

        String espace = "   Bonjour   ";
        System.out.println("toUpperCase : " + espace.toUpperCase());
        System.out.println("toLowerCase : " + espace.toLowerCase());
        System.out.println("trim        : [" + espace.trim() + "]");
        System.out.println("strip       : [" + espace.strip() + "]");
        System.out.println("replace     : " + "Bonjour".replace('o', 'a'));
        System.out.println();

        // ----------------------------------------------------
        // 9) split et join
        // ----------------------------------------------------
        System.out.println("=== split et join ===");

        String csv = "pomme,banane,orange";
        String[] fruits = csv.split(",");

        for (String fruit : fruits) {
            System.out.println("Fruit : " + fruit);
        }

        String joint = String.join(" | ", fruits);
        System.out.println("Joint : " + joint);
        System.out.println();

        // ----------------------------------------------------
        // 10) Verifications
        // ----------------------------------------------------
        System.out.println("=== Verifications ===");

        System.out.println("\"\".isEmpty()       : " + "".isEmpty());
        System.out.println("\"   \".isEmpty()    : " + "   ".isEmpty());
        System.out.println("\"   \".isBlank()    : " + "   ".isBlank());
        System.out.println("\"12345\".matches    : " + "12345".matches("[0-9]+"));
        System.out.println();

        // ----------------------------------------------------
        // 11) Conversion
        // ----------------------------------------------------
        System.out.println("=== Conversion ===");

        int n = 42;
        double d = 3.14;
        boolean bool = true;

        System.out.println(String.valueOf(n));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(bool));

        char[] lettres = "Bonjour".toCharArray();
        System.out.println("Premiere lettre : " + lettres[0]);
        System.out.println();

        // ----------------------------------------------------
        // 12) String.format
        // ----------------------------------------------------
        System.out.println("=== String.format ===");

        String nom = "Alice";
        int age2 = 25;
        String message = String.format("Je m'appelle %s et j'ai %d ans.", nom, age2);
        System.out.println(message);

        System.out.println(String.format("Pi = %.2f", 3.14159));
        System.out.println(String.format("%05d", 42));
        System.out.println();

        // ----------------------------------------------------
        // 13) Pool de chaines
        // ----------------------------------------------------
        System.out.println("=== Pool de chaines ===");

        String pool1 = "Bonjour";
        String pool2 = "Bonjour";
        String horsPool = new String("Bonjour");
        String internee = new String("Bonjour").intern();

        System.out.println("pool1 == pool2      : " + (pool1 == pool2));      // true
        System.out.println("pool1 == horsPool   : " + (pool1 == horsPool));   // false
        System.out.println("pool1 == internee   : " + (pool1 == internee));   // true
        System.out.println();

        // ----------------------------------------------------
        // 14) Exemple : palindrome
        // ----------------------------------------------------
        System.out.println("=== Palindrome ===");

        String palindrome = "radar";
        String inverse = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            inverse += palindrome.charAt(i);
        }

        System.out.println(palindrome + " inverse = " + inverse);
        System.out.println("Est un palindrome ? " + palindrome.equals(inverse));
        System.out.println();

        // ----------------------------------------------------
        // 15) Exemple : compter les voyelles
        // ----------------------------------------------------
        System.out.println("=== Voyelles ===");

        String texte = "Bonjour tout le monde";
        String voyelles = "aeiouyAEIOUY";
        int compteur = 0;

        for (int i = 0; i < texte.length(); i++) {
            if (voyelles.indexOf(texte.charAt(i)) != -1) {
                compteur++;
            }
        }

        System.out.println("Voyelles dans \"" + texte + "\" : " + compteur);
        System.out.println();

        // ----------------------------------------------------
        // 16) Exemple : inverser les mots
        // ----------------------------------------------------
        System.out.println("=== Mots inverses ===");

        String phrase2 = "Bonjour tout le monde";
        String[] mots = phrase2.split(" ");

        for (int i = mots.length - 1; i >= 0; i--) {
            System.out.print(mots[i] + " ");
        }
        System.out.println();
        System.out.println();

        // ----------------------------------------------------
        // 17) Exemple : capitaliser
        // ----------------------------------------------------
        System.out.println("=== Capitaliser ===");

        String mot3 = "bonjour";
        String capitalise = mot3.substring(0, 1).toUpperCase() + mot3.substring(1).toLowerCase();
        System.out.println(capitalise);
        System.out.println();

        System.out.println("=== Fin du resume ===");
    }
}