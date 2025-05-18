package Ejercicio1;
public class CuentaCorriente extends CuentaBancaria{
    protected double tasaInteres = 0.01;
    
    public CuentaCorriente(double saldoInicial) {
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