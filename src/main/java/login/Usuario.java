package login;

public class Usuario {

	private String nombreUsuario;
	private String contrasenia;

	public Usuario() {
		// TODO - implement Usuario.Usuario
		throw new UnsupportedOperationException();
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	/**
	 * 
	 * @param nombreUsuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	/**
	 * 
	 * @param contrasenia
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

}