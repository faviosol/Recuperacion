package Ejercicio2;
public class SMS implements Notificable{
    @Override
    public String enviarNotificacion(){
        return "Enviando notificacion SMS";
    }
}