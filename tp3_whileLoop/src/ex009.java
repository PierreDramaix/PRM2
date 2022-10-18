//Considérons que l'utilisateur entre une suite de nombres strictement positifs terminée par la valeur
//        sentinelle -1. On suppose, que la suite comporte au moins deux nombres (avant la sentinelle). Il
//        est inutile de le vérifier. Ecrire un programme qui détermine si, oui ou non, la suite est strictement
//        croissante. Faut-il forcément attendre la sentinelle ou peut-on parfois répondre avant ?

import java.util.Scanner;

public class ex009 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sentinel = -1;
        int countA = 0;
        int countB = 0;
//        int first = 0;
//        int second = 0;
//        int count = 0;


        while (a != sentinel || b != sentinel){
                    a = scan.nextInt();
                    if(a < b){
                        System.out.println("La suite n'est pas strictement croissante");
                        break;
                    }
                    b = scan.nextInt();
                    if(b < a){
                        System.out.println("La suite n'est pas strictement croissante");
                        break;
                    }
        }
        System.out.println("La sute est strictement croissante");

//        while(a != sentinel){
//            a = scan.nextInt();
//            if(count == 0){
//                first = a;
//            } else if (count == 1) {
//                second = a;
//            }
//            count++;
//        }

//        if (first < second){
//            System.out.println("La suite est strictement croissante");
//        } else if (first > second) {
//            System.out.println("La suite n'est pas strictement croissante");
//        }
    }
}

