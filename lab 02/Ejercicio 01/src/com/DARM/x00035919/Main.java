package com.DARM.x00035919;
import java.util.Scanner;

public class Main{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int n,f1,f2,i;
            do{
                System.out.print("Introduce un numero 'n' mayor que 1: ");
                n = scan.nextInt();scan.nextLine();
            }while(n<=1);
            System.out.println("Los " + n + " primeros términos de la serie de Fibonacci son:");

            f1=1;
            f2=1;

            System.out.print(f1 + " ");
            for(i=2;i<=n;i++){
                System.out.print(f2 + " ");
                f2 = f1 + f2;
                f1 = f2 - f1;
            }
            System.out.println();
        }
    }