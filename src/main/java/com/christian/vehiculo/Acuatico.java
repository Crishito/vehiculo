package com.christian.vehiculo;

/*
 * Autor: Christian Zumárraga
 * Fecha: 26/10/2025
 * Descripción: Clase Acuatico que representa un vehículo acuático.
 * Hereda de Vehiculo e implementa las interfaces Motor y Vela.
 * Permite manejar velocidad, frenar, acelerar y calcular revoluciones del motor.
 */
public class Acuatico extends Vehiculo implements Motor, Vela {

    /*
     * Constructor de la clase Acuatico
     * @param velocidadActual Parámetro que define la velocidad actual
     * de un vehículo acuático
     * @param velocidadMaxima Parámetro que define la velocidad
     * máxima permitida para un vehículo acuático
     */
    public Acuatico(int velocidadActual, int velocidadMaxima) {
        // Invocamos al constructor de la clase padre Vehiculo
        super(velocidadActual, velocidadMaxima);
    }

    /*
     * Método que permite acelerar el vehículo acuático incrementando su velocidad
     * @param velocidad Parámetro que define cuánto se incrementa la velocidad
     */
    void acelerar(int velocidad) {
        int vel = velocidadActual + velocidad;
        if (vel > velocidadMaxima) {
            System.out.println("Supera la velocidad máxima permitida");
        } else {
            velocidadActual = vel; // Actualizamos la velocidad actual
        }
    }

    /*
     * Método que permite frenar el vehículo acuático disminuyendo su velocidad
     * @param velocidad Parámetro que define cuánto se disminuye la velocidad
     */
    void frenar(int velocidad) {
        int vel = velocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no puede ser negativa");
        } else {
            velocidadActual = vel; // Actualizamos la velocidad actual
        }
    }

    /*
     * Método que calcula las revoluciones del motor de un vehículo acuático
     * @param fuerza Parámetro que define la fuerza del motor
     * @param radio Parámetro que define el radio del motor
     * @return Devuelve las revoluciones calculadas como fuerza * radio
     */
    public int calcularRevolucionMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }

    /*
     * Método que recomienda la velocidad del vehículo en función de la velocidad del viento
     * @param velocidadViento Parámetro que define la velocidad del viento
     * Si el viento es muy fuerte o muy débil, la velocidad se reduce a 0 por seguridad
     */
    public void recomedarVelocidad(int velocidadViento) {
        if (velocidadViento > 80 || velocidadViento < 10) {
            velocidadActual = 0; // Velocidad reducida por condiciones del viento
        }
    }

    /*
     * Método que imprime la velocidad actual y máxima del vehículo acuático
     */
    public void imprimir() {
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
