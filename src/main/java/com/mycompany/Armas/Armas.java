/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Armas;

import com.mycompany.Vehiculos.Vehiculos;

/**
 *
 * @author Ivan Rivera
 */
public class Armas {

    private int nivelDanio;
    private String nombreArma;
    private int punteria;
    private int velocidad;
    private int precioArma;
    private int municion;

    public int getPrecioArma() {
        return precioArma;
    }

    public void setPrecioArma(int precioArma) {
        this.precioArma = precioArma;
    }

    public Armas() {

    }

    public int getNivelDanio() {
        return nivelDanio;
    }

    public void setNivelDanio(int nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
