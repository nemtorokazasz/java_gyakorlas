package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Írj programot, ami beolvas egy számot, majd kiírja a kétszeresét!
        //Scannerrel bekérünk egy számot.
	    Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot! ");
        int szam = sc.nextInt();
        //Megszorozzuk a megadott számot 2-vel.
        System.out.println(szam * 2);
    }
}
