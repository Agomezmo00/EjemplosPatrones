package abstractFactory;

import java.util.Scanner;

public class Principal {

    private static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
        int o;
        do{
            o = preguntarServicio();
            switch(o) {
                case 1:
                    usarServicio(new DesignFactory());
                    break;
                case 2:
                    usarServicio(new SoftwareFactory());
                    break;
                case 3:
                    usarServicio(new WebsiteFactory());
                    break;
                case 4:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.print("\n");
        }while(o!=4);
    }
    
    public static void usarServicio(ServicioFactory factory) {
        ServicioInformatico servicio = factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }
    
    public static int preguntarServicio() {
        System.out.print(
                "MENÚ DE OPCIONES\n"
              + "---- -- -------->\n"
              + "1. Solicitar Diseño gráfico.\n"
              + "2. Solicitar Desarrollo de software educativo.\n"
              + "3. Solicitar Creación de sitios web.\n"
              + "4. Salir.\n"
              + "Seleccione opción: "
        );
        return Integer.parseInt( S.nextLine() );
    }
}
