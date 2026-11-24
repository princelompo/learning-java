/*
 * ===== RESUME JOUR 25 =====
 * Notions vues :
 * - Flux (streams) : octets (InputStream/OutputStream) ou caracteres
 *   (Reader/Writer) ; on emboite les classes : BufferedReader(FileReader(...))
 * - Package java.io ; IOException = exception VERIFIEE (Jour 24) ;
 *   FileNotFoundException = sa sous-classe -> la capturer en premier
 * - Chemins sous Ubuntu : absolu (/home/...) ou relatif au repertoire de
 *   travail (dossier d'ou on lance java) ; "/" ; "~" non interprete par Java ;
 *   noms sensibles a la casse
 * - File : represente un CHEMIN, pas le contenu ; new File(...) ne cree rien.
 *   exists, isFile, isDirectory, getName, getPath, getAbsolutePath, getParent,
 *   length, canRead, canWrite, createNewFile, delete, mkdir, mkdirs, renameTo,
 *   list, listFiles (renvoient null en cas de probleme)
 *   delete/mkdir/renameTo renvoient un boolean : TESTER le resultat
 * - Lecture : BufferedReader.readLine() -> null a la fin ;
 *   while ((ligne = br.readLine()) != null) ; read() renvoie un int (-1 = fin)
 * - Ecriture : FileWriter (ecrase) / FileWriter(chemin, true) (ajoute) ;
 *   BufferedWriter.write + newLine ; PrintWriter.println (sans IOException)
 * - TOUJOURS try-with-resources : ferme et vide le tampon (sinon donnees perdues)
 * - Encodage : UTF-8 (defaut depuis Java 18) ; StandardCharsets.UTF_8
 * - Scanner : fichier / clavier (System.in) / String ; nextLine, next, nextInt,
 *   hasNextLine... ; piege nextInt() puis nextLine()
 * - BufferedReader pour les fichiers, Scanner pour le clavier
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jav22 {

    public static void main(String[] args) {

        String chemin = "demo.txt";

        // ============ 1. File : un chemin, pas un contenu ============
        File f = new File(chemin);
        System.out.println(f.exists()); // false : rien n'a ete cree par "new File"
        System.out.println(f.getAbsolutePath()); // chemin complet que Java utilise reellement

        // ============ 2. Ecriture : BufferedWriter (ecrase le contenu) ============
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(chemin))) {
            bw.write("Amine;14");
            bw.newLine(); // write n'ajoute PAS de saut de ligne
            bw.write("Sara;17");
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erreur ecriture : " + e.getMessage());
        }

        // ============ 3. Ajout a la fin : PrintWriter + FileWriter(chemin, true)
        // ============
        try (PrintWriter pw = new PrintWriter(new FileWriter(chemin, true))) { // true = append
            pw.println("Lina;12");
            pw.println("Karim"); // ligne volontairement sans ';'
        } catch (IOException e) {
            System.out.println("Erreur ajout : " + e.getMessage());
        }

        // ============ 4. Informations apres creation ============
        System.out.println(f.exists()); // true
        System.out.println(f.isFile()); // true
        System.out.println(f.getName()); // demo.txt
        System.out.println(f.length() > 0); // true : le fichier contient des octets

        // ============ 5. Lecture : BufferedReader + readLine ============
        List<String> lignes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
            String ligne;
            // L'affectation est une expression : on lit ET on teste null en une condition
            while ((ligne = br.readLine()) != null) {
                lignes.add(ligne);
            }
        } catch (FileNotFoundException e) { // sous-classe AVANT IOException
            System.out.println("Fichier introuvable : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erreur lecture : " + e.getMessage());
        }
        System.out.println(lignes); // [Amine;14, Sara;17, Lina;12, Karim]

        // ============ 6. Traitement de chaque ligne (split + parseInt) ============
        int somme = 0;
        for (String ligne : lignes) {
            String[] parties = ligne.split(";");
            if (parties.length != 2) { // protege contre ArrayIndexOutOfBounds
                System.out.println("Ignoree : " + ligne);
                continue;
            }
            try {
                somme += Integer.parseInt(parties[1]);
            } catch (NumberFormatException e) {
                System.out.println("Note invalide : " + parties[1]);
            }
        }
        System.out.println("Somme : " + somme); // 14 + 17 + 12 = 43

        // ============ 7. read() : lecture caractere par caractere ============
        try (FileReader fr = new FileReader(chemin)) {
            int code;
            int voyelles = 0;
            while ((code = fr.read()) != -1) { // read() renvoie un int ; -1 = fin
                char c = (char) code; // cast explicite int -> char
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    voyelles++;
                }
            }
            System.out.println("Voyelles minuscules : " + voyelles);
        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // ============ 8. Scanner sur un fichier ============
        try (Scanner sc = new Scanner(new File(chemin))) {
            int nbLignes = 0;
            while (sc.hasNextLine()) { // tester AVANT nextLine()
                sc.nextLine();
                nbLignes++;
            }
            System.out.println(nbLignes + " lignes"); // 4 lignes
        } catch (FileNotFoundException e) { // Scanner(File) leve cette exception
            System.out.println("Fichier introuvable");
        }

        // ============ 9. Scanner sur une String : decoupe en elements ============
        Scanner sc2 = new Scanner("12 abc 7");
        while (sc2.hasNext()) {
            if (sc2.hasNextInt()) { // le prochain element est-il un entier ?
                System.out.println("Entier : " + sc2.nextInt());
            } else {
                System.out.println("Mot : " + sc2.next());
            }
        }
        // Affiche : Entier : 12 / Mot : abc / Entier : 7

        // ============ 10. Dossiers : mkdirs, listFiles, delete ============
        File dossier = new File("tmp_demo/sous");
        System.out.println(dossier.mkdirs()); // true : cree tmp_demo ET sous
        File[] contenu = new File("tmp_demo").listFiles();
        if (contenu != null) { // null possible : toujours tester
            for (File element : contenu) {
                System.out.println(element.getName() + " dossier ? " + element.isDirectory());
            }
        }
        dossier.delete(); // supprime "sous" d'abord (dossier vide requis)
        new File("tmp_demo").delete(); // puis tmp_demo

        // ============ 11. Nettoyage : tester le resultat de delete() ============
        if (f.delete()) {
            System.out.println("Fichier supprime");
        } else {
            System.out.println("Suppression impossible");
        }
    }
}
