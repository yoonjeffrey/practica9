public class Caballo extends MedioDeTransporteAnimal {

    public Caballo(String nombre, String identificador, int añoDeCreacion) {
        super(nombre, identificador, añoDeCreacion);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando el caballo con la silla y las riendas.");
    }

    @Override
    public void descansar() {
        System.out.println("El caballo está descansando y comiendo heno.");
    }

    @Override
    public void avanzar() {
        System.out.println("El caballo está caminando hacia adelante.");
    }

    @Override
    public void retroceder() {
        System.out.println("El caballo está retrocediendo lentamente.");
    }

    @Override
    public void girar() {
        System.out.println("El caballo está girando según las riendas.");
    }
}