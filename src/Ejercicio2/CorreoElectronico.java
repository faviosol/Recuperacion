package Ejercicio2;
public class CorreoElectronico implements Notificable{
    @Override
    public String enviarNotificacion(){
        return "Enviando notificacion al Correo electronico";
    }
}