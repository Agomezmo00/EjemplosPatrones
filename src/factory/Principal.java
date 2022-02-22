package factory;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacturasFactory f = new FacturasFactory();
		
		IFactura ivaNormal = f.getFactura("normal");
		ivaNormal.setImporteFactura(75.0);
		System.out.println("El importe de la factura es: "+ivaNormal.getImporteFactura());
		
		IFactura ivaReducido = f.getFactura("reducido");
		ivaReducido.setImporteFactura(100.0);
		System.out.println("El importe de la factura es: "+ivaReducido.getImporteFactura());
		
		IFactura ivaSuper = f.getFactura("super");
		ivaSuper.setImporteFactura(50.0);
		System.out.println("El importe de la factura es: "+ivaSuper.getImporteFactura());
		
	}

}
