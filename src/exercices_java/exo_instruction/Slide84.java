package demo2.Exo_java.suite_exo_java;

import java.util.Scanner;

public class Slide84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;

        System.out.print("Entrer un nombre : ");
        int nombre = scanner.nextInt();

        if (nombre < 0 || nombre == 1) {
            System.out.println(nombre + " n'est pas un nombre premier");
        } else {
            for (int i = 2; i <= nombre / 2; i++) {
                if (nombre % i == 0) {
                    System.out.println(nombre + " n'est pas un nombre premier");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(nombre + " est un nombre premier");
            }
        }

    }
}

