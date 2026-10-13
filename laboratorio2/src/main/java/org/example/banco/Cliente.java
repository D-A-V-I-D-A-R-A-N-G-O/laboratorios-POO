package org.example.banco;

import java.time.LocalDate;

public class Cliente extends Persona{
    private LocalDate fechaRegistro;
    private String correoElectronico;

    public Cliente(String nombre, Integer edad, Integer numeroID, String direccion, LocalDate fechaRegistro, String correoElectronico) {
        super(nombre, edad, numeroID, direccion);
        this.fechaRegistro = fechaRegistro;
        this.correoElectronico = correoElectronico;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void saludo() {
        System.out.println("Hola soy "+ this.getNombre()+ "y escojo el BancoDAV desde "+ this.fechaRegistro + " por su gran servicio");
    }
}
