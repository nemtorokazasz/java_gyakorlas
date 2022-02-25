package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Írj programot, beolvassa a felhasználó nevét, majd köszön neki!
        //Scannerrel bekérjük a nevét.
	    Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a nevét! ");
        String nev = sc.nextLine();
        //Köszöntjük, majd Kiírjuk a felhasználó nevét.
        System.out.println("Köszöntelek, " +nev);
    }
}
