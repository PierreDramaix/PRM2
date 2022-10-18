//Ecrire un programme qui affiche un message donnant l'ordre relatif de deux nombres sous la forme
//
//“Le premier est plus grand que le deuxième”
//“Les deux nombres sont égaux”
//“Le premier est plus petit que le deuxième”

import java.util.Scanner;

public class ex5 {
    public static void exercice() {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if (a > b) {
            System.out.println("Le premier est plus grand que le deuxième");
        } else if (b > a) {
            System.out.println("Le premier est plus petit que le deuxième");
        } else {
            System.out.println("Les deux nombres sont égaux");
        }


    }
}
