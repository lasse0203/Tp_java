package demo;
import  java.util.Scanner;
public class exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir une chaine : ");
        String chaine = scanner.nextLine();

        System.out.println("En majiscule : " +chaine.toUpperCase() );

        System.out.println("En miniscule : " +chaine.toLowerCase() );

        // split d'un tableau avec un delimiter vide

        String[] tabChar = chaine.split("");
        System.out.println("En tableau : " +String.join(",",tabChar));

        // split d'un tableau delimiter espace

        String[] tabLettre = chaine.split(" ");
        String result = "";
        for (String mot : tabLettre) {
            result += Character.toUpperCase(mot.charAt(0)) + mot.substring(1).toLowerCase()+ " ";
        }
        System.out.println("Première lettre de chaque mot en majuscule : " + result.trim());
    }
}
