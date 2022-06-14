/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DatosJugador;

import com.mycompany.Vehiculos.Tanque;
import com.mycompany.Vehiculos.Vehiculos;


/**
 *
 * @author Ivan Rivera
 */
public class Enemigo extends Personaje{
    Vehiculos nuevoVehiculo;
    Vehiculos[] vehiculos;
    
    public Enemigo(){
        vehiculos = new Vehiculos[1];//Cada enemigo tendra un vehiculo 
        nuevoVehiculo = new Tanque();//Definiendo el tipo de vehiculo
        vehiculos[1] = nuevoVehiculo;
        setVehiculo(vehiculos);
            
        
    }
    
    
    
}
