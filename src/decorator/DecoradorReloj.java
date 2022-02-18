package decorator;

public abstract class DecoradorReloj implements Reloj {

	private final Reloj reloj;
	
	
	public DecoradorReloj(Reloj reloj) {
		this.reloj = reloj;
	}
	
	@Override
	public void crearFuncionalidad() {
		// TODO Auto-generated method stub
		this.reloj.crearFuncionalidad();
	}

}
