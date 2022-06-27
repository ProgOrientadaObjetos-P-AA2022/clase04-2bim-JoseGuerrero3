/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
  protected  String nombre;
  protected String placa;
  protected double valorCancelar;

    public Automovil(String a, String b, double c) {
        nombre = a;
        placa = b;
        valorCancelar = c;
        
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerPlaca(String b) {
        placa = b;
    }

    public void establecerValorCancelar(double c) {
        valorCancelar = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
        
        
    }
    

  
  }
          
    


        
