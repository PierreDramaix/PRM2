//(*) Une entreprise de location de véhicule loue ses véhicules aux conditions suivantes :
//        • forfait journalier de 250 €.
//        • les 50 premiers kilomètres sont gratuits,
//        • les 450 km suivants sont à 1,25 € du km,
//        • les km suivants sont facturés à 1,25 € du km majoré de 10%.
//        Calculez et affichez le montant à payer pour une location de n jours et de x kilomètres parcourus,
//        n et x étant entrés par l’utilisateur.

import java.util.Scanner;

public class ex19 {
    public static void exercice(){
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        int km = scan.nextInt();
        double prixJ, prixKM, total;

        prixJ = j*250;

        if(km <= 50){
            prixKM = 0;
        } else if (km <= 500){
            km -= 50;
            prixKM = km * 1.25;
        } else {
            km -= 500;
            prixKM = 450 * 1.25 + ((km * 1.25)/10) * 11;
        }

        total = prixKM + prixJ;
        System.out.println("Le total de la course est " + total);
//        System.out.println(250 * j);
//        System.out.println( 450 * 1.25);
//        System.out.println(((500 * 1.25)/10) * 11);


    }
}
