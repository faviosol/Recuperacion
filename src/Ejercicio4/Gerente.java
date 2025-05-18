package Ejercicio4;
public class Gerente extends Empleado{

    public Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }   

    @Override
    public double salarioBase() {
        return salarioBase + 2000;
    }
}