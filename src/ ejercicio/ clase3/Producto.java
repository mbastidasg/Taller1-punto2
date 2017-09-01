/**
 *
 * @author Maicol Velasquez
 */
public class Producto {
    
    // atributos
    
    private String nombre;
    private String tipo;
    private int disponible;
    private double PrecioF;
    private double precio;
    private int min;
    
    

    public Producto(String nombre, String tipo, int disponible,  double precio, int min, double PrecioF) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponible = disponible;
        this.PrecioF = PrecioF;
        
        this.min = min;
        this.precio = precio;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

  

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioF() {
        return PrecioF;
    }

    public void setPrecioF(double PrecioF) {
        this.PrecioF = PrecioF;
    }
    
    
    
    
   
    
}
