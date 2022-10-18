//Ecrire un programme qui vérifie qu’un nombre possède une valeur de 1 à 10

import java.util.Scanner;

public class ex6 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        if(a > 0 && a < 11){
            System.out.println(a + " a une valeur entre 1 et 10");
        } else {
            System.out.println(a + " n'a pas une valeur entre 1 et 10");
        }
    }
}
