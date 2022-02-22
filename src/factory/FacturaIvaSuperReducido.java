package factory;

public class FacturaIvaSuperReducido implements IFactura {

	public double importe;
	
	@Override
	public double getImporteFactura() {
		// TODO Auto-generated method stub
		return importe * 1.04;
	}

	@Override
	public void setImporteFactura(Double importe) {
		// TODO Auto-generated method stub
		this.importe = importe;
	}

}
