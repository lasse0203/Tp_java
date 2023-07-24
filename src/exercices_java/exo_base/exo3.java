import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la hauteur du cône : ");
        double hauteur = scanner.nextDouble();

        System.out.print("Entrez le rayon du cône : ");
        double rayon = scanner.nextDouble();

        // Calcul du volume du cône
        double volume = (Math.PI * Math.pow(rayon, 2) * hauteur) / 3;

        System.out.println("Le volume du cône est : " + volume);
    }
}
