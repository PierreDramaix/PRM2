import java.util.Scanner;

//Que font les programmes suivants (les lignes d’entête sont éventuellement omises) ?
public class ex001 {
    public static void exerciceA(){
        int a = 1;
        while (a < 5) {
            a *= 2;
        }
        System.out.println(a); // 8 + saut de ligne
    }

    public static void exerciceB(){
        int a = 1;
        while (a < 5) {
            a *= 2;
            System.out.print(a + " "); // 2 4 8
        }
    }

    public static void exerciceC(){
        int a = 10;
        while (a < 5) {
            a *= 2;
            System.out.print(a + " "); //rien
        }
    }

    public static void exerciceD(){
        int a = 10;
        while (a > 5) {
            a *= 2;
            System.out.print(a + " "); // infinite loop until limit of int range
        }
    }

    public static void exerciceE(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un entier (positif): ");
        int a = scan.nextInt(), k = 0;
        while (a > 1) {
            ++k;
            if (a % 2 == 0)
                a /= 2;
            else
                a = 3 * a + 1;
            System.out.println(a);
        }
        System.out.println("Bouclé " + k + " fois");
        //Comment être sûr que ce programme se terminera toujours?
        // l'operation apres else transforme a en even
        // au bout d'un moment on arrivera a  2/2 = 1

    }

    public static void exerciceF(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un entier (positif): ");
        int a = scan.nextInt(), k = 0;
        while (a % 2 == 1) {
            ++k;
            a = (3 * a + 1) / 2;
            System.out.println(a);
        }
        System.out.println("Bouclé " + k + " fois");
        //Comment être sûr que ce programme se terminera toujours?
        // (3 * a + 1) / 2 transforme les nombre en chiffre pair
    }
}
