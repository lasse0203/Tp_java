package demo2;

import java.util.Scanner;
public class Exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir un numéro  de mois : ");
        int mois = Integer.parseInt(scanner.nextLine());

        switch (mois) {
            case 1:
                System.out.println("31 jours");
                break;
            case 2:
                System.out.println("28/29 jours");
                break;
            case 3:
                System.out.println("31 jours");
                break;
            case 4:
                System.out.println("30 jours");
                break;
            case 5:
                System.out.println("31 jours");
                break;
            case 6:
                System.out.println("30 jours");
                break;
            case 7:
                System.out.println("31 jours");
                break;
            case 8:
                System.out.println("31 jours");
                break;
            case 9:
                System.out.println("30 jours");
                break;
            case 10:
                System.out.println("31 jours");
                break;
            case 11:
                System.out.println("30 jours");
                break;
            case 12:
                System.out.println("31 jours");
                break;
            default:
                System.out.println("Veuillez saisir un numéro du mois entre 1 et 12 .");


        }
    }
}
