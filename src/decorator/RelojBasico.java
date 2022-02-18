package decorator;

public class RelojBasico implements Reloj {

	@Override
	public void crearFuncionalidad() {
		// TODO Auto-generated method stub
		System.out.println("Reloj Básico que incluye: ");
		this.addCronometro();

	}
	
	private void addCronometro() {
		System.out.println("Cronómetro");
	}

}
