package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*Írj programot, mely beolvas két pozitív egész számot, és kiírja a számtani és mértani
        közepüket! A gyökvonáshoz használd a Math.Sqrt() függvényt!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot.");
        double  szam1 = sc.nextDouble();
        System.out.println("Adjon meg egy másik pozitív egész számot.");
        double szam2 = sc.nextDouble();
        if (szam1 >= 0 && szam2 >= 0) {
            System.out.printf("A két szám számtani közepe: %.2f \n" , (szam1 + szam2) / 2);
        } else {
            System.out.println("Nem pozitív számot adtál meg.");
        }
        if (szam1 >= 0 && szam2 >= 0) {
            System.out.printf("A két szám mértani közepe: %.2f ", Math.sqrt(szam1*szam2));
        }
    }
}
