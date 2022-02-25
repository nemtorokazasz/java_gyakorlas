package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Írjon egy programot, ami leosztályoz egy maximálisan 100 pontos dolgozatot az 50,
        65, 80, 90 ponthatárok szerint! A határérték a jobb jegyhez tartozik. Ha a pontszám
        negatív vagy száznál nagyobb, akkor a program írja ki, hogy hibás az adat!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Írja be a dolgozat pontszámát! ");
        int pontszam = sc.nextInt();
        if(pontszam>100 || pontszam<=0) {
            System.out.println("Hibás adat!");
        }
        if(pontszam<50) {
            System.out.println("Elégtelen.");
        }
        else if (pontszam>=50 && pontszam<65) {
            System.out.println("Elégséges.");
        }
        else if(pontszam>=65 && pontszam<80) {
            System.out.println("Közepes.");
        }
        else if(pontszam>=80 && pontszam<90) {
            System.out.println("Jó.");
        }
        else if(pontszam>=90 && pontszam<100) {
            System.out.println("Jeles.");
        }
    }
}
