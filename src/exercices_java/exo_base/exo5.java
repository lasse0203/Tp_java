package demo2.Exo_java.exos;
import java.util.Scanner;
public class exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir un rayon : ");
        double r = scanner.nextDouble();
        System.out.print("saisir une hauteur : ");
        double h = scanner.nextDouble();
        // Calcul du volume du cône
        double volume = (float) 1/3 * Math.PI * Math.pow(r,2) * h;

        // Formater le volume avec deux chiffres après la virgule :

        String volumeF = String.format("%.2f", volume);

        System.out.println("Le volume du cône est : " + volumeF + " CM3 ");
    }
}
