package ec.edu.ups.practica.dos.java;

import java.util.ArrayList;
import java.util.List;

public class Carrito extends Principal {
	
	private int totalValor;
	private int NumeroDeProductos;
	private ArrayList<Electronico> electronicos;
	private ArrayList<Ropa> ropas;

	
	public Carrito() {
		this.electronicos = new ArrayList<>();
	}
	
	public Carrito(int totalValor, int numeroDeProductos) {
		super();
		this.totalValor = totalValor;
		NumeroDeProductos = numeroDeProductos;
		this.electronicos = new ArrayList<>();
	}
	public void agregarElectronico(String marca, int precio, String añosDeGarantia, String modelo){
        electronicos.add(new Electronico(marca, precio, añosDeGarantia, modelo ));
	}
	public void agregarRopas(String marca, int precio, String talla, String color) {
	}

	
	public void setRopas(String k) {
				
	}

	public List<Ropa> getRopas() {
		return ropas;
	}

	public void setRopas(ArrayList<Ropa> ropas) {
		this.ropas = ropas;
	}
	@Override
	public String toString() {
		return "Carrito [totalValor=" + totalValor + ", NumeroDeProductos=" + NumeroDeProductos + "]";
	}


	
}

