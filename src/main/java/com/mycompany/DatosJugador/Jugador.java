/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DatosJugador;

import com.mycompany.Vehiculos.Vehiculos;
import com.sun.source.tree.ExpressionStatementTree;

/**
 *
 * @author Ivan Rivera
 */
public class Jugador extends Personaje {

    private String nickname;
    private int cantidadOro;
    private int cantidadVehiculos;

    public Jugador() {

        cantidadOro = 50;

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCantidadOro() {
        return cantidadOro;
    }

    public void setCantidadOro(int cantidadOro) {
        this.cantidadOro = cantidadOro;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }

    public void agregarVehiculoComprado(Vehiculos vehiculoComprado) {

        Vehiculos[] nuevaLista = new Vehiculos[getVehiculo().length + 1];

        for (int i = 0; i < nuevaLista.length; i++) {
            if (i == nuevaLista.length - 1) {
                nuevaLista[i] = vehiculoComprado;
            } else {
                nuevaLista[i] = getVehiculo()[i];
            }

        }
        setVehiculo(nuevaLista);
    }

    public void restarOro(int cantOroGastado) {

        cantidadOro -= cantOroGastado;

    }

}
