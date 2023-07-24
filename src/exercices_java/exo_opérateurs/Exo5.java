package demo2;

import java.util.Scanner;
public class Exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir un jour de la semaine : ");
        int jour = Integer.parseInt(scanner.nextLine());

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
                System.out.println(" Veuillez saisir un numéro de jour entre 1 et 7.");
        }
    }
}
