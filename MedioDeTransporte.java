import java.util.ArrayList;
import java.util.List;

public class MedioDeTransporte {
    private String nombre;
    private String identificador;
    private int añoDeCreacion;
    private List<Mantenimiento> historialMantenimientos;

    public MedioDeTransporte(String nombre, String identificador, int anioDeCreacion) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.añoDeCreacion = anioDeCreacion;
        this.historialMantenimientos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getAñoDeCreacion() {
        return añoDeCreacion;
    }

    public List<Mantenimiento> getHistorialMantenimientos() {
        return historialMantenimientos;
    }

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        historialMantenimientos.add(mantenimiento);
    }

    public void agregarMantenimiento(List<Mantenimiento> mantenimientos) {
        historialMantenimientos.addAll(mantenimientos);
    }

    public void avanzar() {
        System.out.println("El medio de transporte está avanzando.");
    }

    public void retroceder() {
        System.out.println("El medio de transporte está retrocediendo.");
    }

    public void girar() {
        System.out.println("El medio de transporte está girando.");
    }
}