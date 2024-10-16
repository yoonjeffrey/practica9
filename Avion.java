public class Avion extends MedioDeTransporteMecanico {

    public Avion(String nombre, String identificador, int añoDeCreacion) {
        super(nombre, identificador, añoDeCreacion);
    }

    @Override
    public void encender() {
        System.out.println("El avión está encendiendo motores a reacción.");
    }

    @Override
    public void apagar() {
        System.out.println("El avión está apagando los motores.");
    }

    @Override
    public void avanzar() {
        System.out.println("El avión está avanzando en el aire.");
    }

    @Override
    public void retroceder() {
        System.out.println("El avión no puede retroceder en vuelo.");
    }

    @Override
    public void girar() {
        System.out.println("El avión está girando en el aire.");
    }
}