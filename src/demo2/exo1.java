package demo2;
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int age = 18;
                System.out.print("saisir un age : ");
                int ageUser  = Integer.parseInt(scanner.nextLine());
                if (age < ageUser ) {
                    System.out.println("vous étes majeur, vous pouvez rentrez dans le club");
                }
                else {
                    System.out.println("vous étes mineur, vous ne pouvez pas rentrez dans le club ");
                }

    }
}
