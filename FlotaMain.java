import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlotaMain {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Turistas Felices");

        Flota flota = empresa.getFlota();

        Bus bus = new Bus("Bus Turístico", "BUSABC", 2015);
        Caballo caballo = new Caballo("Caballo Negro", "CAB456", 2011);
        Bicicleta bicicleta = new Bicicleta("Bicicleta de Montana", "BIC789", 2018);
        VehiculoTodoTerreno todoterreno = new VehiculoTodoTerreno("Can-nam", "4X4ABC", 2019);
        Avion avion = new Avion("Avión Paracaidismo", "AVIDEF", 2016);

        flota.agregarMedioDeTransporte(bus);
        flota.agregarMedioDeTransporte(caballo);

        List<MedioDeTransporte> listaMedios = new ArrayList<>();
        listaMedios.add(bicicleta);
        listaMedios.add(todoterreno);
        listaMedios.add(avion);

        flota.agregarMedioDeTransporte(listaMedios);

        // Invoca métodos
        bus.encender();
        bus.avanzar();
        bus.girar();
        bus.retroceder();
        bus.apagar();

        caballo.preparar();
        caballo.avanzar();
        caballo.girar();
        caballo.retroceder();
        caballo.descansar();

        bicicleta.avanzar();
        bicicleta.girar();
        bicicleta.retroceder();

        todoterreno.encender();
        todoterreno.avanzar();
        todoterreno.girar();
        todoterreno.retroceder();
        todoterreno.apagar();

        avion.encender();
        avion.avanzar();
        avion.girar();
        avion.retroceder();
        avion.apagar();

        // Crear y agregar Mantenimientos
        Mantenimiento mantenimiento1 = new Mantenimiento("Cambio de aceite", new Date(), 200.0);
        Mantenimiento mantenimiento2 = new Mantenimiento("Revisión general", new Date(), 500.0);
        Mantenimiento mantenimiento3 = new Mantenimiento("Cambio de ruedas", new Date(), 300.0);

        bus.agregarMantenimiento(mantenimiento1);

        List<Mantenimiento> listaMantenimientos = new ArrayList<>();
        listaMantenimientos.add(mantenimiento2);
        listaMantenimientos.add(mantenimiento3);
        bus.agregarMantenimiento(listaMantenimientos);

        caballo.agregarMantenimiento(mantenimiento2);
        

        bicicleta.agregarMantenimiento(mantenimiento3);
      

        todoterreno.agregarMantenimiento(mantenimiento1);
        todoterreno.agregarMantenimiento(listaMantenimientos);

        avion.agregarMantenimiento(mantenimiento2);
        avion.agregarMantenimiento(listaMantenimientos);

        System.out.println("Total de medios de transporte en la flota: " + flota.getCantidadMediosDeTransporte());

        for (MedioDeTransporte medio : flota.getMediosDeTransporte()) {
            System.out.println("Medio de transporte: " + medio.getNombre() + ", ID: " + medio.getIdentificador());
        }

        System.out.println("\nHistorial de Mantenimientos:");
        mostrarHistorial(bus);
        mostrarHistorial(caballo);
        mostrarHistorial(bicicleta);
        mostrarHistorial(todoterreno);
        mostrarHistorial(avion);
    }

    private static void mostrarHistorial(MedioDeTransporte transporte) {
        System.out.println("Historial de mantenimientos para " + transporte.getNombre() + " (ID: " + transporte.getIdentificador() + "):");
        if (transporte.getHistorialMantenimientos().isEmpty()) {
            System.out.println("  No hay mantenimientos registrados.");
        } else {
            for (Mantenimiento mantenimiento : transporte.getHistorialMantenimientos()) {
                System.out.println("  - Tipo: " + mantenimiento.getTipoMantenimiento() +
                        ", Fecha: " + mantenimiento.getFecha() +
                        ", Costo: $" + mantenimiento.getCosto());
            }
        }
    }
}