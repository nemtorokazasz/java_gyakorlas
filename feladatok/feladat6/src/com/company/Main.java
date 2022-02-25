package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Írj programot, mely beolvas három egész számot, és kiírja a képernyőre a kisebbet //
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot. ");
        int szam1 = sc.nextInt();
        System.out.println("Adj meg egy másik számot. ");
        int szam2 = sc.nextInt();
        System.out.println("Adj meg egy harmadik számot. ");
        int szam3 = sc.nextInt();
        //ha a szám1 a legkisebb, kiírja.
        if (szam1 < szam2 && szam1 < szam3) {
            System.out.println("A három közül a legkisebb: " + szam1);
        }
        //ha a szám2 a legkisebb, kiírja
        else if (szam2 < szam1 && szam2 < szam3) {
            System.out.println("A három közül a legkisebb: " + szam2);
        }
        //ha a szám3 a legkisebb, kiírja
        else if (szam3 < szam1 && szam3 < szam2) {
            System.out.println("A három közül a legkisebb: " + szam3);
        }
    }
}
