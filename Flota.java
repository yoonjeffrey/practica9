import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<MedioDeTransporte> mediosDeTransporte;

    public Flota() {
        mediosDeTransporte = new ArrayList<>();
    }

    public void agregarMedioDeTransporte(MedioDeTransporte medio) {
        mediosDeTransporte.add(medio);
    }

    public void agregarMedioDeTransporte(List<MedioDeTransporte> medios) {
        mediosDeTransporte.addAll(medios);
    }

    public void eliminarMedioDeTransporte(MedioDeTransporte medio) {
        mediosDeTransporte.remove(medio);
    }

    public List<MedioDeTransporte> getMediosDeTransporte() {
        return mediosDeTransporte;
    }

    public int getCantidadMediosDeTransporte() {
        return mediosDeTransporte.size();
    }
}