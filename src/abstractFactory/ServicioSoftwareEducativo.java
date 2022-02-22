package abstractFactory;

import java.util.Date;

public class ServicioSoftwareEducativo implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("Nuestros programadores han sido informados del programa que deben realizar.");
    }

    @Override
    public void indicarFechaEntrega() {
    	Date d = new Date();
        System.out.println("Se ha fijado como fecha de entrega el día "+d.toString());
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El monto a pagar será proporcional a la cantidad de estudiantes que harán uso del software.");
    }

}
