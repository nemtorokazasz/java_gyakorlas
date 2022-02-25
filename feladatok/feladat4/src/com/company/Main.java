package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Írj programot, ami beolvas két számot, majd kiírja:
        //a. az összegüket;
        //b. különbségüket;
        //c. szorzatukat;
        //d. hányadosukat, ha lehet!
        //Scannerrel bekérjük a számokat.
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot! ");
        int szam1 = sc.nextInt();
        System.out.println("Adjon meg egy másik számot! ");
        int szam2 = sc.nextInt();
        //Változókba mentjük az eredményeket.
        int osszeg = szam1 + szam2;
        int kulonbseg = szam1 - szam2;
        int szorzat = szam1 * szam2;
        int hanyados = szam1 / szam2;
        System.out.println(osszeg);
        System.out.println(kulonbseg);
        System.out.println(szorzat);
        System.out.println(hanyados);
    }
}
