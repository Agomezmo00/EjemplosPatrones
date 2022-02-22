package factory;

public class FacturaIvaReducido implements IFactura {

	public double importe;
	@Override
	public double getImporteFactura() {
		// TODO Auto-generated method stub
		return importe * 1.10;
	}

	@Override
	public void setImporteFactura(Double importe) {
		// TODO Auto-generated method stub
		this.importe = importe;
	}

}
