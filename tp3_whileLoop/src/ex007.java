//On suppose que l'utilisateur entre une suite d’entiers positifs, terminée par la valeur sentinelle -1.
//Votre programme doit afficher le dernier nombre (hormis le -1) entré par l'utilisateur. Si
//l'utilisateur tape 5 3 4 1 6 3 -1, l'ordinateur affiche : "Le dernier est : 3". Que fait votre programme
//si l'utilisateur tape uniquement -1 ?

import java.util.Scanner;

public class ex007 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int sentinelle = -1;
        int b = 0;
        int c = 0;

        while(a != sentinelle){
            b++;
            c = a;
            a = scan.nextInt();
        }

        if(b == 1){
            System.out.println("Aucun nombre entier positif n'a été entré");
        } else {
            System.out.println("Le dernier est : " + c);
        }
    }
}
