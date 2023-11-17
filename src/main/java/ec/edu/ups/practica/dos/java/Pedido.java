package ec.edu.ups.practica.dos.java;

public class Pedido {
	private int valorTotal;
	
	public Pedido() {
		
	}

	public Pedido(int valorTotal) {
		super();
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Pedido [valorTotal=" + valorTotal + "]";
	}
	
	

}
