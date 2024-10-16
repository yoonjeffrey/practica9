public class Bicicleta extends MedioDeTransporte {

    public Bicicleta(String nombre, String identificador, int añoDeCreacion) {
        super(nombre, identificador, añoDeCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println("La bicicleta está avanzando al pedalear.");
    }

    @Override
    public void retroceder() {
        System.out.println("La bicicleta no puede retroceder pedaleando.");
    }

    @Override
    public void girar() {
        System.out.println("La bicicleta está girando el manubrio.");
    }
}