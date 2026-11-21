package parcialcorte2;
import java.time.LocalDate;
public class Factura {
    private int numeroFactura;
    private LocalDate fechaEmision;
    private double subtotal, impuestos, total;
    private MetodoPago metodoPago;
    private Pedido pedido;

    public Factura(int numeroFactura, LocalDate fechaEmision, double subtotal, double impuestos, double total, MetodoPago metodoPago, Pedido pedido) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.subtotal = subtotal;
        this.impuestos = impuestos;
        this.total = total;
        this.metodoPago = metodoPago;
        this.pedido = pedido;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public double getTotal() {
        return total;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public Pedido getPedido() {
        return pedido;
    }
    
}
