//Que font les programmes suivants ? Expliquez avec quelques cas limites pour les valeurs saisies.
//Pouvez-vous les simplifier (écrire un programme plus simple qui fait la même chose)

import java.util.Scanner;

public class ex2 {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        if (a > 0) {
//            if (a > 1) {
//                System.out.println("Beaucoup");
//            } else {
//                System.out.println("Un");
//            }
//        } else if (a > 1) {
//            System.out.print("Zut");
//        } else {
//            System.out.println("Peu");
//        }
//    }

    //SOLUTION : if a = 0: sout: "Peu" [a la ligne]
    //SOLUTION : if a = 1: sout: "Un" [a la ligne]
    //SOLUTION : if a = 2: sout: "Beaucoup" [a la ligne]

    public static void exerciceA(){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println("Peu");
        } else if (a == 1) {
            System.out.println("Un");
        } else {
            System.out.println("Beaucoup");
        }
  }


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        if (a > 0)
//            if (b > 1)
//                System.out.println("Bonjour");
//            else
//                System.out.println("Salut");
//        else
//        if (b > 1)
//            System.out.println("Coucou");
//        else
//            System.out.println("Salut");
//    }

    //SOLUTION: a = 0, b = 0 : "Salut" [a la ligne]
    //SOLUTION: a = 0, b = 2 : "Coucou" [a la ligne]
    //SOLUTION: a = 2, b = 0 : "Salut" [a la ligne]
    //SOLUTION: a = 2, b = 2 : "Bonjour" [a la ligne]


    public static void exerciceB(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if((a == 0 || a > 1) && b == 0 ){
            System.out.println("Salut");
        } else if (a > 0 && b > 1){
            System.out.println("Bonjour");
        } else {
            System.out.println("Coucou");
        }
    }
}
