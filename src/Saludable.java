
public class Saludable implements State {

	@Override
	public void recibirDisparo(Soldado soldado) {
		System.out.println("aaaaaaah me dieron");
		soldado.setSangre(soldado.getSangre() - 100);
		soldado.setAgujeros(soldado.getAgujeros() + 1);
		soldado.cambiarEstado(new Herido());
	}

	@Override
	public void recibirCuracion(Soldado soldado) {
		System.out.println("Gracias pero estoy saludable");
	}
	
}
