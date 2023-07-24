package exercices_java.exo_tab;

public class Slide96 {
    public static void main(String[] args) {
        int max, position;
        int[] tab = {23, 150, 12, 28, 59, 2};
        max = 0;
        position = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
                position = i;
            }
        }

        System.out.println("Maximum : " + max);
        System.out.println("Position : " + position);
    }
}