package decorator;

public class RelojAltaGama extends DecoradorReloj {

	public RelojAltaGama(Reloj reloj) {
		super(reloj);
	}
	
	@Override
	public void crearFuncionalidad() {
		super.crearFuncionalidad();
		System.out.print("Más características (Reloj de lujo): ");
		this.cargaRapida();
		this.sumergible();
		this.nfc();
	}
	
	public void cargaRapida() {
		System.out.println("Carga muy rápido");
	}
	
	public void sumergible() {
		System.out.println("\n\tHasta 100 metros de profundidad");
	}
	public void nfc() {
		System.out.println("\n\tPermite hacer operaciones on NFC");
	}
}
