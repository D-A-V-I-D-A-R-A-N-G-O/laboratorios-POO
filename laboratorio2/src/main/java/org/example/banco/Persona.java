package org.example.banco;

public abstract class Persona {
    private String nombre;
    private Integer edad;
    private Integer numeroID;
    private String direccion;

    public Persona(String nombre, Integer edad, Integer numeroID, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroID = numeroID;
        this.direccion = direccion;
    }

    public Persona(){
    }


    public abstract void saludo();

    public void obtenerInformacion() {
        System.out.println("Nombre: "+ this.nombre +"Edad: "+ this.edad+ "NumeroID: "+ this.numeroID + "Dirección: " + this.direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(Integer numeroID) {
        this.numeroID = numeroID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
