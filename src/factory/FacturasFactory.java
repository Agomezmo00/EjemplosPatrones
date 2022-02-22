package factory;

public class FacturasFactory implements IFactura {

	@Override
	public double getImporteFactura() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void setImporteFactura(Double importe) {
		// TODO Auto-generated method stub
		
	}
	
	public IFactura getFactura(String tipoFactura) {
		
		if(tipoFactura == null) {
			return null;
		}
		
		if(tipoFactura.equalsIgnoreCase("REDUCIDO")) {
			return new FacturaIvaReducido();
		} else if(tipoFactura.equalsIgnoreCase("SUPER")) {
			return new FacturaIvaSuperReducido();
		} else if(tipoFactura.equalsIgnoreCase("NORMAL")) {
			return new FacturaIvaNormal();
		} else {
			throw new IllegalStateException("Valor inesperado: "+tipoFactura);
		}
		
		
	}


	

}
