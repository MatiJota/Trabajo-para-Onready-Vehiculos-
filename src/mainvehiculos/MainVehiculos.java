/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainvehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Jarringui
 */
//Clase Principal
public class MainVehiculos {
    

    
    public static void main(String[] args) {
       
        Vehiculos auto1= new Vehiculos();
        Vehiculos auto2= new Vehiculos();
        Vehiculos moto1= new Vehiculos();
        Vehiculos moto2= new Vehiculos();
        
        auto1.setNombre("Peugeot");
        auto1.setModelo("208");
        auto1.setPrecio(250000.00f);
        auto1.setPuertas(5);
        
        auto2.setNombre("Peugeot");
        auto2.setModelo("206");
        auto2.setPrecio(200000.00f);
        auto2.setPuertas(4);
        
        moto1.setNombre("Yamaha");
        moto1.setModelo("YBR");
        moto1.setPrecio(80500.50f);
        moto1.setCilindrada(160);
        
        moto2.setNombre("Honda");
        moto2.setModelo("Titan");
        moto2.setPrecio(60000.00f);
        moto2.setCilindrada(125);
        
        
        
    List<Vehiculos> vehiculos = new ArrayList<Vehiculos>();
      vehiculos.add(auto1);
      vehiculos.add(auto2);
      vehiculos.add(moto1);
      vehiculos.add(moto2);
      
    //Mostramos los vehiculos ordenados de Mayor a Menor.  
    Collections.sort(vehiculos);
      System.out.println("De mayor a menor \n"+vehiculos);
      
    //Si el String contiene "Y", se ejecuta en consola. 
    String moto = "Yamaha YBR $80.500,50";

        if (moto.contains("Y"))
        {
            System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+moto);
        }
    
    //(Opcional)Mostrar cual es el mayor y cual es el menor ingresando los datos de los vehiculos.
    Scanner sc = new Scanner(System.in);
         
        String[] autos = new String[4];
        float[] precios = new float[4];

        String autoMayor;
        String autoMenor;
        double mayorPrecio;
        double menorPrecio;
        
        int i = 0;

        System.out.println("Lectura de nombres y precio de autos: ");
        System.out.print("Autos y modelo " + (i + 1) + ": ");
        autos[i] = sc.nextLine();
        System.out.print("Precio: ");
        precios[i] = sc.nextFloat();

        mayorPrecio = precios[i]; 
        menorPrecio=precios[i];
        autoMayor = autos[i];
        autoMenor=autos[i];
        
        for (i = 1; i<autos.length; i++) { 
            sc.nextLine(); 
            System.out.print("Auto y modelo " + (i + 1) + " : ");
            autos[i] = sc.nextLine();
            System.out.print("Precio: ");
            precios[i] = sc.nextFloat();
            
            if (precios[i] > mayorPrecio) {
                mayorPrecio = precios[i];
                autoMayor = autos[i];
            }
            else if (precios[i]< menorPrecio) {
                menorPrecio = precios[i];
                autoMenor = autos[i];
            }
        }
        
        System.out.println("Auto con mayor precio: " + autoMayor );
        System.out.println("Precio: " + mayorPrecio);
        System.out.println("Auto con menor precio: "+autoMenor);
        System.out.println("Precio: "+menorPrecio);
        
     
      
        
       
    }
}
    
        
        
        
    
    

