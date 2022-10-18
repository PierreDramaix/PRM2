//(*) Ecrire un programme qui affiche si oui ou non une année entrée par l’utilisateur est bissextile.
//Pour rappel, sont bissextiles les années divisibles par 4 mais non divisibles par 100 ou les années
//divisibles par 400. Ainsi, 2000 et 2008 sont des années bissextiles mais 1900 ne l’est pas.

import java.util.Scanner;

public class ex16 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if(a % 4 == 0 && a % 100 !=0 || a % 400 == 0){
            System.out.println("année bisextile");
        } else{
            System.out.println("pas bisextile");
        }
    }
}
