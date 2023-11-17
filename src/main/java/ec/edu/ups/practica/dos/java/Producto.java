package ec.edu.ups.practica.dos.java;


public class Producto {
	
	private String marca;
	private int precio;

	
	public Producto() {
		
	}

	public Producto(String marca, int precio) {
		super();
		this.marca = marca;
		this.precio = precio;
		

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", precio=" + precio + "]";
	}
	
}
