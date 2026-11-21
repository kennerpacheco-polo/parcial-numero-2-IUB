package parcialcorte2;
public class Trabajador {
    private int id;
    private String nombre,apellido,direccion,correo,numeroDocumento;
    private long telefono;
    private TipoDocumento tipoDocumento;
    private Sexo sexo;
    private FormacionEducativa formacionEducativa;
    private Cargo cargo;
    private Turno turno;

    public Trabajador(int id, String nombre, String apellido, String direccion, String correo, String numeroDocumento, long telefono, TipoDocumento tipoDocumento, Sexo sexo, FormacionEducativa formacionEducativa, Cargo cargo, Turno turno) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
        this.sexo = sexo;
        this.formacionEducativa = formacionEducativa;
        this.cargo = cargo;
        this.turno = turno;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public FormacionEducativa getFormacionEducativa() {
        return formacionEducativa;
    }

    public void setFormacionEducativa(FormacionEducativa formacionEducativa) {
        this.formacionEducativa = formacionEducativa;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
}
