package Ejercicio1;
public class CuentaInversion extends CuentaBancaria{

    private double tasaInteres;
    public CuentaInversion(double saldoInicial) {
        super(saldoInicial);
    }
    
    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public double calcularInteres() {
        return saldo*tasaInteres;
    }
}