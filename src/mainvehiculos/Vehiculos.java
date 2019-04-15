/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainvehiculos;

import java.util.stream.Stream;

/**
 *
 * @author Jarringui
 */
//Clase Vehiculo
public class Vehiculos implements Comparable <Vehiculos> {
    
    private String nombre;
    private String modelo;
    private int cilindrada;
    private int puertas;
    private float precio;
    
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public String getModelo(){
    return modelo;    
    }
    public void setModelo(String modelo){
    this.modelo=modelo;
    }
    
    public int getCilindrada(){
    return cilindrada;
    }
    public void setCilindrada(int cilindrada){
    this.cilindrada=cilindrada;
    }
    
    public int getPuertas(){
    return puertas;
    }
    public void setPuertas(int puertas){
    this.puertas=puertas;
    }
    
    public float getPrecio(){
    return precio;
    }
    public void setPrecio(float precio){
    this.precio=precio;
    }
    
    
    @Override
    public String toString() {
        return " \n Nombre: "+nombre+ " Modelo: "+ modelo+ " Precio: " + precio+" Puertas:" + puertas+" Cilindradas: "+cilindrada;
    } 

    @Override
    public int compareTo(Vehiculos o) {
        int resultado=0;
        int resultado1=0;
        if (this.precio<o.precio) { resultado1 = 1;}
            else if (this.precio>o.precio) { resultado1 = -1;}
                         else {
                             resultado1 = 0;
            }
          
          resultado = resultado+resultado1;  
          return resultado ;
      }

   
   
    }

  
   


    
    
    
    
