package ec.edu.ups.practica.dos.java;

public class Usuario {
	
	private String cedulaIdentificacion;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Usuario() {
		
	}

	public Usuario(String cedulaIdentificacion, String nombre, String apellido, int edad) {
		super();
		this.cedulaIdentificacion = cedulaIdentificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getCedulaIdentificacion() {
		return cedulaIdentificacion;
	}

	public void setCedulaIdentificacion(String cedulaIdentificacion) {
		this.cedulaIdentificacion = cedulaIdentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void registrarUsuario(String cedulaIdentificacion, String nombre, String apellido, int edad) {
		this.cedulaIdentificacion = cedulaIdentificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuario [cedulaIdentificacion=" + cedulaIdentificacion + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + "]";
	}
}
