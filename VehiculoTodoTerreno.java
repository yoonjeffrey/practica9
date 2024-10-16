public class VehiculoTodoTerreno extends MedioDeTransporteMecanico {

    public VehiculoTodoTerreno(String nombre, String identificador, int añoDeCreacion) {
        super(nombre, identificador, añoDeCreacion);
    }

    @Override
    public void encender() {
        System.out.println("El vehículo todoterreno está encendiendo con botón de arranque.");
    }

    @Override
    public void apagar() {
        System.out.println("El vehículo todoterreno está apagando el motor.");
    }

    @Override
    public void avanzar() {
        System.out.println("El vehículo todoterreno está avanzando por terrenos difíciles.");
    }

    @Override
    public void retroceder() {
        System.out.println("El vehículo todoterreno está retrocediendo con cuidado.");
    }

    @Override
    public void girar() {
        System.out.println("El vehículo todoterreno está girando con precisión.");
    }
}