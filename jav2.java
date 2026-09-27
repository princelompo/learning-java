// ============================================================
// Fichier : ResumeJour2.java
// Objectif : resumer tout ce qui a ete vu au Jour 2.
// ============================================================

// Un commentaire sur une ligne commence par //.

/*
 * Un commentaire sur plusieurs lignes
 * commence par /* et se termine par */
  

/**
 * Un commentaire Javadoc commence par /**.
 * Il est utilise pour la documentation.
 */

// Declaration d'une classe publique nommee ResumeJour2.
// Le fichier doit donc s'appeler ResumeJour2.java.
public class jav2{

    // La methode main est le point d'entree du programme.
    // Sa signature doit etre exactement :
    // public static void main(String[] args)
    public static void main(String[] args) {

        // ----- 1) Affichage avec retour a la ligne -----
        // println affiche le texte puis revient a la ligne.
        System.out.println("=== Resume du Jour 2 ===");

        // ----- 2) Affichage sans retour a la ligne -----
        // print affiche le texte sans revenir a la ligne.
        System.out.print("Structure minimale : ");
        System.out.println("public class Nom { public static void main(String[] args) { ... } }");

        // ----- 3) Ligne vide -----
        // println() sans argument affiche juste un retour a la ligne.
        System.out.println();

        // ----- 4) Rappel des commandes -----
        System.out.println("Compilation : javac ResumeJour2.java");
        System.out.println("Execution   : java ResumeJour2");

        // ----- 5) Ligne vide -----
        System.out.println();

        // ----- 6) Rappel des regles -----
        System.out.println("Regles importantes :");
        System.out.println("- La classe public doit etre dans un fichier du meme nom.");
        System.out.println("- Chaque instruction se termine par un point-virgule.");
        System.out.println("- Chaque accolade ouverte doit etre fermee.");
        System.out.println("- La methode main doit etre public static void.");

        // ----- 7) Fin du programme -----
        System.out.println("=== Fin du resume ===");
    }
}