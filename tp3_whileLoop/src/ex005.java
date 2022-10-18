//Ecrire un programme qui calcule la moyenne d'une série de nombres entiers positifs entrés par
//l'utilisateur. L'utilisateur ne sait pas à l'avance combien de nombres il compte entrer mais comme
//ces nombres sont tous positif, il est convenu que l'utilisateur indique son intention d'arrêter la
//saisie par le nombre -1. Ce dernier nombre ne fait pas partie de la série et ne doit pas être compté
//dans la moyenne. Il sert juste à indiquer la fin de la série. On l’appelle une sentinelle. Si par
//exemple l’utilisateur tape 15 9 12 4 15 -1 l’ordinateur calcule la moyenne des 5 premiers
//nombres et répond 11.

import java.util.Scanner;

public class ex005 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int sentinel = -1;
        int b = 0;
        int c = 0;

        while(a  != sentinel){
            b += a;
            c++;
            a = scan.nextInt();
        }

        c+= sentinel;

        System.out.println("Le resultat est " + (b/c));
    }
}
