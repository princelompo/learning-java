// ========================================
// JOUR 4 : OPÉRATEURS ARITHMÉTIQUES, LOGIQUES ET DE COMPARAISON
// Fichier : ResumeJour4.java
// ========================================


/**
 * ========================================
 * RÉSUMÉ DU JOUR 4
 * ========================================
 * 
 * Ce programme résume tous les concepts vus aujourd'hui :
 * - Opérateurs arithmétiques (+, -, *, /, %)
 * - Opérateurs d'incrémentation/décrémentation (++, --)
 * - Opérateurs d'affectation composée (+=, -=, *=, /=, %=)
 * - Opérateurs de comparaison (==, !=, <, >, <=, >=)
 * - Opérateurs logiques (&&, ||, !)
 * - Opérateur ternaire (? :)
 * 
 * @author Formation Java
 * @version 1.0
 */
public class jav4{
    
    public static void main(String[] args) {
        
        // ========================================
        // 1. OPÉRATEURS ARITHMÉTIQUES
        // ========================================
        
        System.out.println("=== OPÉRATEURS ARITHMÉTIQUES ===");
        
        int a = 17;
        int b = 5;
        
        // Addition
        int somme = a + b;
        System.out.println("17 + 5 = " + somme);           // 22
        
        // Soustraction
        int difference = a - b;
        System.out.println("17 - 5 = " + difference);      // 12
        
        // Multiplication
        int produit = a * b;
        System.out.println("17 * 5 = " + produit);         // 85
        
        // Division entière (⚠️ tronquée pour les int)
        int quotient = a / b;
        System.out.println("17 / 5 (int) = " + quotient);  // 3
        
        // Division décimale
        double quotientDecimal = (double) a / b;
        System.out.println("17 / 5 (double) = " + quotientDecimal);  // 3.4
        
        // Modulo (reste de la division)
        int reste = a % b;
        System.out.println("17 % 5 = " + reste);           // 2
        
        // Vérification : 17 = 5 × 3 + 2
        System.out.println("Vérification : " + b + " × " + quotient + " + " + reste + " = " + (b * quotient + reste));
        
        System.out.println();
        
        // ========================================
        // 2. OPÉRATEURS D'INCRÉMENTATION/DÉCRÉMENTATION
        // ========================================
        
        System.out.println("=== INCRÉMENTATION ET DÉCRÉMENTATION ===");
        
        int compteur = 10;
        
        // Post-incrémentation : utilise PUIS incrémente
        int postInc = compteur++;
        System.out.println("postInc = " + postInc);        // 10
        System.out.println("compteur = " + compteur);      // 11
        
        // Pré-incrémentation : incrémente PUIS utilise
        int preInc = ++compteur;
        System.out.println("preInc = " + preInc);          // 12
        System.out.println("compteur = " + compteur);      // 12
        
        // Post-décrémentation : utilise PUIS décrémente
        int postDec = compteur--;
        System.out.println("postDec = " + postDec);        // 12
        System.out.println("compteur = " + compteur);      // 11
        
        // Pré-décrémentation : décrémente PUIS utilise
        int preDec = --compteur;
        System.out.println("preDec = " + preDec);          // 10
        System.out.println("compteur = " + compteur);      // 10
        
        System.out.println();
        
        // ========================================
        // 3. OPÉRATEURS D'AFFECTATION COMPOSÉE
        // ========================================
        
        System.out.println("=== AFFECTATION COMPOSÉE ===");
        
        int x = 20;
        
        x += 5;    // x = x + 5
        System.out.println("x += 5 → " + x);               // 25
        
        x -= 3;    // x = x - 3
        System.out.println("x -= 3 → " + x);               // 22
        
        x *= 2;    // x = x * 2
        System.out.println("x *= 2 → " + x);               // 44
        
        x /= 4;    // x = x / 4
        System.out.println("x /= 4 → " + x);               // 11
        
        x %= 3;    // x = x % 3
        System.out.println("x %= 3 → " + x);               // 2
        
        System.out.println();
        
        // ========================================
        // 4. OPÉRATEURS DE COMPARAISON
        // ========================================
        
        System.out.println("=== OPÉRATEURS DE COMPARAISON ===");
        
        int m = 10;
        int n = 5;
        
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m == n : " + (m == n));        // false
        System.out.println("m != n : " + (m != n));        // true
        System.out.println("m < n : " + (m < n));          // false
        System.out.println("m > n : " + (m > n));          // true
        System.out.println("m <= n : " + (m <= n));        // false
        System.out.println("m >= n : " + (m >= n));        // true
        
        System.out.println();
        
        // ========================================
        // 5. OPÉRATEURS LOGIQUES
        // ========================================
        
        System.out.println("=== OPÉRATEURS LOGIQUES ===");
        
        int age = 25;
        boolean aPermis = true;
        boolean estEtudiant = false;
        
        // ET logique (&&)
        boolean peutConduire = (age >= 18) && aPermis;
        System.out.println("Peut conduire : " + peutConduire);              // true
        
        boolean reductionEtudiant = (age < 26) && estEtudiant;
        System.out.println("Réduction étudiant : " + reductionEtudiant);    // false
        
        // OU logique (||)
        boolean reduction = (age < 18) || (age > 65) || estEtudiant;
        System.out.println("Réduction : " + reduction);                     // false
        
        boolean acces = aPermis || estEtudiant;
        System.out.println("Accès autorisé : " + acces);                    // true
        
        // NON logique (!)
        boolean estMineur = !(age >= 18);
        System.out.println("Est mineur : " + estMineur);                    // false
        
        System.out.println();
        
        // ========================================
        // 6. OPÉRATEUR TERNIAIRE
        // ========================================
        
        System.out.println("=== OPÉRATEUR TERNIAIRE ===");
        
        int nombre = 7;
        
        // Syntaxe : condition ? valeurSiVrai : valeurSiFaux
        String parite = (nombre % 2 == 0) ? "Pair" : "Impair";
        System.out.println(nombre + " est " + parite);      // Impair
        
        // Trouver le maximum
        int p = 15;
        int q = 8;
        int max = (p > q) ? p : q;
        System.out.println("Maximum entre " + p + " et " + q + " : " + max);  // 15
        
        // Message selon l'âge
        String message = (age >= 18) ? "Majeur" : "Mineur";
        System.out.println("Statut : " + message);          // Majeur
        
        System.out.println();
        
        // ========================================
        // 7. EXEMPLE PRATIQUE : CALCULATEUR SIMPLE
        // ========================================
        
        System.out.println("=== EXEMPLE PRATIQUE : CALCULATEUR ===");
        
        double nombre1 = 15.5;
        double nombre2 = 4.2;
        
        double addition = nombre1 + nombre2;
        double soustraction = nombre1 - nombre2;
        double multiplication = nombre1 * nombre2;
        double division = nombre1 / nombre2;
        
        System.out.printf("%.2f + %.2f = %.2f%n", nombre1, nombre2, addition);
        System.out.printf("%.2f - %.2f = %.2f%n", nombre1, nombre2, soustraction);
        System.out.printf("%.2f × %.2f = %.2f%n", nombre1, nombre2, multiplication);
        System.out.printf("%.2f ÷ %.2f = %.2f%n", nombre1, nombre2, division);
        
        System.out.println();
        
        // ========================================
        // 8. EXEMPLE PRATIQUE : VÉRIFICATIONS
        // ========================================
        
        System.out.println("=== EXEMPLE PRATIQUE : VÉRIFICATIONS ===");
        
        int annee = 2024;
        
        // Vérifier si une année est bissextile
        // Règle : divisible par 4 ET (pas divisible par 100 OU divisible par 400)
        boolean estBissextile = (annee % 4 == 0) && ((annee % 100 != 0) || (annee % 400 == 0));
        System.out.println(annee + " est bissextile : " + estBissextile);  // true
        
        // Vérifier si un nombre est dans une plage
        int valeur = 15;
        boolean dansPlage = (valeur >= 10) && (valeur <= 20);
        System.out.println(valeur + " est dans [10, 20] : " + dansPlage);  // true
        
        // Vérifier si un nombre est positif, négatif ou nul
        int test = -5;
        String signe = (test > 0) ? "Positif" : (test < 0) ? "Négatif" : "Zéro";
        System.out.println(test + " est " + signe);  // Négatif
        
        System.out.println();
        
        // ========================================
        // MESSAGE DE FIN
        // ========================================
        
        System.out.println("✅ Jour 4 terminé !");
        System.out.println("Prochaine étape : Structures conditionnelles (if, else, switch)");
        
    }
    
}