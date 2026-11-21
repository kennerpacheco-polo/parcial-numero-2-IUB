package parcialcorte2;
public class Proveedor {
    private String nit,razonsocial,correo,direccion;
    private long telefono;

    public Proveedor(String nit, String razonsocial) {
        this.nit = nit;
        this.razonsocial = razonsocial;
    }

    public String getNit() {
        return nit;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
}
