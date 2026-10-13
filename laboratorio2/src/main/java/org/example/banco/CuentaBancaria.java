package org.example.banco;

public  abstract class CuentaBancaria {
    private String Titular;
    private Double Saldo;
    private final Integer NumeroCuenta;

    public CuentaBancaria(String titular, Integer numeroCuenta, Double saldo) {
        Titular = titular;
        NumeroCuenta = numeroCuenta;
        Saldo = saldo;
    }

    public void depositar(Double deposito){
        if(deposito>0){
           this.Saldo+=deposito;
        } else{
            System.out.println("Deposita un saldo valido");
        }
    }
    public void retirar(Double retiro){
        if(retiro<=this.Saldo) {
            this.Saldo -= retiro;
        }else {
            System.out.println("No hay fondos suficientes");
        }
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }
    public void mostrarInformacion(){
        System.out.println("Titular: "+ Titular);
        System.out.println("Saldo: "+ Saldo);
        System.out.println("numero de Cuenta: "+ NumeroCuenta);
    }

    public abstract int calcularCostoMensual();
}