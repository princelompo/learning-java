
// ========================================
// JOUR 5 : STRUCTURES CONDITIONNELLES
// Fichier : ResumeJour5.java
// ========================================

/**
 * ========================================
 * RÉSUMÉ DU JOUR 5
 * ========================================
 * 
 * Ce programme résume tous les concepts vus aujourd'hui :
 * - Structure if simple
 * - Structure if-else
 * - Structure if-else if-else
 * - Conditions imbriquées
 * - Structure switch (classique et moderne)
 * - Opérateur ternaire
 * 
 * @author Formation Java
 * @version 1.0
 */
public class jav5 {
    
    public static void main(String[] args) {
        
        // ========================================
        // 1. STRUCTURE if SIMPLE
        // ========================================
        
        System.out.println("=== STRUCTURE if SIMPLE ===");
        
        int age = 20;
        
        // Exécute le bloc uniquement si la condition est vraie
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        }
        
        if (age < 18) {
            System.out.println("Vous êtes mineur.");
        }
        
        // Avec opérateurs logiques
        boolean aPermis = true;
        if (age >= 18 && aPermis) {
            System.out.println("Vous pouvez conduire.");
        }
        
        System.out.println();
        
        // ========================================
        // 2. STRUCTURE if-else
        // ========================================
        
        System.out.println("=== STRUCTURE if-else ===");
        
        // Exécute l'un OU l'autre, jamais les deux
        if (age >= 18) {
            System.out.println("Majeur");
        } else {
            System.out.println("Mineur");
        }
        
        // Exemple : pair ou impair
        int nombre = 7;
        if (nombre % 2 == 0) {
            System.out.println(nombre + " est pair.");
        } else {
            System.out.println(nombre + " est impair.");
        }
        
        System.out.println();
        
        // ========================================
        // 3. STRUCTURE if-else if-else
        // ========================================
        
        System.out.println("=== STRUCTURE if-else if-else ===");
        
        int note = 75;
        
        // Teste les conditions dans l'ordre, s'arrête à la première vraie
        if (note >= 90) {
            System.out.println("Excellent");
        } else if (note >= 80) {
            System.out.println("Très bien");
        } else if (note >= 70) {
            System.out.println("Bien");
        } else if (note >= 60) {
            System.out.println("Assez bien");
        } else if (note >= 50) {
            System.out.println("Passable");
        } else {
            System.out.println("Échec");
        }
        // Affiche : Bien
        
        System.out.println();
        
        // ========================================
        // 4. CONDITIONS IMBRIQUÉES
        // ========================================
        
        System.out.println("=== CONDITIONS IMBRIQUÉES ===");
        
        boolean estConnecte = true;
        boolean estAdmin = false;
        
        // if dans un if
        if (estConnecte) {
            if (estAdmin) {
                System.out.println("Accès administrateur");
            } else {
                System.out.println("Accès utilisateur");
            }
        } else {
            System.out.println("Veuillez vous connecter");
        }
        // Affiche : Accès utilisateur
        
        // Équivalent avec opérateurs logiques (plus lisible)
        if (estConnecte && estAdmin) {
            System.out.println("Accès administrateur");
        } else if (estConnecte && !estAdmin) {
            System.out.println("Accès utilisateur");
        } else {
            System.out.println("Veuillez vous connecter");
        }
        
        System.out.println();
        
        // ========================================
        // 5. STRUCTURE switch CLASSIQUE
        // ========================================
        
        System.out.println("=== STRUCTURE switch CLASSIQUE ===");
        
