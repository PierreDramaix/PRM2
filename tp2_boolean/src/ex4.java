//Ecrire un programme qui reçoit 2 nombres, qui soustrait le plus petit au plus grand et qui affiche
//le résultat.

import java.util.Scanner;

public class ex4 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if (a > b) {
            System.out.println(a - b);
        } else {
            System.out.println(b - a);
        }
    }
}
