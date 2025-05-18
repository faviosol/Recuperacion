package Ejercicio1;
public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cc = new CuentaCorriente(1000);
        CuentaBancaria ca = new CuentaAhorro(2000);
        CuentaBancaria ci = new CuentaInversion(6000);

        System.out.println("Interes Cuenta Corriente: " + cc.calcularInteres());
        System.out.println("Interes Cuenta Ahorro: " + ca.calcularInteres());
        System.out.println("Interes Cuenta Inversion: " + ci.calcularInteres());
    }
}