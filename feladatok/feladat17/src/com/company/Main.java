package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Írjunk programot, mely a testsúly és a testmagasság alapján meghatározza a
        testtömegindexet, és kiírja, hogy milyen testsúly osztályba tartozik az adott illető. a
        testtömeg osztályokat meghatározhatjuk tetszőlegesen, de alapul vehetünk létező
        osztályozásokat is.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a testsúlyod. ");
        double testsuly = sc.nextDouble();
        System.out.println("Add meg a magasságod négyzetméterben( 176 centinél pl.: 1,76) ");
        double magassag = sc.nextDouble();
        double BMI;
        BMI = testsuly / (magassag * magassag);
        if (BMI < 18.5) {
            System.out.println("Sovány vagy.");
        }
        else if(BMI<25 || BMI>18.5) {
            System.out.println("Normál testsúlyod van.");
        }
        else if(BMI>25 || BMI<30) {
            System.out.println("Túlsúly");
        }
        else if(BMI<30) {
            System.out.println("Elhízás");
        }
    }
}
