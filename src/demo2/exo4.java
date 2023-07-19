package demo2;
import java.util.Scanner;


public class exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir un caractére : ");
        char ch = scanner.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ||ch=='y'){
            System.out.println(("voyelle"));
        }else
            System.out.println(("Consonne"));

    }
}

