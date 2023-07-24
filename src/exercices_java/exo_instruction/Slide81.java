package demo2.Exo_java.suite_exo_java;

import java.time.LocalDate;

public class Slide81 {
    public static void main(String[] args) {

        int max = 120000;
        double habitant = 96809;
        int nombreDannees= 0;
        int anneeInitiale= 2015;

        LocalDate current_date = LocalDate.now();
        int year=current_date.getYear();

        while (habitant < max){
            habitant = habitant*1.0089;
            nombreDannees = nombreDannees+1;
            anneeInitiale++;
            if(anneeInitiale == year){
                System.out.println("nombre d'habitant dans l'année "+ year +" est " +Math.round(habitant));
            }

        }
        System.out.println("les nombres d'annees est "+ nombreDannees );
    }

}

