package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Írj programot, ami beolvassa a másodfokú egyenlet együtthatóit, és kiírja az egyenlet
        megoldásait, ha vannak!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg az a-t.");
        int a = sc.nextInt();
        System.out.println("Adja meg az b-t.");
        int b = sc.nextInt();
        System.out.println("Adja meg az c-t.");
        int c = sc.nextInt();
        double x;
        x = Math.sqrt((b*b)-4*a*c);
        if (x>=0) {
            System.out.printf("A megoldás(ok): %.2f ", x);
        }
        else {
            System.out.println("Nincs megoldás.");
        }
    }
}
