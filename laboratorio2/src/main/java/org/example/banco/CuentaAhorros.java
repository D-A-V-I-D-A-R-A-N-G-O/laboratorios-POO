package org.example.banco;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;
    private int retirosRealizados;
    private static final int LIMITE_RETIROS = 0;

    public CuentaAhorros(String titular, Integer numeroCuenta, Double saldo, double tasaInteres, int retirosRealizados) {
        super(titular, numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
        this.retirosRealizados = retirosRealizados;
    }

    @Override
    public int calcularCostoMensual() {
        return 15000;
    }
    public void aplicarInteres(){
        double interes = this.tasaInteres * this.getSaldo();
        super.depositar(interes);
    }

    @Override
    public void retirar(Double retiro) {
        if (retirosRealizados >= LIMITE_RETIROS) {
            System.out.println("Limite de retiros alcanzado :-(");
        } else {
            super.retirar(retiro);
            retirosRealizados += 1;
        }
    }
    public void resetRetiros(){
        this.retirosRealizados = 0;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tasa de interes: "+ tasaInteres);
        System.out.println("Retiros realizados: "+ retirosRealizados);
    }
}
