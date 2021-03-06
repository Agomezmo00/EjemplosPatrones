package singleton;

import java.util.Scanner;

public class Principal {
    
    private static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do{
            opcion = menu();
            switch(opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del producto en venta: ");
                    String producto = S.nextLine();
                    System.out.print("Ingrese cantidad vendida: ");
                    int cant = Integer.parseInt(S.nextLine());
                    Registro.getInstancia().agregarVenta(producto, cant);
                    break;
                case 2:
                    System.out.println( Registro.getInstancia().toString() );
                    break;
                case 3:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while(opcion!=3);
    }

    private static int menu() {
        System.out.print(
                "\nMENÚ DE OPCIONES"
               +"\n1. Registrar nueva venta."
               +"\n2. Consultar historial de ventas."
               +"\n3. Salir del programa."
               +"\nSeleccione opción: "        
        );
        return Integer.parseInt( S.nextLine() );
    }
    
}

