//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class ex9 {
    public ex9() {
    }

    public static void exercice() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.println(d);

        int e;

        e = d;
        d = a;
        a = e;
        e = c;
        c = b;
        b = e;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.println(d);

    }
}
