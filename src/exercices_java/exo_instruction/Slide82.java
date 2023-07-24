package demo2.Exo_java.suite_exo_java;

import java.util.Scanner;
public class Slide82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Étape 1 : Déclarer la variable nombre et la saisir au clavier
        System.out.print("Saisir un nombre : ");
        int nombre = scanner.nextInt();

        // Afficher les suites de nombres jusqu'à atteindre le nombre spécifié
        System.out.print(nombre + " = ");

        // Boucle for pour trouver les suites de nombres
        for (int i = 1; i <= nombre / 2; i++) {
            int somme = i;
            String suite = i + " ";

            for (int j = i + 1; somme < nombre; j++) {
                somme += j;
                suite += "+ " + j + " ";
            }

            if (somme == nombre) {
                System.out.println(nombre + " = "+suite);
            }
        }
    }
}






