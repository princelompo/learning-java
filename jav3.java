// ========================================
// JOUR 3 : VARIABLES, TYPES PRIMITIFS ET CONSTANTES
// Fichier : ResumeJour3.java
// ========================================

/*
 * ========================================
 * RÉSUMÉ DU JOUR 3
 * ========================================
 * 
 * Ce programme résume tous les concepts vus aujourd'hui :
 * - Types de données primitifs
 * - Déclaration et initialisation de variables
 * - Constantes
 * - Conversion de types (casting)
 * - Opérations sur les types numériques
 * - Classes enveloppes (Wrapper Classes)
 * 
 * @author Formation Java
 * @version 1.0
 */

public class jav3{
    
    public static void main(String[] args) {
        
        // ========================================
        // 1. TYPES ENTIERS
        // ========================================
        
        System.out.println("=== TYPES ENTIERS ===");
        
        // byte : -128 à 127 (8 bits)
        byte temperature = 25;
        System.out.println("byte temperature = " + temperature);
        
        // short : -32 768 à 32 767 (16 bits)
        short annee = 2024;
        System.out.println("short annee = " + annee);
        
        // int : -2³¹ à 2³¹-1 (32 bits) - LE PLUS UTILISÉ
        int population = 50000;
        System.out.println("int population = " + population);
        
        // long : -2⁶³ à 2⁶³-1 (64 bits) - suffixe L obligatoire
        long populationMondiale = 8000000000L;
        System.out.println("long populationMondiale = " + populationMondiale);
        
        System.out.println();
        
        // ========================================
        // 2. TYPES DÉCIMAUX
        // ========================================
        
        System.out.println("=== TYPES DÉCIMAUX ===");
        
        // float : simple précision (7 chiffres) - suffixe f obligatoire
        float prixFloat = 19.99f;
        System.out.println("float prixFloat = " + prixFloat);
        
        // double : double précision (15 chiffres) - PAR DÉFAUT
        double prixDouble = 19.99;
        System.out.println("double prixDouble = " + prixDouble);
        
        // Notation scientifique
        double vitesseLumiere = 2.998e8;
        System.out.println("double vitesseLumiere = " + vitesseLumiere);
        
        System.out.println();
        
        // ========================================
        // 3. TYPE BOOLÉEN
        // ========================================
        
        System.out.println("=== TYPE BOOLÉEN ===");
        
        boolean estVrai = true;
        boolean estFaux = false;
        boolean estMajeur = true;
        
        System.out.println("boolean estVrai = " + estVrai);
        System.out.println("boolean estFaux = " + estFaux);
        System.out.println("boolean estMajeur = " + estMajeur);
        
        System.out.println();
        
        // ========================================
        // 4. TYPE CARACTÈRE
        // ========================================
        
        System.out.println("=== TYPE CARACTÈRE ===");
        
        char lettre = 'A';
        char chiffre = '5';
        char symbole = '@';
        
        System.out.println("char lettre = " + lettre);
        System.out.println("char chiffre = " + chiffre);
        System.out.println("char symbole = " + symbole);
        
        // Caractères Unicode
        char coeur = '\u2764';
        char smiley = '\u263A';
        System.out.println("Unicode coeur = " + coeur);
        System.out.println("Unicode smiley = " + smiley);
        
        // Conversion char → int (code ASCII)
        int codeAscii = lettre;
        System.out.println("Code ASCII de 'A' = " + codeAscii);
        
        System.out.println();
        
        // ========================================
        // 5. CONSTANTES
        // ========================================
        
        System.out.println("=== CONSTANTES ===");
        
        // Déclaration avec "final"
        final double TAUX_TVA = 0.20;
        final int AGE_MAJEUR = 18;
        final String NOM_APPLICATION = "MaSuperApp";
        final double PI = 3.14159;
        
        System.out.println("TAUX_TVA = " + TAUX_TVA);
        System.out.println("AGE_MAJEUR = " + AGE_MAJEUR);
        System.out.println("NOM_APPLICATION = " + NOM_APPLICATION);
        System.out.println("PI = " + PI);
        
        // Les constantes ne peuvent pas être modifiées
        // TAUX_TVA = 0.25;  // ❌ ERREUR DE COMPILATION
        
        System.out.println();
        
        // ========================================
        // 6. CONVERSION DE TYPES (CASTING)
        // ========================================
        
        System.out.println("=== CONVERSION DE TYPES ===");
        
        // Conversion implicite (élargissement) - automatique
        byte petit = 100;
        int moyen = petit;              // byte → int (automatique)
        long grand = moyen;             // int → long (automatique)
        double decimal = grand;         // long → double (automatique)
        
        System.out.println("Conversion implicite : " + petit + " → " + decimal);
        
        // Conversion explicite (rétrécissement) - cast requis
        double grandDecimal = 3.99;
        int entier = (int) grandDecimal;    // double → int (tronqué)
        
        System.out.println("Conversion explicite : " + grandDecimal + " → " + entier);
        
        // ⚠️ Attention aux pertes de données
        int tresGrand = 130;
        byte tresPetit = (byte) tresGrand;  // Dépassement !
        System.out.println("Dépassement : " + tresGrand + " → " + tresPetit);
        
        System.out.println();
        
        // ========================================
        // 7. OPÉRATIONS NUMÉRIQUES
        // ========================================
        
        System.out.println("=== OPÉRATIONS NUMÉRIQUES ===");
        
        int a = 10;
        int b = 3;
        
        // Division entière (tronquée)
        int divisionEntiere = a / b;
        System.out.println("10 / 3 (int) = " + divisionEntiere);  // 3
        
        // Division décimale
        double divisionDecimale = (double) a / b;
        System.out.println("10 / 3 (double) = " + divisionDecimale);  // 3.33...
        
        // Modulo (reste)
        int reste = a % b;
        System.out.println("10 % 3 = " + reste);  // 1
        
        // Vérifier si un nombre est pair
        int nombre = 7;
        boolean estPair = (nombre % 2 == 0);
        System.out.println(nombre + " est pair ? " + estPair);  // false
        
        System.out.println();
        
        // ========================================
        // 8. CLASSES ENVELOPPES (WRAPPER CLASSES)
        // ========================================
        
        System.out.println("=== CLASSES ENVELOPPES ===");
        
        // Conversion String → int
        String texteNombre = "42";
        int nombreConverti = Integer.parseInt(texteNombre);
        System.out.println("String → int : " + texteNombre + " → " + nombreConverti);
        
        // Conversion int → String
        int age = 25;
        String texteAge = Integer.toString(age);
        System.out.println("int → String : " + age + " → " + texteAge);
        
        // Constantes des classes enveloppes
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Math.PI = " + Math.PI);
        
        // Comparaison d'objets (toujours utiliser equals !)
        Integer x = 1000;
        Integer y = 1000;
        System.out.println("x == y : " + (x == y));           // false (références)
        System.out.println("x.equals(y) : " + x.equals(y));   // true (valeurs)
        
        System.out.println();
        
        // ========================================
        // 9. EXEMPLE PRATIQUE : CALCUL DE PRIX TTC
        // ========================================
        
        System.out.println("=== EXEMPLE PRATIQUE : CALCUL TTC ===");
        
        // Déclaration des variables
        double prixHT = 100.0;
        final double TAUX_TVA_PRATIQUE = 0.20;
        
        // Calcul du montant de la TVA
        double montantTVA = prixHT * TAUX_TVA_PRATIQUE;
        
        // Calcul du prix TTC
        double prixTTC = prixHT + montantTVA;
        
        // Affichage des résultats
        System.out.printf("Prix HT : %.2f €%n", prixHT);
        System.out.printf("TVA (%.0f%%) : %.2f €%n", TAUX_TVA_PRATIQUE * 100, montantTVA);
        System.out.printf("Prix TTC : %.2f €%n", prixTTC);
        
        System.out.println();
        
        // ========================================
        // MESSAGE DE FIN
        // ========================================
        
        System.out.println("✅ Jour 3 terminé !");
        System.out.println("Prochaine étape : Opérateurs arithmétiques, logiques et de comparaison");
        
    }
    
}