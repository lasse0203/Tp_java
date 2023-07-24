package demo2;
import java.util.Scanner;
public class exo2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("saisir un nombre : ");
                int nbr  = Integer.parseInt(scanner.nextLine());

        if (nbr % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
            }
        }

