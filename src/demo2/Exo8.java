package demo2;

import java.util.Scanner;
public class Exo8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir une température : ");
        int temp = Integer.parseInt(scanner.nextLine());

        if ( temp < 0 ) {
            System.out.println( "solide");
        }
        else if (temp <= 100){
            System.out.println( "liquide");
        }
        else {
            System.out.println( "gazeux");
        }
    }
}
