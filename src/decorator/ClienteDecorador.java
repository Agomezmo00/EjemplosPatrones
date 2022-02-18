package decorator;

public class ClienteDecorador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj relojBasico = new RelojBasico();
		relojBasico.crearFuncionalidad();
		
		System.out.println("\n----------");
		
		Reloj relojDeportivo = new RelojDeportivo(new RelojBasico());
		relojDeportivo.crearFuncionalidad();
		
		System.out.println("\n------------");
		
		
		Reloj relojDeportivoyDeAltaGama = new RelojAltaGama(new RelojDeportivo(new RelojBasico()));
		relojDeportivoyDeAltaGama.crearFuncionalidad();
		
		
	}

}
