//Cristian Ramiro Jimenez Molina - Programacion dispositivos Moviles

package sustentacion;

import java.util.Scanner;

public class Producto {
    
    Scanner leer = new Scanner(System.in);
    
    private String nombre = "";
    private int cantidad = 0, ventas = 0;
    private double precio = 0, total = 0;
    
    public void Agregar(){
        System.out.print("Ingrese el nombre del producto: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese la cantidad de productos: ");
        cantidad = leer.nextInt();
        System.out.print("Ingrese el valor individual del producto: ");
        precio = leer.nextDouble();
        System.out.println("");
    }
    
    public int Buscar(String a){       
        if(nombre.equals(a)){
            System.out.println("");
            System.out.println("Nombre del producto: " + nombre);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Valor: " + precio);
            return 0;
        }
        else
            return 1;
    }
    
    public void Eliminar(String a){
        if(nombre.equals(a)){
            nombre = "";
            cantidad = 0;
            precio = 0;
            System.out.println("Producto eliminado.");
            System.out.println("");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void Ventas(String a, int b) {
        if(nombre.equals(a)){
            if(cantidad>=b){
                ventas = b;
                cantidad = cantidad-b;
                System.out.println("Venta realizada con exito !");
            }
            else
                System.out.println("No hay suficientes productos para realizar la venta.");           
        }
        
        System.out.println("");
    }

    public int getVentas() {
        return ventas;
    }
    
    public int Ganancias(){
        total = precio*ventas;
        
        System.out.println("Se realizaron " + ventas + " ventas del producto(" + nombre + ") para un total de ganancias de " + total);
        
        return ventas;
    }
}
