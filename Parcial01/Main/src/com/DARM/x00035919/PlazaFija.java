package com.DARM.x00035919;

public class PlazaFija extends Empleado {
    private int extension;

    public PlazaFija(String nombre,String puesto,double salario,int extension){
        super(nombre,puesto,salario);
        this.extension=extension;

    }
    public PlazaFija() {
        super("Daniel","Plaza Fija",5000);
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
