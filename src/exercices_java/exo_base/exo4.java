package demo2.Exo_java.exos;
import java.util.Scanner;
public class exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int age = 18;
        System.out.print("saisir un age : ");
        int ageUser  = Integer.parseInt(scanner.nextLine());
        System.out.println(age < ageUser);
    }
}
