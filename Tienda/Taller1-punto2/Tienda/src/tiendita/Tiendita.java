
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
public class Tiendita{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tienda tienda = new Tienda( 4 );
        
//        System.out.println("Ingrese el nombre del Producto");
//        String nombre = hola.next();
//        System.out.println("Ingrese el tipo de producto ( supermercado, papeleria o drogueria):");
//        String tipo = hola.next();
//        System.out.println("Cantidad a la venta y en bodega");
//        int disponible = hola.nextInt();
//        System.out.println("Minima cantidad del producto para prodecder a generar nuevo pedido");
//        int min = hola.nextInt();
//        System.out.println("Precio por unidad sin iva:");
//        double precio = hola.nextInt();
//        PrecioF = tienda.PrecioFijo(precio, tipo);
//        boolean  resultado = tienda.AgregarPro(nombre, tipo, disponible, precio, min, PrecioF);
//        if(resultado == true){
//            System.out.println("Se creo el producto satisfactoriamente");
//        }else{
//            System.out.println("Error al agregar producto");
//        }
        
        tienda.AgregarPro(0, "pan", "supermercado", 30, 10000, 5);
        tienda.AgregarPro(1, "dolex", "drogeria", 60, 1000, 10);
        tienda.AgregarPro(2, "lapiz", "papeleria", 100, 100000, 15);
        tienda.AgregarPro(3, "borrador", "papeleria", 30, 10000, 5);
        Scanner hola = new Scanner (System.in);
        double PrecioF, TotalV= 0;
        int Vendidos = 0;
        int continuar = 1, opcion = 0;
        do{
            System.out.println("1. Vender un producto");
            System.out.println("2. Conocer Estadisticas");
            System.out.println("3. Conocer promedio de las ventas");
            opcion = hola.nextInt();
            switch( opcion ) {
                case 1: {
                    System.out.println("Ingrese el nombre del producto a vender:");
                    String nombre = hola.next();
                    System.out.println("Ingrese la cantidad de unidades vendidas del este producto:");
                    int cuantos = hola.nextInt();
                    System.out.println(  "El precio de su compra es: "+tienda.venderProducto(nombre, cuantos) );
                tienda.Pedido();
                }
                
                 case 2: {
        tienda.Estadisticas(); 
        }
                 case 3:{
                 tienda.prom();
                 }
                 
                 
            }
            
           
//            if(opcion == 1){
//                
//            }else if (opcion == 2){
//                      
//                        
//            }else if(opcion == 3){
//                 System.out.println("Estadisticas:");
//                 tienda.Estadisticas();
//        
//                 
//            }else if ( opcion == 4 ){
//                
//                double prom = 0;
//                prom = TotalV / Vendidos;
//                System.out.println("El promedio de ventas es:\n" + prom );
//            }
        }while(continuar == 1);
        
    }
    
}