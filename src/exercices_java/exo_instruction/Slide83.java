package demo2.Exo_java.suite_exo_java;
import java.util.Scanner;
public class Slide83 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                //saisir de nombre d'eleve
                System.out.print("Entrer le nombre d'éleves: ");
                int nombreEleves = scanner.nextInt();

                double max = 0;
                double min = 20;
                double somme = 0;

                //saisi des notes et calcule des notes min, max et somme
                for (int i = 1; i <= nombreEleves; i++) {
                    System.out.print("note " + i + " : ");
                    double note = scanner.nextDouble();
                    
                    while (note < 0 || note > 20) {
                        System.out.print("La note doit être comprise entre 0 et 20. Merci de saisir a nouveau la note : ");
                        note = scanner.nextDouble();
                    }

                    if (note > max) {
                        max = note;
                    }
                    if (note < min) {
                        min = note;
                    }
                    somme += note;
                }

                System.out.println("La note la plus haute est : " + max);
                System.out.println("La note la plus basse est : " + min);
                System.out.println("La moyenne est de : " + somme / nombreEleves);
            }
        }

