import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Scanner;

public class ex12 {
    public static void exercice(){

        Scanner s = new Scanner(System.in);

        int H1, M1, T1, H2, M2, T2;
        int eventDuration;

        System.out.println("Event start at [...] hour");
         H1 = s.nextInt();
        System.out.println(" and [...] minutes");
         M1 = s.nextInt();
        System.out.println("Event finish at  [...] hour" );
         H2 = s.nextInt();
        System.out.println(" and [...] minutes");
         M2 = s.nextInt();

         T1 = (60*H1) + M1;
         T2 = (60*H2) + M2;

         eventDuration = T2 - T1;

         int H3 = eventDuration /60;
         int M3 = eventDuration % 60;

        System.out.println("The event lasted " + H3 + " hours and " + M3 + " minutes");

    }
}
