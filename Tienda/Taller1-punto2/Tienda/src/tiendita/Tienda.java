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
public class Tienda {
    private int cantidadProduc; // cantidad de productos que hay en la tienda
    Producto[] productos;

    public Tienda(int cantidadProduc) {
        this.cantidadProduc = cantidadProduc;
        productos = new Producto[cantidadProduc];
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

// no entendi la primera
    public void Pedido() {
        for (int h = 0; h < 4; h++) {
            if ( productos[h].hayQueHacerPedido()) {
                System.out.println(" AVISO :\n" + "Pedir pedido urgente, ha legado a la cantidad minima de:" + productos[h]);
            }
        }
    }

    public void Estadisticas() {
        int aux = 0;
        for (int i = 0; i < 4; i++) {
              if ( productos[i].getVendidos() > productos[aux].getVendidos()){
                
           aux = i;
            }
            
        }
           System.out.println("El mas vendido es:"+productos[aux]);
 
        for (int i = 0; i < 4; i++) {
              if ( productos[i].getVendidos() < productos[aux].getVendidos()){
                
           aux = i;
            }
            
        }
           System.out.println("El menos vendido es:"+productos[aux]);
    }
    
public void prom (){
    double productoVendido = 0.0;
    double ventas = 0.0;
    double aux2 = 0.0;
     for (int i = 0; i < 4; i++) {
       productoVendido += productos[i].getVendidos();
       ventas += productos[i].vender(cantidadProduc);
       
       
                 
        
    }
     aux2 = ventas/productoVendido;
    System.out.println("El promedio de ventas es:" + aux2 );
}


    public void AgregarPro(int numProducto, String nombre, String tipo, int disponible, double precio, int min) {
        productos[numProducto] = new Producto(nombre, tipo, disponible, precio, min);
    }

    public double venderProducto(String nombre, int cuantos) {
        boolean resul = false;
        for (int ih = 0; ih < this.cantidadProduc; ih++) {
            if (this.productos[ih].getNombre().equals(nombre)) {
                return productos[ih].vender(cuantos);
            }
        }
        return -1.0;
    }

}
