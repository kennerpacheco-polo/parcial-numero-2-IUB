package parcialcorte2;
import java.util.List;
public class Zapato {
    private int id;
    private String nombreModelo,color,referencia;
    private double talla,precioUnitario;
    private List<MateriaPrima> materiasPrimas;

    public Zapato(int id, String nombreModelo, String color, String referencia, double talla, double precioUnitario) {
        this.id = id;
        this.nombreModelo = nombreModelo;
        this.color = color;
        this.referencia = referencia;
        this.talla = talla;
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return id;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public String getColor() {
        return color;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getTalla() {
        return talla;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public List<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setMateriasPrimas(List<MateriaPrima> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }
     
}
