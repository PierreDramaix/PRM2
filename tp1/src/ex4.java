//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class ex4 {
    public ex4() {
    }

    public static void exercice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 valeurs entières");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;
        c = a;
        a = b;
        b = c;

        System.out.print("Les voici inversées: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
    }
}
