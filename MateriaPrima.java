package parcialcorte2;
public class MateriaPrima {
    private int id;
    private String nombre,unidadMedida;
    private double stock;
    private Proveedor proveedor;
    private Bodega bodega;

    public MateriaPrima(int id, String nombre, String unidadMedida, double stock, Proveedor proveedor, Bodega bodega) {
        this.id = id;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.stock = stock;
        this.proveedor = proveedor;
        this.bodega = bodega;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public double getStock() {
        return stock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
    
}
