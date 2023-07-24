package demo2;
import java.util.Scanner;
public class Exo7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Saisir une année: ");
        int annee = Integer.parseInt(scanner.nextLine());

                if ( ( ( annee % 4 == 0 ) && ( annee % 100 != 0 ) ) || ( annee % 400 == 0 ) ) {
                    System.out.println( "l'année " + annee + " est bissextile.");
                }
                else {
                    System.out.println( "l'année  " + annee + " est non bissextile.");
                }
            }

        }



