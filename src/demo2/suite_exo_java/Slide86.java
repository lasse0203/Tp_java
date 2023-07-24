package demo2.suite_exo_java;

import java.util.Scanner;

public class Slide86 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un nombre pour calculer sont factorielle: ");
        int nombre = scanner.nextInt();
        double resultat = 1;
        String chaine = "";
        for (int i = 1; i <= nombre; i++) {
            resultat *= i;
            chaine += i + "x";
        }
        System.out.println(nombre + "! = " + chaine.substring(0, chaine.length() - 1) + " = "+resultat);

    }
}

