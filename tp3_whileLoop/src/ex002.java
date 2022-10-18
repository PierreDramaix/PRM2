//Ecrire un programme qui calcule la moyenne d’une série de n nombres entrés par l’utilisateur. La
//valeur de n est fournie en préambule par l’utilisateur. Par exemple si l’utilisateur veut calculer la
//moyenne de 8 nombres, il entre d’abord 8 et ensuite, les 8 nombres :
//8
//5 9 -1 0 12 -7 -4 3
//l’ordinateur affiche : 2.125

import java.util.Scanner;

public class ex002 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = a;
        double c = 0;
        double d = 0;

        while (a > 0) {
            c += scan.nextDouble();
            --a;
        }

        d = c / b;
        System.out.println(d);

    }
}
