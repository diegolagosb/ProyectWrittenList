package gestionlistas;

public class Persona {

	private String nombre;
	private String apellido;
	private String segundoApellido;
	private String rut;
	private String correo;

	public Persona() {

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}


	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getRut() {
		return this.rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return this.correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Nombre;Apellido;Sgdo.Apellido;Rut;Correo;";
	}
}