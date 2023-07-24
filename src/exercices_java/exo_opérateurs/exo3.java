package demo2;
import java.util.Scanner;
        public class exo3 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("saisir le nombre 1 : ");
                int nbr1  = Integer.parseInt(scanner.nextLine());
                System.out.print("saisir le nombre 2 : ");
                int nbr2 = Integer.parseInt(scanner.nextLine());
                System.out.print("saisir le nombre 3 : ");
                int nbr3 = Integer.parseInt(scanner.nextLine());

                if( nbr1 >= nbr2 && nbr1 >= nbr3)
                    System.out.println("Le plus grand nombre est: "+nbr1);
                else if (nbr2 >= nbr1 && nbr2 >= nbr3)
                    System.out.println("Le plus grand nombre est: "+nbr2);
                else
                    System.out.println("la valeur maximale est: "+nbr3);

    }
}
