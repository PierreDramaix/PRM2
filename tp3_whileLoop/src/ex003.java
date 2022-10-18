//Réécrivez le même programme que pour l’exercice précédent, mais cette fois vous devez assurer
//que l’utilisateur entre un nombre (strictement) positif pour n. Vous devez l’obliger à recommencer
//si ce nombre n’est pas positif.

import java.util.Scanner;

public class ex003 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        double c = 0;
        double d = 0;

        while(a < 1) {
            System.out.println("Wrong number ! put a positif integer please");
            a = scan.nextDouble();
        }

        double b = a;
        while (a > 0) {
            c += scan.nextDouble();
            --a;
        }

        d = c / b;
        System.out.println(d);


    }
}
