package parcialcorte2;
import java.time.LocalDate;
public class Devolucion {
    private int id,cantidadDevuelta;
    private LocalDate fecha;
    private String motivo;
    private EstadoDevolucion estadoDevolucion;
    private Factura factura;

    public Devolucion(int id, int cantidadDevuelta, LocalDate fecha, String motivo, EstadoDevolucion estadoDevolcucion, Factura factura) {
        this.id = id;
        this.cantidadDevuelta = cantidadDevuelta;
        this.fecha = fecha;
        this.motivo = motivo;
        this.estadoDevolucion = estadoDevolcucion;
        this.factura = factura;
    }

    public int getId() {
        return id;
    }

    public int getCantidadDevuelta() {
        return cantidadDevuelta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public EstadoDevolucion getEstadoDevolcucion() {
        return estadoDevolucion;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setEstadoDevolcucion(EstadoDevolucion estadoDevolcucion) {
        this.estadoDevolucion = estadoDevolcucion;
    }
    
}
