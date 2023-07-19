package demo2;

import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
                System.out.print("saisir un age : ");
    int age  = Integer.parseInt(scanner.nextLine());
                System.out.print("saisir le salaire souhaité : ");
    int salaire = Integer.parseInt(scanner.nextLine());
                System.out.print("saisir le nombre d'années d'expérience : ");
    int annee = Integer.parseInt(scanner.nextLine());

        if( age < 30 )
            System.out.println("vous étes trop jeune") ;
        else if (salaire > 40000 )
            System.out.println("salaire dépasse le max");
        else if  ( annee >= 5)
            System.out.println("vous manquez d'expérience") ;


    }
}

