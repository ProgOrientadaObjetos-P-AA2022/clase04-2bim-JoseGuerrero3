/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private int numeroGalonesMaximo;
    private int costoGalones;
    private double iva;
   

    public AutomovilGasolina(int numGalonesMaximo, double costoGalon) {

    }

    public AutomovilGasolina(int num, double galon,
            String a, String b, double c) {
        
        

        int numGalonesMaximo = num;
        double costoGalon = galon;
        
        

    }

    public void setNumeroGalonesMaximo(int numeroGalonesMaximo) {
        this.numeroGalonesMaximo = numeroGalonesMaximo;
    }

    public void setCostoGalones(int costoGalones) {
        this.costoGalones = costoGalones;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}

    

    

  