        int jour = 3;
        
        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Jour invalide");
                break;
        }
        // Affiche : Mercredi
        
        // Regrouper plusieurs cas
        switch (jour) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Jour ouvré");
                break;
            case 6:
            case 7:
                System.out.println("Week-end !");
                break;
            default:
                System.out.println("Jour invalide");
                break;
        }
        // Affiche : Jour ouvré
        
        System.out.println();
        
        // ========================================
        // 6. STRUCTURE switch MODERNE (Java 14+)
        // ========================================
        
        System.out.println("=== STRUCTURE switch MODERNE ===");
        
        // Syntaxe avec flèche (plus besoin de break)
        switch (jour) {
            case 1 -> System.out.println("Lundi");
            case 2 -> System.out.println("Mardi");
            case 3 -> System.out.println("Mercredi");
            case 4 -> System.out.println("Jeudi");
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("Jour invalide");
        }
        // Affiche : Mercredi
        
        // Switch comme expression (retourne une valeur)
        String nomJour = switch (jour) {
            case 1 -> "Lundi";
            case 2 -> "Mardi";
            case 3 -> "Mercredi";
            case 4 -> "Jeudi";
            case 5 -> "Vendredi";
            case 6 -> "Samedi";
            case 7 -> "Dimanche";
            default -> "Inconnu";
        };
        System.out.println("Jour : " + nomJour);  // Mercredi
        
        // Regrouper plusieurs cas (plus concis)
        String typeJour = switch (jour) {
            case 1, 2, 3, 4, 5 -> "Jour ouvré";
            case 6, 7 -> "Week-end";
            default -> "Invalide";
        };
        System.out.println("Type : " + typeJour);  // Jour ouvré
        
        System.out.println();
        
        // ========================================
        // 7. OPÉRATEUR TERNIAIRE
        // ========================================
        
        System.out.println("=== OPÉRATEUR TERNIAIRE ===");
        
        // Syntaxe : condition ? valeurSiVrai : valeurSiFaux
        String statut = (age >= 18) ? "Majeur" : "Mineur";
        System.out.println("Statut : " + statut);  // Majeur
        
        int x = 10, y = 5;
        int max = (x > y) ? x : y;
        System.out.println("Maximum : " + max);  // 10
        
        System.out.println();
        
        // ========================================
        // 8. EXEMPLE PRATIQUE : SYSTÈME DE NOTES
        // ========================================
        
        System.out.println("=== EXEMPLE PRATIQUE : SYSTÈME DE NOTES ===");
        
        int noteEtudiant = 85;
        String nomEtudiant = "Alice";
        
        System.out.println("Étudiant : " + nomEtudiant);
        System.out.println("Note : " + noteEtudiant + "/100");
        
        // Déterminer la mention avec if-else if-else
        String mention;
        if (noteEtudiant >= 90) {
            mention = "Excellent";
        } else if (noteEtudiant >= 80) {
            mention = "Très bien";
        } else if (noteEtudiant >= 70) {
            mention = "Bien";
        } else if (noteEtudiant >= 60) {
            mention = "Assez bien";
        } else if (noteEtudiant >= 50) {
            mention = "Passable";
        } else {
            mention = "Échec";
        }
        
        // Déterminer si admis avec ternaire
        String resultat = (noteEtudiant >= 50) ? "ADMIS" : "AJOURNÉ";
        
        System.out.println("Mention : " + mention);
        System.out.println("Résultat : " + resultat);
        
        System.out.println();
        
        // ========================================
        // 9. EXEMPLE PRATIQUE : CALCULATRICE AVEC switch
        // ========================================
        
        System.out.println("=== EXEMPLE PRATIQUE : CALCULATRICE ===");
        
        double nombre1 = 15.5;
        double nombre2 = 4.0;
        int operation = 3;  // 1=+, 2=-, 3=*, 4=/
        
        System.out.printf("Nombres : %.2f et %.2f%n", nombre1, nombre2);
        
        switch (operation) {
            case 1 -> {
                System.out.println("Opération : Addition");
                System.out.printf("Résultat : %.2f%n", nombre1 + nombre2);
            }
            case 2 -> {
                System.out.println("Opération : Soustraction");
                System.out.printf("Résultat : %.2f%n", nombre1 - nombre2);
            }
            case 3 -> {
                System.out.println("Opération : Multiplication");
                System.out.printf("Résultat : %.2f%n", nombre1 * nombre2);
            }
            case 4 -> {
                System.out.println("Opération : Division");
                if (nombre2 != 0) {
                    System.out.printf("Résultat : %.2f%n", nombre1 / nombre2);
                } else {
                    System.out.println("Erreur : Division par zéro !");
                }
            }
            default -> System.out.println("Opération invalide");
        }
        
        System.out.println();
        
        // ========================================
        // MESSAGE DE FIN
        // ========================================
        
        System.out.println("✅ Jour 5 terminé !");
        System.out.println("Prochaine étape : Boucles (for, while, do-while)");
        
    }
    
}