package demo2.suite_exo_java;

import java.util.Random;
import java.util.Scanner;

public class Slide85 {
    public static void main(String[] args) {
        Random random = new Random();
        int chiffreGagnant = random.nextInt(100);
        System.out.println(chiffreGagnant);

        int i=1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un nombre : ");
        int nombre = scanner.nextInt();

        while (nombre != chiffreGagnant){
            if (nombre < chiffreGagnant){
                System.out.print("Le nombre est plus grand ");
            } else {
                System.out.print("Le nombre est plus petit ");
            }
            nombre = scanner.nextInt();
            i++;
        }

        System.out.println("Vous avez gagné en "+i+" tentative(s)");

    }
}

