//Écrire un programme qui reçoit 3 nombres en entrée et qui, si deux d'entre eux ont la même valeur,
//affiche cette valeur (le programme n'affiche rien dans le cas contraire)

import java.util.Scanner;

public class ex12 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if (a == b){
            System.out.println(a + " " + b);
        } else if (a == c){
            System.out.println(a + " " + c);
        } else if (b == c){
            System.out.println(b + " " + c);
        }

    }
}
