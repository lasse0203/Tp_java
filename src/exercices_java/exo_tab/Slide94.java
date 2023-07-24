package exercices_java.exo_tab;

public class Slide94 {
    public static void main(String[] args) {

        int[] tab = new int[100];
        int cpt = 0;

        for (int i = 0; i < 100; i++) {
            tab[i] = i;

            System.out.print(tab[i]);

            if (cpt == 9) {
                System.out.println();
                cpt = 0;
            } else {
                System.out.print(", ");
                cpt++;
            }
        }
    }
}