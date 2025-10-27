package com.christian.vehiculo;

/*
 * Autor: Christian Zumárraga
 * Fecha: 26/10/2025
 * Descripción: Interfaz Motor que define el comportamiento de un motor
 * que será implementado por los vehículos Terrestre y Acuático
 * Contiene un método para calcular las revoluciones del motor según
 * la fuerza y el radio del mismo
 */
public interface Motor {
    /*
     * Método abstracto que permite calcular las revolcuiones de un motor a partir de la fuerza y radio del motor
     * @param fuerza Parámetro que define la fuerza del motor de un vehículo
     * @param radio Parámetro que define el radio del motor de un vehículo
     *
     */
    int calcularRevolucionMotor(int fuerza, int radio);
}
