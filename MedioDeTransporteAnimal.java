public class MedioDeTransporteAnimal extends MedioDeTransporte {

    public MedioDeTransporteAnimal(String nombre, String identificador, int anioDeCreacion) {
        super(nombre, identificador, anioDeCreacion);
    }

    public void preparar() {
        System.out.println("Preparando el medio de transporte animal.");
    }

    public void descansar() {
        System.out.println("El medio de transporte animal está descansando.");
    }
}