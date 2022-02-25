package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Írj programot, mely beolvassa egy kör átmérőjét, és kiírja a kör kerületét és területét!
        A pi értékének meghatározásához használd a Math.PI értéket!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a kör átmérőjét! ");
        double d = sc.nextDouble();
        System.out.printf("A kör területe: %.2f\n", ((d*d)*Math.PI)/4);
        System.out.printf("A kör kerülete: %.2f ", d*Math.PI);
    }
}
