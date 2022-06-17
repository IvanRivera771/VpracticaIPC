package com.mycompany.Vehiculos;

import com.mycompany.Armas.Armas;
import com.mycompany.Armas.arma1;
import com.mycompany.Armas.arma2;
import com.mycompany.Armas.arma3;

/**
 *
 * @author Ivan Rivera
 */
public class Vehiculos {

    private String nombre;
    private int puntosVida;
    private int puntosPoder;
    private int nivel;
    private int experiencia;
    private Armas[] armas;
    private int ataque;
    private int defensa;
    private int punteria;
    private int precioVehiculo;

    public Vehiculos() {

        armas = new Armas[1];
        //puntosVida = 50;
        setPuntosVida(50);
        setPuntosPoder(5);
        setNivel(1);
        setExperiencia(0);

    }

    public void agregarArmaInicial() {
        Armas nuevaArma = new Armas();
        int numero = (int) Math.random() * 3;
        if (numero == 0) {
            nuevaArma = new arma1();
        } else if (numero == 1) {
            nuevaArma = new arma2();
        } else if (numero == 2) {
            nuevaArma = new arma3();
        }
        armas[0] = nuevaArma;
    }

    public int getPrecioVehiculo() {
        return precioVehiculo;
    }

    public void setPrecioVehiculo(int precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }

    public void crearVehiculo() {

    }

    public Armas[] getArmas() {
        return armas;
    }

    public void setArmas(Armas[] armas) {
        this.armas = armas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getPuntosPoder() {
        return puntosPoder;
    }

    public void setPuntosPoder(int puntosPoder) {
        this.puntosPoder = puntosPoder;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    
    //Metoddo para comprar arma 
    public void agregarArmaComprada(Armas armaComprada) {

        Armas[] nuevaListaArma = new Armas[getArmas().length + 1];

        for (int i = 0; i < nuevaListaArma.length; i++) {
            if (i == nuevaListaArma.length - 1) {
                nuevaListaArma[i] = armaComprada;

            } else {

                nuevaListaArma[i] = getArmas()[i];

            }

            setArmas(nuevaListaArma);

        }

    }//Fin agregar arma comprada

}
