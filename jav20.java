// ============================================================
// RÉSUMÉ JOUR 24 : Exceptions (try, catch, finally, throw, throws)
// ============================================================

// --- Exception métier VÉRIFIÉE (hérite d'Exception) ---
class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {
        super(message);
    }
}

// --- Exception métier NON vérifiée (hérite de RuntimeException) ---
class MontantInvalideException extends RuntimeException {
    public MontantInvalideException(String message) {
        super(message);
    }
}

// --- Classe métier utilisant throw / throws ---
class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void retirer(double montant)
            throws SoldeInsuffisantException {         // exception vérifiée déclarée
        if (montant <= 0) {
            // exception NON vérifiée : pas besoin de throws
            throw new MontantInvalideException("Montant ≤ 0 : " + montant);
        }
        if (montant > solde) {
            // exception vérifiée : l'appelant devra gérer
            throw new SoldeInsuffisantException(
                "Retrait " + montant + " > solde " + solde);
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " → solde = " + solde);
    }

    public double getSolde() { return solde; }
}

// --- Programme principal ---
public class jav20{
    public static void main(String[] args) {

        // ==================== 1. try / catch simple ====================
        System.out.println("=== try/catch simple ===");
        try {
            int r = 10 / 0;
            System.out.println(r);
        } catch (ArithmeticException e) {
            System.out.println("Arithmétique : " + e.getMessage());
        }

        // ==================== 2. try/catch/finally ====================
        System.out.println("\n=== try/catch/finally ===");
        try {
            int[] tab = {1, 2, 3};
            System.out.println(tab[5]);                  // hors bornes
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index invalide : " + e.getMessage());
        } finally {
            System.out.println("finally exécuté (libération des ressources)");
        }

        // ==================== 3. multi-catch ====================
        System.out.println("\n=== multi-catch ===");
        try {
            String s = null;
            System.out.println(s.length());               // NullPointerException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Erreur capturée : " + e.getMessage());
        }

        // ==================== 4. NumberFormatException ====================
        System.out.println("\n=== NumberFormatException ===");
        try {
            int n = Integer.parseInt("12abc");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Parsing impossible : " + e.getMessage());
        }

        // ==================== 5. throw dans une méthode ====================
        System.out.println("\n=== throw + catch personnalisé ===");
        CompteBancaire c = new CompteBancaire("Alice", 100);

        try {
            c.retirer(50);      // OK
            c.retirer(80);      // SoldeInsuffisantException (vérifiée)
        } catch (SoldeInsuffisantException e) {
            System.out.println("Métier : " + e.getMessage());
        }

        try {
            c.retirer(-10);     // MontantInvalideException (non vérifiée)
        } catch (MontantInvalideException e) {
            System.out.println("Validation : " + e.getMessage());
        }

        System.out.println("Solde final : " + c.getSolde());  // 50.0

        // ==================== 6. Propagation via throws ====================
        System.out.println("\n=== propagation via throws ===");
        try {
            effectuerRetrait(c, 999);       // méthode qui relaie l'exception
        } catch (SoldeInsuffisantException e) {
            System.out.println("Capturée en haut : " + e.getMessage());
        }

        System.out.println("\nFin du programme.");
    }

    // Méthode qui propage une exception vérifiée : pas de try/catch interne,
    // elle déclare "throws" et laisse l'appelant gérer
    static void effectuerRetrait(CompteBancaire c, double m)
            throws SoldeInsuffisantException {
        c.retirer(m);
    }
}
