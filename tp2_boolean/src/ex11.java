//Ecrire un programme qui reçoit 3 nombres en entrée et qui affiche les deux plus grands. Identifiez
//d'éventuels cas particuliers.

import java.util.Scanner;

public class ex11 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if (a > b && a > c){
            if(b > c){
                System.out.println(a + " " + b);
            } else{
                System.out.println(a + " " + c);
            }
        } else if (b > a && b >c){
            if (a > c){
                System.out.println(b + " " + a);
            } else {
                System.out.println(b + " " + c);
            }
        } else if (c > a && c > b){
            if(a > b){
                System.out.println(c + " " + a);
            } else {
                System.out.println(c + " " + b);
            }
        } else if (a == b || b == c || c == a){
            if (a == b && a > c) {
                System.out.println(a + " " + b);
            } else if (a == b && a < c) {
                System.out.println(c + " " + b);
            } else if (b == c && b > a){
                System.out.println(b + " " + c);
            } else if (b == c && b < a){
                System.out.println(a + " " + b);
            } else if (c == a  && c > b){
                System.out.println(c + " " + a);
            } else if (c == a && c < b){
                System.out.println(b + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
}
