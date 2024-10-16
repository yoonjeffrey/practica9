public class Bus extends MedioDeTransporteMecanico {

    public Bus(String nombre, String identificador, int añoDeCreacion) {
        super(nombre, identificador, añoDeCreacion);
    }

    @Override
    public void encender() {
        System.out.println("El bus está encendiendo con llave.");
    }

    @Override
    public void apagar() {
        System.out.println("El bus está apagando el motor.");
    }

    @Override
    public void avanzar() {
        System.out.println("El bus está avanzando por la carretera.");
    }

    @Override
    public void retroceder() {
        System.out.println("El bus está retrocediendo con cuidado.");
    }

    @Override
    public void girar() {
        System.out.println("El bus está girando en la intersección.");
    }
}