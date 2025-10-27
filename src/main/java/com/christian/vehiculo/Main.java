package com.christian.vehiculo;

import java.util.Scanner;

/*
 * Autor: Christian Zumárraga
 * Fecha: 26/10/2025
 * Descripción: Clase Main para probar los diferentes tipos de vehículos
 * creados en el proyecto, mostrando su comportamiento y atributos.
 * Además, permite la entrada de datos por teclado y la selección de operaciones
 * mediante un menú.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner para entrada de datos

        //Solicitar datos de la camioneta al usuario
        System.out.println("Ingrese la velocidad actual de la camioneta:");
        int velCamioneta = sc.nextInt();
        System.out.println("Ingrese la velocidad máxima de la camioneta:");
        int velMaxCamioneta = sc.nextInt();
        System.out.println("Ingrese la cantidad de llantas:");
        int llantas = sc.nextInt();
        sc.nextLine(); // Consumir salto de línea
        System.out.println("Ingrese el uso del vehículo (militar/civil):");
        String uso = sc.nextLine();

        // Crear un objeto camioneta de tipo Terrestre con los datos ingresados
        Terrestre camioneta = new Terrestre(velCamioneta, velMaxCamioneta, llantas, uso);

        // Mostrar información de la camioneta
        System.out.println("\n--- Camioneta ---");
        camioneta.imprimir(); //Imprime velocidad, llantas y uso

        //Menú simple para camioneta
        System.out.println("\nSeleccione una operación para la camioneta:");
        System.out.println("1. Acelerar");
        System.out.println("2. Frenar");
        int opcionCamioneta = sc.nextInt();
        if (opcionCamioneta == 1) {
            System.out.println("Ingrese velocidad a incrementar:");
            int inc = sc.nextInt();
            camioneta.acelerar(inc);
        } else if (opcionCamioneta == 2) {
            System.out.println("Ingrese velocidad a disminuir:");
            int dec = sc.nextInt();
            camioneta.frenar(dec);
        }

        // Mostrar nueva información
        System.out.println("Nueva información de la camioneta:");
        camioneta.imprimir();

        //Solicitar datos de la moto acuática al usuario
        System.out.println("\nIngrese la velocidad actual de la moto acuática:");
        int velMoto = sc.nextInt();
        System.out.println("Ingrese la velocidad máxima de la moto acuática:");
        int velMaxMoto = sc.nextInt();

        // Crear un objeto motoAcuatica de tipo Acuatico
        Acuatico motoAcuatica = new Acuatico(velMoto, velMaxMoto);

        // Mostrar información de la moto acuática
        System.out.println("\n--- Moto Acuática ---");
        motoAcuatica.imprimir();

        // Calcular las revoluciones del motor
        System.out.println("Revoluciones del motor = " + motoAcuatica.calcularRevolucionMotor(1200, 2));

        // Recomendar velocidad según viento
        System.out.println("Ingrese la velocidad del viento:");
        int viento = sc.nextInt();
        motoAcuatica.recomedarVelocidad(viento);
        System.out.println("Velocidad actual tras recomendación de viento: " + motoAcuatica.velocidadActual);

        sc.close(); //Cerrar Scanner
    }
}
