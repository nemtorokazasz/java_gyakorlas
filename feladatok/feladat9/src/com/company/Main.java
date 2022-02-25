package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    /*Írj programot, mely beolvassa a másodfokú egyenlet együtthatóit, és kiírja, hogy az
        egyenletnek van-e megoldása!*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg az a-t. ");
        int a = sc.nextInt();
        System.out.println("Adja meg az b-t. ");
        int b = sc.nextInt();
        System.out.println("Adja meg az c-t. ");
        int c = sc.nextInt();
        double x;
        x = (b*b)-4*a*c;
        if(x>=0) {
            System.out.println("Van megoldása.");
        }
        else {
            System.out.println("Nincs megoldása.");
        }
    }
}
