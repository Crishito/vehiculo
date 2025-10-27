package com.christian.vehiculo;

/*
 * Autor: Christian Zumárraga
 * Fecha: 26/10/2025
 * Descripción: Esta interfaz denominada Vela modela una superfice utilizada para
 * propulsar una embarcación mediante la acción del viento sobre ella.
 * La interfaz será implementada por la clase Acuatico
 */
public interface Vela {

    /*
     * Método abstracto que recomienda una determinada velocidad del vehículo
     * de acuerdo a la velocidad del viento
     * @param velocidadViento Parámetro que define la velocidad del
     * viento que influenciará en la velocidad actual del vehículo
     *
     */
    void recomedarVelocidad(int velocidadViento);
}
