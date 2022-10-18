//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class ex8 {
    public ex8() {
    }

    public static void exercice() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int d;
        d = c;
        c = a;
        a = d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
