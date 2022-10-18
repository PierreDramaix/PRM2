//Écrire le morceau de code qui si, a est supérieur à 0, teste si a vaut 1, auquel cas il affiche « a vaut
//1 » et qui, si a n'est pas supérieur à 0, affiche « a est inférieur ou égal à 0 »

import java.util.Scanner;

public class ex15 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a > 0) {
            if(a == 1) {
                System.out.println("a vaut 1");
            }
        } else {
            System.out.println("a est inférieur ou égal à 0");
        }
    }
}
