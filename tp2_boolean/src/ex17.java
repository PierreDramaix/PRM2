//Afficher le signe du produit de deux entiers sans faire la multiplication (en faisant uniquement
//des comparaisons). Par exemple le produit de 5 et de -7 donne un résultat négatif

import java.util.Scanner;

public class ex17 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if( a < 0 || b < 0) {
            System.out.println("produit negatif");
        } else {
            System.out.println("produit positif");
        }
    }
}
