package encapsulamiento;

public class Miclase {
	
	private int tipo; //no quiero que se acceda mas alla de mis metodos uno que lee y otro que entrega
	
	public void setTipo(int t){
	tipo = t;
	}
	
	public int getTipo() {
		return tipo;
	}
}
