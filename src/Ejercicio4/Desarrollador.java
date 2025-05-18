package Ejercicio4;
public class Desarrollador extends Empleado{

    public Desarrollador(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    
    @Override
    public double salarioBase() {
        return salarioBase + salarioBase * 0.15;
    }
}