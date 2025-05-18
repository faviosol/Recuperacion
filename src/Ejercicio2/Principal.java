package Ejercicio2;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Notificable correo = () -> "Enviando correo electronico desde clase anonima...";

        Notificable sms = () -> "Enviando SMS desde clase anonima...";

        Notificable push = () -> "Enviando notificacion Push desde clase anonima...";
       
        Notificador notificador = new Notificador(Arrays.asList(correo, sms, push));
        notificador.notificarTodos();
    }
}