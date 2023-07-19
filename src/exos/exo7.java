package exos;


import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir la longueur d'un côté : ");
        double longueur = scanner.nextDouble();

        // Calcul périmètre du carré
        double perimetre = longueur * 4 ;

        System.out.println("Le périmètre du carré est de  " + perimetre + "Cm");

        // calcul  aire du carré

        double aire =  longueur * 5 ;

        System.out.println("L'aire'du carré est de  " + aire + "Cm");

    }
}
