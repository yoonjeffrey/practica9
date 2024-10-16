public class MedioDeTransporteMecanico extends MedioDeTransporte {

    public MedioDeTransporteMecanico(String nombre, String identificador, int anioDeCreacion) {
        super(nombre, identificador, anioDeCreacion);
    }

    public void encender() {
        System.out.println("El medio de transporte mecánico está encendiendo.");
    }

    public void apagar() {
        System.out.println("El medio de transporte mecánico está apagando.");
    }
}