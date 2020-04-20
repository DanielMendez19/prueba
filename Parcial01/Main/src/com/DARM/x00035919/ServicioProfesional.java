package com.DARM.x00035919;

public class ServicioProfesional extends Empleado  {

    private int mesesContrato;

    public ServicioProfesional(String nombre,String puesto,double salario,int mesesContrato){
        super(nombre,puesto,salario);
        this.mesesContrato=mesesContrato;

    }

    public ServicioProfesional() {
        super("Daniel","Servicio Profesional",5000);
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

}
