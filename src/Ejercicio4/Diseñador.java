package Ejercicio4;
public class Diseñador extends Empleado{

    public Diseñador(String nombre, int salarioBase) {
        super(nombre, salarioBase);
    }
    
    @Override
    public double salarioBase() {
        return salarioBase + salarioBase * 0.10;
    }
}
