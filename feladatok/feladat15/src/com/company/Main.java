package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Írjunk programot, mely bekér egy számot, és eldönti, hogy osztható-e 3-mal, 4-gyel
        vagy 9-cel.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Írjon be egy számot. ");
        int szam = sc.nextInt();
        if(szam%3==0 || szam%4==0 || szam%9==0) {
            System.out.println("Osztható");
        }
        else {
            System.out.println("Nem osztható.");
        }

    }
}
