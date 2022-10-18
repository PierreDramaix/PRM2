import java.util.Scanner;

public class ex11 {
   public static void exercice(){

       Scanner s = new Scanner(System.in);

       int a = s.nextInt();
       int b = s.nextInt();
       int c = s.nextInt();
       int d = s.nextInt();

       System.out.print(a);
       System.out.print(b);
       System.out.print(c);
       System.out.println(d);

       int e,f;

       e = c;
       c = d;
       f = b;
       b = e;
       e = a;
       a = f;
       d = e;

       System.out.print(a);
       System.out.print(b);
       System.out.print(c);
       System.out.print(d);


   }
}
