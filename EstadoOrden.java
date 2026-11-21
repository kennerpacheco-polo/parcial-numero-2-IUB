package parcialcorte2;
public class EstadoOrden {
    private int id;
    private String nombre;

    public EstadoOrden(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
