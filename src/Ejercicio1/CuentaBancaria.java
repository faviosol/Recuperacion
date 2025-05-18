package Ejercicio1;
public abstract class CuentaBancaria{
    protected double saldo;
    
    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }
    
    public abstract void depositar(double cantidad);
    public abstract void retirar(double cantidad);
    public abstract double calcularInteres();
    
    public double getSaldo(){
        return saldo;
    }
}