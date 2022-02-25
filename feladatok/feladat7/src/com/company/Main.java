package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    /*Írj programot, ami beolvassa a háromszög oldalainak hosszát, és megmondja, hogy
        ilyen oldalakkal szerkeszthető-e háromszög!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a hárömszög a oldalát. ");
        int a = sc.nextInt();
        System.out.println("Add meg a hárömszög b oldalát. ");
        int b = sc.nextInt();
        System.out.println("Add meg a hárömszög c oldalát. ");
        int c = sc.nextInt();
        //Csak akkor szerkeszthető háromszög ha bármely két oldal hossza nagyobb a harmadiknál.
        if(a+b>c && a+c>b && b+c>a) {
            System.out.println("Szerkeszthető háromszög!");
        }
        else {
            System.out.println("NEM szerkeszthető háromszög.");
        }
    }
}
