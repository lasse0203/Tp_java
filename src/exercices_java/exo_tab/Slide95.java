package exercices_java.exo_tab;

import java.util.Arrays;

public class Slide95 {
    public static void main(String[] args) {
        int[] tableauSource = {-5, 3, 24, -12, -10, 5, 100, -2, -71, 0};
        int[] tableauDestination = new int[10];

        int j = 0;
        for (int i = 0; i < tableauSource.length; i++) {
            if (tableauSource[i] > 0) {
                tableauDestination[j] = tableauSource[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(tableauDestination));

        }

    }

