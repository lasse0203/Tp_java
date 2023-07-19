package demo;
import java.util.Scanner;
public class exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir a : ");
        int a  = Integer.parseInt(scanner.nextLine());
        System.out.print("saisir b : ");
        int b  = Integer.parseInt(scanner.nextLine());
        System.out.print("a = "+b+" et b = "+a);
    }
}