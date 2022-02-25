package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Írj programot, mely beolvassa egy derékszögű háromszög két befogóját, és megadja
        az átfogójának a hosszát! Az átfogót 2 tizedesjeggyel add meg!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a derékszögű h. egyik befogóját(a)!");
        double a = sc.nextDouble();
        System.out.println("Adja meg a derékszögű h. másik befogóját(b)!");
        double b = sc.nextDouble();
        double c;
        c = Math.sqrt((b*b)+(a*a));
        System.out.printf("A derékszögű háromszög átfogója: %.2f", c);
    }
}
