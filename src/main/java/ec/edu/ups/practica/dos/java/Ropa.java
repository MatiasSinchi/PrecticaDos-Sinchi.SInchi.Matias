package ec.edu.ups.practica.dos.java;

public class Ropa extends Producto {
	

	private String talla;
	private String color;
	
	public Ropa() {		
	}
	

	public Ropa(String marca, int precio, String talla, String color) {
		super(marca, precio);
		this.talla = talla;
		this.color = color;
		
			}

	public Ropa(String marca, String talla, String color) {
		super();
		this.talla = talla;
		this.color = color;
	}

	

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Ropa [talla=" + talla + ", color=" + color + "]";
	}

}