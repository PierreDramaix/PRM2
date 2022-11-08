//Écrire un programme qui affiche tous les nombres entiers strictement positifs dont le carré est
//inférieur à un nombre entier n entré par l'utilisateur. Si l’utilisateur entre 20, l’ordinateur affiche
//1 2 3 4

import java.util.Scanner;

public class ex006 {
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
