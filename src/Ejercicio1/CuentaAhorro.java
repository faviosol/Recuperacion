package Ejercicio1;
public class CuentaAhorro extends CuentaBancaria{
    private final double tasaInteres = 0.02; // 2%

    public CuentaAhorro(double saldoInicial) {
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