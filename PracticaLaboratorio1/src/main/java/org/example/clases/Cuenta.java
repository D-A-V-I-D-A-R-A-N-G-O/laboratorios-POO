package org.example.clases;
//parte1
public class Cuenta {
    String Titular;
    Integer ID;
    Double Saldo;

    //parte 4
    //completo
    public Cuenta(String titular, Integer ID, Double Saldo) {
        this.Titular = titular;
        this.ID = ID;
        if (Saldo != null && Saldo > 0.0) {
            this.Saldo = Saldo;
        } else {
            this.Saldo = 0.0;
        }

    }
    //sin saldo inicial
    public Cuenta(String titular, Integer ID) {
        this.Titular = titular;
        this.ID = ID;
        this.Saldo = 0.0;
    }
    //por defecto
    public Cuenta() {
        this.Titular = "Titular";
        this.ID = 0;
        this.Saldo = 0.0;
    }


    //parte 3
    public void mostrarInfo(){
        System.out.println("Titular: " + this.Titular + " ID: " + this.ID + " Saldo: " + this.Saldo);
    }
    public void agregarSaldo(Double saldo){
        if (saldo > 0){
            this.Saldo += saldo;
        }else {
            System.out.println("Deposita algo, avaro");
        }
    }
    public void perderSaldo(Double saldo){
        if(saldo >= this.Saldo){
            this.Saldo -= saldo;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void obtenerTitular(){
        System.out.println("Titular: " + this.Titular);
    }
    public void obtenerID(){
        System.out.println("ID: " + this.ID);
    }

    public String getTitular() {
        return Titular;
    }

    public Integer getID() {
        return ID;
    }

    public Double getSaldo() {
        return Saldo;
    }
}