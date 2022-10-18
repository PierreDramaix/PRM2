//Ecrire un programme qui affiche l'instant immédiatement ultérieur à l'instant présent. Le pro-
//gramme reçoit en entrée l'heure actuelle sous forme heure et minute et affiche l'heure correspon-
//dant à la minute suivante (pensez que une minute après 10h59 il est 11h !). Tout se passe la même
//journée (supposez sans le vérifier que l’heure actuelle n’est pas 23h59 !).

import java.util.Scanner;

public class ex13 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("The time is ... hour ...");
        int h = scan.nextInt();
        System.out.println(" and ... minutes");
        int m = scan.nextInt();

        int totalMinut = (h*60) + m + 1;
        int newH = totalMinut / 60;
        int newM = totalMinut % 60;

        System.out.println("The new time is " + newH + " hour and " + newM + " minutes");

    }
}
