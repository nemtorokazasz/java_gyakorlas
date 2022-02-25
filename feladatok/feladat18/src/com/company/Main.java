package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Írjunk programot, amely bekéri két pont koordinátáit, majd kiszámolja azok
        távolságát. Két pont távolságát az alábbi képlet számítja ki:*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg az X egy pontját(x1). ");
        int x1 = sc.nextInt();
        System.out.println("Add meg az X egy másik pontját(x2). ");
        int x2 = sc.nextInt();
        System.out.println("Add meg az Y egy pontját(y1). ");
        int y1 = sc.nextInt();
        System.out.println("Add meg az Y egy másik pontját(y2). ");
        int y2 = sc.nextInt();
        double keplet;
        keplet = Math.sqrt((x1-x2)*(x1-x2)+(y2-y1)*(y2-y1));
        System.out.printf("A két pont távolsága: %.0f ", keplet);
    }
}
