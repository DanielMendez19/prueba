package com.DARM.x00035919;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> p =new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        p.add(new ServicioProfesional("Daniel","Servicio Profesional",5000,5));
        p.add(new ServicioProfesional("Daniel","Plaza Fija",5000,4));

        ServicioProfesional unServicioProfesional = new ServicioProfesional();
        CalculadoraImpuestos unCalculadoraImpuestos = new CalculadoraImpuestos();
        PlazaFija unPlazaFija = new PlazaFija();


        System.out.println("Nombre: "+unServicioProfesional.nombre);
        System.out.println("Puesto: "+unServicioProfesional.puesto);
        System.out.println("Salario de :"+ unServicioProfesional.getSalario());
        System.out.println("Salario final :"+unCalculadoraImpuestos.getSalario());

        System.out.println("");

        System.out.println("Nombre: "+unServicioProfesional.nombre);
        System.out.println("Puesto: "+unPlazaFija.puesto);
        System.out.println("Salario de :"+ unPlazaFija.getSalario());
        System.out.println("Salario final :"+unCalculadoraImpuestos.getTotalRenta());






    }
}

