package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Írj programot, mely beolvassa a téglatest három élének hosszát, és kiírja a
        felszínének és térfogatának mérőszámát!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg az a-t.");
        int a = sc.nextInt();
        System.out.println("Adja meg az b-t.");
        int b = sc.nextInt();
        System.out.println("Adja meg az c-t.");
        int c = sc.nextInt();
        System.out.println("A téglatest térfogata: "+a*b*c);
        System.out.println("A téglatest felszíne:" +2*(a*b+a*c+b*c));
    }
}
