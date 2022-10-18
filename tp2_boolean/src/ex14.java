//Expliquer ce que font les programmes ci-dessous en ajoutant, pour chaque instruction d'affichage,
//un commentaire donnant la condition à satisfaire pour que l'instruction d'affichage soit exécutée.
//Remarquez comme l’absence d’indentation peut rendre la lecture difficile

import java.util.Scanner;

public class ex14 {
    public static void exerciceA(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0)
            if (a > 1)
                if (a > 2)
                    System.out.println(3); // a must be at least 3, any int > 3 will display 3
                else
                    System.out.println(2); // a must be 2
            else
                System.out.println(1);     // a must be 1
        else
            System.out.println("Erreur"); // a must be equal to 0
    }
    public static void exerciceB(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a > 2)
            System.out.println(3); // a must be at least 3, any int > 3 will display 3
        else if(a > 1)
            System.out.println(2); // a must be 2
        else if(a > 0)
            System.out.println(1); // a must be equal to 0
        else
            System.out.println("Erreur");
    }
    public static void exerciceC(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a != 0) {
            if(a > 0)
                System.out.println("C'est bien"); // if a is not zero and not negatif
        }
        else
            System.out.println("C'est \"nul\""); //if a is not not zero (any other than zero)

    }
    public static void exerciceD(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a != 0)
            if(a > 0)
                System.out.println("C'est bien"); // if a is not zero and positif
            else
                System.out.println("C'est \"nul\""); // is a is not zero
    }
}
