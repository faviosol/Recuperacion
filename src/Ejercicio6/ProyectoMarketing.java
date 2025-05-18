package Ejercicio6;
public class ProyectoMarketing extends Proyecto {
    public ProyectoMarketing(String nombreProyecto) {
        super(nombreProyecto);
    }

    @Override
    public void agregarTarea(Tarea tarea) {
        if (tarea != null) {
            System.out.println("Agregando tarea de marketing: " + tarea);
            super.agregarTarea(tarea);
        } else {
            System.out.println("Error: La tarea no es válida.");
        }
    }

    public void lanzarCampaña() {
        System.out.println("Lanzando campaña de marketing...");
    }
}
