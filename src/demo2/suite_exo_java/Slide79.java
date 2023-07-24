package demo2.suite_exo_java;

import java.util.Scanner;

public class Slide79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir le nombre de chapitre: ");
        int chapitre = scanner.nextInt();
        System.out.print("saisir le nombre de sous chapitre: ");
        int sousChapitre = scanner.nextInt();

        for (int i = 1; i <= chapitre; i++) {
            System.out.println("chapitre :" + i);
            for (int j = 1; j <= sousChapitre; j++) {
                System.out.println("sous chapitre : " + i + "." + j);
            }
        }
    }
}
