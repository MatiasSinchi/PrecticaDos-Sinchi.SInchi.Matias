package ec.edu.ups.practica.dos.java;

public class Electronico extends Producto{
	
	private String añosDeGarantia;
	private String modelo;
	
	public Electronico() {
	}

	public Electronico(String añosDeGarantia, String modelo) {
		super();
		this.añosDeGarantia = añosDeGarantia;
		this.modelo = modelo;

	}

	public Electronico(String marca, int precio, String añosDeGarantia, String modelo) {
		super(marca, precio);
		this.añosDeGarantia = añosDeGarantia;
		this.modelo = modelo;

	}

	public String getAñosDeGarantia() {
		return añosDeGarantia;
	}

	public void setAñosDeGarantia(String añosDeGarantia) {
		this.añosDeGarantia = añosDeGarantia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}
	@Override
	public String toString() {
		return "Electronico [añosDeGarantia=" + añosDeGarantia + ", modelo=" + modelo + "]";
	}
	
}
