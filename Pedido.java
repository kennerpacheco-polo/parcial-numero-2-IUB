package parcialcorte2;

import java.time.LocalDate;

public class Pedido {
    private int id;
    private LocalDate fecha;
    private double valorEstimado;
    private EstadoPedido estadoPedido;
    private Cliente cliente;

    public Pedido(int id, LocalDate fecha, double valorEstimado, EstadoPedido estadoPedido, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.valorEstimado = valorEstimado;
        this.estadoPedido = estadoPedido;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    
}
