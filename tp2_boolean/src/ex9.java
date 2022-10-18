//Ecrire un programme qui calcule le maximum de trois nombres

import java.util.Scanner;

public class ex9 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if (a > b && a > c) {
            System.out.println(a + " est le plus grand chiffre");
        } else if ( b > a && b > c){
            System.out.println(b + " est le plus grand chiffre");
        } else {
            System.out.println(c + " est le plus grand chiffre");
        }

    }
}
