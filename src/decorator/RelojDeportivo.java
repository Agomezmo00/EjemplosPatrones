package decorator;

public class RelojDeportivo extends DecoradorReloj {
	
	
	public RelojDeportivo(Reloj reloj) {
		super(reloj);
	}
	
	@Override
	public void crearFuncionalidad() {
		super.crearFuncionalidad();
		System.out.print("Más características (Reloj deportivo): ");
		this.addCuentaPasos();
		this.addModoSilencioso();
	}
	
	
	private void addCuentaPasos() {
		System.out.println("\n\tCuentapasos");
	}
	
	private void addModoSilencioso() {
		System.out.println("\n\tModo silencioso");
	}
}
