package com.DARM.x00035919;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Introduce la cadena de texto ; ");
	String cadena=scan.nextLine();

	int contador=0;

        for(int x=0;x<cadena.length();x++) {
            if ((cadena.charAt(x)=='a') || (cadena.charAt(x)=='e') || (cadena.charAt(x)=='i') || (cadena.charAt(x)=='o') || (cadena.charAt(x)=='u')){
                contador++;
            }
        }
        System.out.println("La palabra: " + cadena);
        System.out.println("Contiene");
        System.out.println( contador + " vocales");

    }
}
