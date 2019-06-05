package gestionlistas;

public class FichaMedica {

	private Deportista deportista;
	private double peso;
	private double altura;
	private String actividadFisica;
	private String alergia;

	public FichaMedica() {
		// TODO - implement FichaMedica.FichaMedica
		throw new UnsupportedOperationException();
	}

	public double getPeso() {
		return this.peso;
	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return this.altura;
	}

	/**
	 * 
	 * @param altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getActividadFisica() {
		return this.actividadFisica;
	}

	/**
	 * 
	 * @param actividadFisica
	 */
	public void setActividadFisica(String actividadFisica) {
		this.actividadFisica = actividadFisica;
	}

	public String getAlergia() {
		return this.alergia;
	}

	/**
	 * 
	 * @param alergia
	 */
	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

}