public class Empresa {
    private String nombre;
    private Flota flota;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.flota = new Flota();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }
}

