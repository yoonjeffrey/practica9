import java.util.Date;

public class Mantenimiento {
    private String tipoMantenimiento;
    private Date fecha;
    private double costo;

    public Mantenimiento(String tipoMantenimiento, Date fecha, double costo) {
        this.tipoMantenimiento = tipoMantenimiento;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}