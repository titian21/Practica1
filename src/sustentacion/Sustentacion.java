//Cristian Ramiro Jimenez Molina - Programacion dispositivos Moviles

package sustentacion;

import java.util.Scanner;

public class Sustentacion {

    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        int opcion, i = 0, j = 0, k = 0;
        String nomb = "";
        Producto prod[] = new Producto[20];
        
        for(i=0; i<20; i++)
            prod[i] = new Producto();
        
        i = 0;
        
        do{       
            System.out.println("1. Agregar producto.");
            System.out.println("2. Buscar producto.");
            System.out.println("3. Eliminar producto.");
            System.out.println("4. Mostrar inventario.");
            System.out.println("5 Realizar venta.");
            System.out.println("6 Mostrar ganancias totales.");
            System.out.println("7. Salir");
            System.out.println("");
        
            opcion = leer.nextInt();
            System.out.println("");
            leer.nextLine();
        
            switch(opcion){
            
                case 1: prod[i].Agregar(); a
                        i++;
                        break;
                    
                case 2: System.out.print("Ingrese el nombre del producto que desea buscar: ");
                        nomb = leer.nextLine();
                        k = 0;
                        for(j=0; j<i; j++)
                            k = k + prod[j].Buscar(nomb);   
                        if(k>=i)
                            System.out.println("El producto no existe!");
                        System.out.println("");
                        break;
                    
                case 3: System.out.print("Ingrese el nombre del producto que desea eliminar: ");
                        nomb = leer.nextLine();
                        for(j=0; j<=i; j++)
                            prod[j].Eliminar(nomb);
                        System.out.println("");
                        break;
                    
                case 4: System.out.println("::Inventario::");
                        for(j=0; j<i; j++){
                            System.out.println("Producto #" + (j+1));
                            System.out.println("Nombre: " + prod[j].getNombre());
                            System.out.println("Cantidad: " + prod[j].getCantidad());
                            System.out.println("Valor individual: " + prod[j].getPrecio());
                            System.out.println("");
                        }
                        break;
                    
                case 5: System.out.print("Ingrese el nombre del producto y la cantidad de ventas que desea realizar: ");
                        nomb = leer.nextLine();
                        k = leer.nextInt();
                        for(j=0; j<=i; j++){
                            prod[j].Ventas(nomb, k);
                        }
                            
                        break;
                    
                case 6: k = 0;
                        for(j=0; j<i; j++){
                            k = k + prod[j].Ganancias();
                        }    
                        System.out.println("En total de todos los productos se realizaron " + k + " ventas.");
                        System.out.println("");
                        break;
                    
                case 7: break;
            
                default:    System.out.println("la opcion ingresada es incorrecta!");
                            break;
        }
        
        }while(opcion != 7);
    }
    
}
