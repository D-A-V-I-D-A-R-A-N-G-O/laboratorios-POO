package org.example;

import org.example.clases.Cuenta;

public class Main {
    public static void main(String[] args) {
        // Parte 2
        Cuenta cuenta1 = new Cuenta("David Arango", 1031941761, 100.0);
        Cuenta cuenta2 = new Cuenta("Bernardo Arango", 71682277, 10000.0);
        Cuenta cuenta3 = cuenta1;

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());

        // Clonación manual
        Cuenta cuenta4 = new Cuenta(cuenta1.getTitular(), cuenta1.getID(), cuenta1.getSaldo());
        System.out.println(cuenta4.toString());

        // Parte 5: Demostración de finalización lógica y Garbage Collector

        cuenta1 = null;
        cuenta3 = null;

        System.gc();
        System.out.println("Hola como le ha ido el dia de hoy");
    }
}