package com.DARM.x00035919;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        String cadena1 =scan.nextLine();

        System.out.println(cadena1.replace("a","b"));
    }
}
