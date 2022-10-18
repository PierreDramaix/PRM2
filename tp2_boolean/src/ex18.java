//(*) Afficher le signe de la somme de deux entiers sans faire l'addition (en faisant uniquement des
//comparaisons et des négations - changements de signe). Par exemple si on somme 5 et -7, la
//réponse est négative.

import java.util.Scanner;

public class ex18 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if((a < 0 && -a > b) || (b < 0 && -b > a))  {
            System.out.println("somme negatif");
        } else {
            System.out.println("somme positif");
        }

        System.out.println(a + b);

    }
}
