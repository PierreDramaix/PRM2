//On suppose que l'utilisateur entre une suite d’entiers positifs, terminée par la valeur sentinelle -1.
//        Votre programme doit comparer le premier et le dernier élément de la suite et afficher l'un des
//        messages suivants :
//         Le premier est inférieur au dernier
//         Le premier est égal au dernier
//         Le premier est supérieur au dernier
//         La suite est vide
//        La suite est vide si le premier nombre entré est -1. Si la suite ne compte qu’un élément, on
//        considère que le premier est égal au dernier.

import java.util.Scanner;

public class ex008 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int sentinel = -1;
        int first = 0;
        int last = 0;
        int count = 0;

        while(a != sentinel){
                a = scan.nextInt();
                if(count == 0){
                    first = a;
                }
                if (a != -1) {
                    last = a;
                }
                count++;
        }


        if(count == 1){
            System.out.println("La suite est vide");
        }
//        else if (count == 2){
//            System.out.println("Le premier est égal au dernier");         // works too but added uncessary code
//        }
        else if (first < last) {
            System.out.println("Le premier est inférieur au dernier");
        } else if (first > last){
            System.out.println("Le premier est supérieur au dernier");
        } else {
            System.out.println("Le premier est égal au dernier");
        }
    }

    //make sure the last else if usefull
}
