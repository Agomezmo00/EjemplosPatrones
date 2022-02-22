package factory;

public class FacturaIvaNormal implements IFactura {

	public double importe;
	
	@Override
	public double getImporteFactura() {
		// TODO Auto-generated method stub
		return importe * 1.21;
	}

	@Override
	public void setImporteFactura(Double importe) {
		// TODO Auto-generated method stub
		this.importe = importe;
	}

}
