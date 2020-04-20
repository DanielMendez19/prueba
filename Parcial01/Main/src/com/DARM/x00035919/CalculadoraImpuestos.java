package com.DARM.x00035919;

    public class CalculadoraImpuestos extends ServicioProfesional {
      private double totalRenta;
      private double totalISSS;
      private double totalAFP;




        @Override
        public double getSalario() {
            double renta=0.1*salario;
            double total=salario-renta;
            return total;
        }

        public double getTotalRenta() {
            double renta=0.1*salario;
            double AFP = 0.0625*salario;
            double ISSS=0.03*salario;
            double Restante= salario-AFP-ISSS;
            double Total=Restante-renta;
            return Total;
        }
    }

    /*
    @Override
        public double getSalario() {

            return salario;
        }

     */