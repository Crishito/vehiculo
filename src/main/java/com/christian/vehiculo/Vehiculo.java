package com.christian.vehiculo;

/*
 * Autor: Christian Zumárraga
 * Fecha: 26/10/2025
 * Descripción: Clase abstracta Vehiculo que sirve como plantilla para
 * distintos tipos de vehículos. Define atributos y métodos comunes
 * a todos los vehículos, como velocidad actual y velocidad máxima,
 * e incluye métodos abstractos que deben implementar las subclases.
 */

/* clase abstracta es una clase que no puede ser instanciada directamente,
 * es decir no se pueden crear objetos a partir de ella. Su principal pro-
 * pósito es servir como modelo o plantilla para que otras clases
 * hereden sus caracteristicas.
 * Las clases abstractas se utilizan cuando se quiere definir un comportamiento
 * común para un conjunto de clases relacionadas, pero dejando ciertos detalles
 * sin implementar, para que las subclases los definan según sus propias necesidades
 **/

public abstract class Vehiculo {

    // Atributo que representa la velocidad actual del vehículo
    int velocidadActual;

    // Atributo que representa la velocidad máxima permitida del vehículo
    int velocidadMaxima;

    /*
     * Constructor de la clase Vehiculo
     * @param velocidadActual Parámetro que define la velocidad inicial del vehículo
     * @param velocidadMaxima Parámetro que define la velocidad máxima permitida
     */
    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    /*
     * Método abstracto que permite incrementar la velocidad del vehículo
     * @param velocidad Parámetro que define cuánto se incrementa la velocidad
     *
     * Un método abstracto se declara pero no se implementa en la clase abstracta.
     * Las subclases deben proporcionar la implementación concreta.
     */
    abstract void acelerar(int velocidad);

    /*
     * Método abstracto que permite decrementar la velocidad del vehículo
     * @param velocidad Parámetro que define cuánto se decrementa la velocidad
     *
     * Las subclases son responsables de implementar este método
     * de acuerdo a las características de cada tipo de vehículo.
     */
    abstract void frenar(int velocidad);

    /*
     * Método abstracto que muestra en pantalla los datos del vehículo
     */
    public abstract void imprimir();
}
