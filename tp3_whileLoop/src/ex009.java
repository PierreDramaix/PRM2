//Considérons que l'utilisateur entre une suite de nombres strictement positifs terminée par la valeur
//        sentinelle -1. On suppose, que la suite comporte au moins deux nombres (avant la sentinelle). Il
//        est inutile de le vérifier. Ecrire un programme qui détermine si, oui ou non, la suite est strictement
//        croissante. Faut-il forcément attendre la sentinelle ou peut-on parfois répondre avant ?

import java.util.Scanner;

public class ex009 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sentinel = -1;
        boolean croissant = true;
        int countO = 0;

        while(a != sentinel){
            a = scan.nextInt();
            if(a > b || a == 0 && countO < 1){
                b = a;
                countO++;
            } else if(a != sentinel) {
                croissant = false;
            }
        }

        if(croissant) {
            System.out.println("la suite est strictement croissante");
        } else {
            System.out.println("la suite n'est pas strictement croissante");
        }
    }
}

