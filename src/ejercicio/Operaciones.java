/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendita;
import java.util.*;

/**
 *
 * @author Maicol Velasquez
 */
public class Operaciones {

    private int cantidad; // CANTIDAD por unidad de cada producto
    private int cantidadProduc; // cantidad de productos que hay en la tienda
    Producto[] productos;
    private double TotalV;
    private double PrecioF;
    

    public Operaciones( double TotalV, int cantidadProduc) {
        
        this.TotalV = TotalV;
      
        this.cantidadProduc = cantidadProduc;

        Producto[] productos = new Producto[cantidadProduc];

    }

    public double getPrecioF() {
        return PrecioF;
    }

    public void setPrecioF(double PrecioF) {
        this.PrecioF = PrecioF;
    }

    
    public int getCantidadProduc() {
        return cantidadProduc;
    }

    public void setCantidadProduc(int cantidadProduc) {
        this.cantidadProduc = cantidadProduc;
    }

   
    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalV() {
        return TotalV;
    }

    public void setTotalV(double TotalV) {
        this.TotalV = TotalV;
    }
    
    

// no entendi la primera
    public Producto Pedido() {

        Producto productos = null;
        for (int h = 0; h < 4; h++) {
            if (this.productos[h].getDisponible() == this.productos[h].getMin()) {
                System.out.println(" AVISO :\n" + "Pedir pedido urgente, ha legado a la cantidad minima de:" + productos);
            }
        }
        return productos;
    }

    public void Estadisticas() {
        int indice = 0, aux = 0, aux1 = 50;
        Producto productos = null;
        for (int k = 0; k < 4; k++) {
            if (this.productos[k].getDisponible() != cantidad) {
                aux = this.productos[k].getDisponible() - cantidad;
                if (aux < aux1) {
                    aux1 = aux;
                    indice = k;
                }
            }
        }
        System.out.println("El mas vendido fue:" + this.productos[indice]);

        for (int b = 0; b < 4; b++) {
            if (this.productos[b].getDisponible() != cantidad) {
                aux = this.productos[b].getDisponible() - cantidad;
                if (aux > aux1) {
                    aux1 = aux;
                    indice = b;
                }
            }
        }
        System.out.println("El menos vendido fue:" + this.productos[indice]);

    }
    
    public double PrecioFijo ( double precio, String Tipo ){
        double aux ;
        for (int i= 0; i < this.cantidadProduc; i++){
        if(this.productos[i].equals(Tipo)   ){
             switch (Tipo) {
                case "papeleria":
                    aux = (precio * 16) / 100;
                    this.PrecioF = precio + aux;
                    break;
                case "supermercado":
                    aux = (precio * 4) / 100;
                    this.PrecioF = precio + aux;
                    break;
                case "drogueria":
                    aux = (precio * 12) / 100;
                    this.PrecioF = precio + aux;
                    break;
            }
            
        }
    }
    return this.PrecioF;
}
    
    
    public boolean AgregarPro (String nombre, String tipo, int disponible,  double precio, int min, double PrecioF){
        
        Producto productos = new Producto (nombre, tipo, disponible, precio, min, PrecioF);
                 if(this.cantidadProduc < 10){
         this.productos[this.cantidadProduc] = productos;
         this.cantidadProduc++;
         return true;
      }else 
          return false;
    }
    
    public boolean Vender (String nombre, int cuantos, double TotalV){
        Producto productos = null;
        boolean resul = false;
        for (int ih = 0; ih < this.cantidadProduc ; ih++) {
            if ( this.productos[ih].getNombre().equals(nombre)){
                int aux2 = 0;
                double auxx= 0;
             aux2 = this.productos[ih].getDisponible() ;
             auxx = this.productos [ih].getPrecioF();
                      aux2 -= cuantos; 
              //  this.productos[ih].getDisponible() = aux2;
                resul = true;
                
               TotalV = auxx * cuantos;
            } 
        }
    return resul;
    }

    
    
}
