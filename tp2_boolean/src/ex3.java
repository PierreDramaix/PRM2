//Ecrire un programme qui calcule la valeur absolue d'un nombre. Pour rappel, la valeur absolue
//d’un nombre est ce nombre lui-même s’il est positif ou nul et son opposé (le même nombre changé
//de signe), s’il est négatif

import java.util.Scanner;

public class ex3 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        if(a > 0) {
            System.out.println(a);
        } else {
            System.out.println(-a);
        }

    }
}
