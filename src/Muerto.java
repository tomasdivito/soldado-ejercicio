
public class Muerto implements State {

	@Override
	public void recibirDisparo(Soldado soldado) {
		soldado.setAgujeros(soldado.getAgujeros() + 1);
	}

	@Override
	public void recibirCuracion(Soldado soldado) {
		System.out.println("HE REVIVIDO!!!");
		soldado.setAgujeros(0);
		soldado.setSangre(5000);
		soldado.cambiarEstado(new Saludable());
	}

}
