package org.example.banco;

public class CuentaCorriente extends CuentaBancaria {
    private final double limiteSobregiro;
    private int retirosRealizadosMes;

    public CuentaCorriente(String titular, Integer numeroCuenta, Double saldo, double limiteSobregiro) {
        super(titular, numeroCuenta, saldo);
        this.limiteSobregiro = limiteSobregiro;
        this.retirosRealizadosMes = 0;
    }

    @Override
    public void retirar(Double retiro) {
        if (retiro > 0 && (this.getSaldo() - retiro) >= -limiteSobregiro) {
            double r = this.getSaldo() - retiro;
            this.setSaldo(r);
            retirosRealizadosMes++;
            System.out.println("Retiro exitoso. Saldo actual: " + this.getSaldo());
        } else {
            System.out.println("Error: Fondos insuficientes o se supera el límite de sobregiro.");
        }
    }

    @Override
    public int calcularCostoMensual() {
        return 10000 * retirosRealizadosMes;
    }


}