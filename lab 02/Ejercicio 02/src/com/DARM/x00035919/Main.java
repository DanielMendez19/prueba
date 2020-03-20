package com.DARM.x00035919;
import java.util.Scanner;



public class Main {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Introduce una frase : ");
            String s=sc.nextLine();

            s=s.replace(" ", "");
            s=s.replace(",", "");
            s=s.replace(".", "");
            System.out.print(s);
            int fin = s.length()-1;
            int ini=0;
            boolean i=true;

            while(ini < fin){
                if(s.charAt(ini)!=s.charAt(fin)){
                    i=false;
                }
                ini++;
                fin--;
            }
            if(i)
                System.out.println("\ntrue");
            else
                System.out.print("\nfalse");

        }


}
