package parcialcorte2;

import java.time.LocalDate;

public class OrdenProduccion {
    private int id,cantidadAFabricar;
    private LocalDate fechaInicio, fechaEstimadaEntrega;
    private EstadoOrden estadoOrden;
    private Zapato zapato;
    private Trabajador trabajador;

    public OrdenProduccion(int id, int cantidadAFabricar, LocalDate fecha, LocalDate fechaEstimadaEntrega, EstadoOrden estadoOrden, Zapato zapato, Trabajador trabajador) {
        this.id = id;
        this.cantidadAFabricar = cantidadAFabricar;
        this.fechaInicio = fecha;
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
        this.estadoOrden = estadoOrden;
        this.zapato = zapato;
        this.trabajador = trabajador;
    }

    public int getId() {
        return id;
    }

    public int getCantidadAFabricar() {
        return cantidadAFabricar;
    }

    public LocalDate getFecha() {
        return fechaInicio;
    }

    public LocalDate getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }

    public EstadoOrden getEstadoOrden() {
        return estadoOrden;
    }

    public Zapato getZapato() {
        return zapato;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setFechaEstimadaEntrega(LocalDate fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    public void setEstadoOrden(EstadoOrden estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

}
