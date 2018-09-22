public class Soldado {
	private int sangre;
	private int agujeros;
	private State estado;
	
	public Soldado() {
		this.sangre = 5000;
		this.agujeros = 0;
		this.estado = new Saludable();
	}
	
	public int getSangre() {
		return sangre;
	}
	
	public void setSangre(int sangre) {
		this.sangre = sangre;
	}
	
	public int getAgujeros() {
		return agujeros;
	}
	
	public void setAgujeros(int agujeros) {
		this.agujeros = agujeros;
	}
	
	public void cambiarEstado(State estado) {
		this.estado = estado;
	}
	
	public void recibirDisparo() {
		estado.recibirDisparo(this);
	}
	
	public void recibirCuracion() {
		estado.recibirCuracion(this);
	}
}
