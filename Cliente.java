package parcialcorte2;
public class Cliente {

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Cliente(int id, String nombre, String apellido, String numeroDocumento, TipoDocumento tipoDocumento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public long getTelefono() {
        return telefono;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    private int id;
    private String nombre,apellido,direccion,correo,numeroDocumento;
    private long telefono;
    private TipoDocumento tipoDocumento;
}
