package parcialcorte2;
public class EstadoDevolucion {
    private int id;
    private String nombre;

    public EstadoDevolucion(int id, String nombre) {
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
