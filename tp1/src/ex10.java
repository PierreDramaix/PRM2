//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class ex10 {


    public static void exercice() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int e;
        int f;

        e = b;
        b = a;
        f = c;
        c = e;
        e = d;
        d = f;
        a = e;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
