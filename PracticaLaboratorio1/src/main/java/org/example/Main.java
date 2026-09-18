package org.example;
import org.example.clases.Cuenta;
import java.util.Scanner;

public class Main {
    //parte2
    static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("David Arango", 1031941761, 100.0);
        Cuenta cuenta2 = new Cuenta("Bernardo Arango", 71682277, 10000.0);
        Cuenta cuenta3 = cuenta1;
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.
                println(cuenta3.toString());
        //clonacion
        Cuenta cuenta4 = new Cuenta(cuenta1.getTitular(), cuenta1.getID(), cuenta1.getSaldo());
        System.out.println(cuenta4.toString());
    }


}