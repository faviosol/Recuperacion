package Ejercicio4;
import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Empleado gerente = new Gerente("Laura",5000);
        Empleado dev = new Desarrollador("Carlos",4000);
        Empleado dis = new Diseñador("Ana",3500);
        
        List<Empleado> lista = Arrays.asList(gerente,dev,dis);
        Nomina.procesarNomina(lista);
    }
}