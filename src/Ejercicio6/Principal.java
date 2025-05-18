package Ejercicio6;
public class Principal {

    public static void main(String[] args) {
        ProyectoSoftware proyectoSW = new ProyectoSoftware("Proyecto de Software");
        ProyectoMarketing proyectoMK = new ProyectoMarketing("Proyecto de Marketing");

        Proyecto.Tarea tarea1 = proyectoSW.new Tarea("Desarrollo Backend", "Crear API REST");
        Proyecto.Tarea tarea2 = proyectoMK.new Tarea("Campana en Redes", "Lanzar campana en Instagram");

        proyectoSW.agregarTarea(tarea1);
        proyectoMK.agregarTarea(tarea2);

        System.out.println("\n-- Listado de tareas de Software --");
        proyectoSW.listarTareas();

        System.out.println("\n-- Listado de tareas de Marketing --");
        proyectoMK.listarTareas();
    }   
}