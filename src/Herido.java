
public class Herido implements State {

	@Override
	public void recibirDisparo(Soldado soldado) {
		System.out.println("AAAAAAAAAAH VOY A MORIR!!!");
		soldado.setSangre(0);
		soldado.cambiarEstado(new Muerto());
	}

	@Override
	public void recibirCuracion(Soldado soldado) {
		System.out.println("Gracias!");
		soldado.setAgujeros(soldado.getAgujeros() - 1);
		soldado.cambiarEstado(new Saludable());
	}

}
