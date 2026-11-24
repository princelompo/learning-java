// ============================================================
// Fichier : ResumeJour15.java
// Objectif : resumer tout ce qui a ete vu au Jour 15.
// ============================================================

public class jav15{

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1) Creation d'objets
        // ----------------------------------------------------
        System.out.println("=== Creation d'objets ===");

        Personne alice = new Personne();
        Personne bob = new Personne();

        // ----------------------------------------------------
        // 2) Acces aux attributs
        // ----------------------------------------------------
        System.out.println("=== Acces aux attributs ===");

        alice.nom = "Alice";
        alice.age = 25;

        bob.nom = "Bob";
        bob.age = 30;

        System.out.println("alice.nom = " + alice.nom);
        System.out.println("alice.age = " + alice.age);
        System.out.println("bob.nom = " + bob.nom);
        System.out.println("bob.age = " + bob.age);
        System.out.println();

        // ----------------------------------------------------
        // 3) Appel de methodes d'instance
        // ----------------------------------------------------
        System.out.println("=== Methodes d'instance ===");

        alice.sePresenter();
        bob.sePresenter();
        System.out.println();

        // ----------------------------------------------------
        // 4) Modification via methode
        // ----------------------------------------------------
        System.out.println("=== Anniversaire ===");

        alice.feterAnniversaire();
        alice.sePresenter();   // 26 ans
        System.out.println();

        // ----------------------------------------------------
        // 5) Exemple : Compte bancaire
        // ----------------------------------------------------
        System.out.println("=== Compte bancaire ===");

        Compte c = new Compte();
        c.titulaire = "Alice";
        c.solde = 1000;

        c.deposer(500);
        c.retirer(200);
        c.afficher();

        c.retirer(2000);   // solde insuffisant
        c.afficher();
        System.out.println();

        // ----------------------------------------------------
        // 6) Exemple : Rectangle
        // ----------------------------------------------------
        System.out.println("=== Rectangle ===");

        Rectangle r = new Rectangle();
        r.largeur = 5;
        r.hauteur = 3;

        System.out.println("Aire = " + r.aire());
        System.out.println("Perimetre = " + r.perimetre());
        System.out.println();

        // ----------------------------------------------------
        // 7) static vs instance
        // ----------------------------------------------------
        System.out.println("=== static vs instance ===");

        Compteur c1 = new Compteur();
        Compteur c2 = new Compteur();

        c1.incrementer();
        c1.incrementer();
        c2.incrementer();

        System.out.println("total (static)   : " + Compteur.total);
        System.out.println("c1.valeur        : " + c1.valeur);
        System.out.println("c2.valeur        : " + c2.valeur);
        System.out.println();

        // ----------------------------------------------------
        // 8) Methode statique
        // ----------------------------------------------------
        System.out.println("=== Methode statique ===");

        Outils.direBonjour();
        System.out.println();

        System.out.println("=== Fin du resume ===");
    }
}

// ============================================================
// Classe Personne
// ============================================================

class Personne {
    // Attributs d'instance
    String nom;
    int age;

    // Methode d'instance
    void sePresenter() {
        System.out.println("Je m'appelle " + nom + " et j'ai " + age + " ans.");
    }

    void feterAnniversaire() {
        age++;
    }
}

// ============================================================
// Classe Compte
// ============================================================

class Compte {
    String titulaire;
    double solde;

    void deposer(double montant) {
        solde += montant;
    }

    void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    void afficher() {
        System.out.println(titulaire + " : " + solde + " EUR");
    }
}

// ============================================================
// Classe Rectangle
// ============================================================

class Rectangle {
    double largeur;
    double hauteur;

    double aire() {
        return largeur * hauteur;
    }

    double perimetre() {
        return 2 * (largeur + hauteur);
    }
}

// ============================================================
// Classe Compteur (static vs instance)
// ============================================================

class Compteur {
    // Attribut statique : partage par tous les objets.
    static int total = 0;

    // Attribut d'instance : propre a chaque objet.
    int valeur = 0;

    void incrementer() {
        total++;
        valeur++;
    }
}

// ============================================================
// Classe Outils (methode statique)
// ============================================================

class Outils {
    static void direBonjour() {
        System.out.println("Bonjour depuis une methode statique !");
    }
}