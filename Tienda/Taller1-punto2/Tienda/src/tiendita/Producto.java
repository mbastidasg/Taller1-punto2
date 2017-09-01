package tiendita;

public class Producto {
    
    // atributos
    
    private String nombre;
    private String tipo;
    private int disponible;
    private double PrecioF;
    private double precio;
    private int min;
    private int vendidos;

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
    

    
    
    public Producto(String nombre, String tipo, int disponible,  double precio, int min) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponible = disponible;
        this.PrecioF = Producto.precioFijo( precio, tipo );
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
    
    static double precioFijo( double precio, String tipo ) {
        double aux = 0, precioF = 0.0;
        switch (tipo) {
            case "papeleria":
                aux = (precio * 16) / 100;
                precioF = precio + aux;
                break;
            case "supermercado":
                aux = (precio * 4) / 100;
                precioF = precio + aux;
                break;
            case "drogueria":
                aux = (precio * 12) / 100;
                precioF = precio + aux;
                break;
            default :
                aux = -1.0;
                break;
        }
        return precioF;
    }
    
    public double vender( int cantidad ) {
        this.vendidos += cantidad;
        return PrecioF*cantidad;
    }
    
    public boolean hayQueHacerPedido() {
        return disponible-vendidos <= min;
    }
    
    public String toString() {
        return nombre ;
    }
    
}

