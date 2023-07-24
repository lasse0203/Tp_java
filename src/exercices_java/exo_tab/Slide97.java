package exercices_java.exo_tab;

public class Slide97 {
    public static void main(String[] args) {

        int[] tab1 = {23, 150, 12, 28, 59, 2};
        int[] tab2 = {23, 150, 12, 28, 59, 2};
        boolean egaux = true;

        if(tab1.length != tab2.length){
            System.out.println("les tableaux ne sont pas égaux");
        }else {
           for(int i =0; i<tab1.length;i++) {
              if(tab1[i] != tab2[i]){
                  egaux= false;
              }
           }
           if (egaux == true) {
               System.out.println("les tableaux sont égaux");
           }else {
               System.out.println("les tableaux ne sont pas égaux");
           }
        }
    }
}