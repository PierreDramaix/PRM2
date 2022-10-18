//Ecrire un programme qui détermine la plus grande valeur de n telle que la somme des n premiers
//entiers positifs soit inférieure à un nombre max (entier positif) entré par l'utilisateur. Par exemple
//si l'utilisateur entre la valeur 20, la réponse est 5 car 1 + 2 + 3 + 4 + 5 = 15 alors que 1 + 2 + 3 +
//4 + 5 + 6 = 21

import java.util.Scanner;

public class ex004 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 0;
        int c = 0;

        while(c < a){
            b++;
            c += b;
        }
        System.out.println("the solution is " + (b - 1));
    }
}
