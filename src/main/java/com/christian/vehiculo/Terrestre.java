package com.christian.vehiculo;

/*
 * Autor: Christian Zumárraga
 * Fecha: 26/10/2025
 * Descripción: Clase Terrestre que representa un vehículo terrestre
 * hereda de Vehiculo e implementa la interfaz Motor
 * Permite manejar velocidad, frenar, acelerar y calcular revoluciones del motor
 */
public class Terrestre extends Vehiculo implements Motor {

    /*
     * Atributo que define la cantidad de llantas del vehículo terrestre
     */
    private int cantidadLlantas;

    /*
     * Atributo que indica el uso del vehículo puede ser militar o civil
     */
    private String usoVehiculo;

    /*
     * Constructor de la clase Terrestre
     * @param velocidadActual Parámetro que define la velocidad actual de un vehículo terrestre
     * @param velocidadMaxima Parámetro que define la velocidad máxima permitida para un vehículo terrestre
     * @param cantidadLlantas Parámetro que define la cantidad de llantas del vehículo
     * @param usoVehiculo Parámetro que define el uso del vehículo (militar/civil)
     */
    public Terrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String usoVehiculo) {
        // Invocamos al constructor de la clase padre Vehiculo
        super(velocidadActual, velocidadMaxima);
        // Inicializamos los nuevos atributos
        this.cantidadLlantas = cantidadLlantas;
        this.usoVehiculo = usoVehiculo;
    }

    /*
     * Método que permite acelerar el vehículo terrestre incrementando su velocidad
     * @param velocidad Parámetro que define cuánto se incrementa la velocidad
     */
    public void acelerar(int velocidad) {
        int vel = velocidadActual + velocidad;
        if (vel > velocidadMaxima) {
            System.out.println("Supera la velocidad máxima permitida");
        } else {
            velocidadActual = vel; // Actualizamos la velocidad actual
        }
    }

    /*
     * Método que permite frenar el vehículo terrestre disminuyendo su velocidad
     * @param velocidad Parámetro que define cuánto se disminuye la velocidad
     */
    public void frenar(int velocidad) {
        int vel = velocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no puede ser negativa");
        } else {
            velocidadActual = vel; // Actualizamos la velocidad actual
        }
    }

    /*
     * Método que calcula las revoluciones del motor de un vehículo terrestre
     * @param fuerza Parámetro que define la fuerza del motor
     * @param radio Parámetro que define el radio del motor
     * @return Devuelve las revoluciones calculadas como fuerza * radio
     */
    public int calcularRevolucionMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }

    /*
     * Método que imprime la velocidad actual y máxima del vehículo terrestre
     */
    public void imprimir() {
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Cantidad de llantas: " + cantidadLlantas);
        System.out.println("Uso del vehículo: " + usoVehiculo);
    }
}
