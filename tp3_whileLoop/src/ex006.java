//Écrire un programme qui affiche tous les nombres entiers strictement positifs dont le carré est
//inférieur à un nombre entier n entré par l'utilisateur. Si l’utilisateur entre 20, l’ordinateur affiche
//1 2 3 4

import java.util.Scanner;

public class ex006 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 1;

        while((b * b) < a){
            System.out.print(b + " ");
            b++;
        }
    }
}
