//Ecrire un programme qui reçoit 3 nombres en entrée et qui les affiche dans l'ordre croissant

import java.util.Scanner;

public class ex10 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if (a < b && a < c){
            if(b < c){
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b < a && b < c){
            if(a < c){
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c < a && c < b){
            if (b < a){
                System.out.println(c + " " + b + " " + a);
            } else if (a < b){
                System.out.println(c + " " + a + " " + b);
            }
        } else if (a == b || b == c || c == a){
            if(a == b && a < c) {
                System.out.println(b + " " + a + " " + c);
            } else if (a == b && a > c){
                System.out.println(c + " " + a + " " + b);
            } else if (b == c && b < a){
                System.out.println(c + " " + b + " " + a);
            }else if (b == c && b > a){
                System.out.println(a + " " + b + " " + c);
            }else if (c == a && c < b){
                System.out.println(c + " " + a + " " + b);
            } else if (c == a && c > b){
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}
