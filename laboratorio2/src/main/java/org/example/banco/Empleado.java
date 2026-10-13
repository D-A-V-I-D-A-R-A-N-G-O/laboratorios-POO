package org.example.banco;

public class Empleado extends Persona {
    private String areaDeTrabajo;

    public Empleado(String nombre, Integer edad, Integer numeroID, String direccion, String areaDeTrabajo) {
        super(nombre, edad, numeroID, direccion);
        if (areaDeTrabajo.equals("Atencion al cliente") || areaDeTrabajo.equals("Gestion Interna")){
            this.areaDeTrabajo = areaDeTrabajo;
        } else{
            System.out.println("El area de trabajo asignada no es valida, se asignara Gestion Interna");
            this.areaDeTrabajo = "Gestion Interna";
        }
    }

    public String getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    public void setAreaDeTrabajo(String areaDeTrabajo) {
        this.areaDeTrabajo = areaDeTrabajo;
    }

    @Override
    public void saludo() {
        if (this.areaDeTrabajo.equals("Atencion al cliente")){
            System.out.printf("Buen día, bienvenido a BancoFicticio. Le habla %s, del área de Atención al Cliente. ¿En qué puedo ayudarle?%n", this.getNombre());
        }
    }

}
