package Ejercicio5;
public class Principal {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell", 1949);
        Revista revista1 = new Revista("National Geographic","Varios",2021);
        DVD dvd1 = new DVD("Matrix", "Keanu Reves",1999);
        
        RegistroPrestamo registro = new RegistroPrestamo();
        registro.Prestar(libro1);
        registro.Prestar(revista1);
        registro.Prestar(dvd1);
        
        System.out.println("\n--- Estado de objeto:");
        registro.mostrarEstado();
        
        System.out.println("\n--- Devoluciones");
        registro.Devolver();
        
        System.out.println("\n--- Estado final:");
        registro.mostrarEstado();        
    }
}
