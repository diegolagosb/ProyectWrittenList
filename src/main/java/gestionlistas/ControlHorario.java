package gestionlistas;

public class ControlHorario {

	private Trabajador trabajador;
	private String fecha;
	private String observacionEntrada;
	private String observacionSalida;

	public ControlHorario() {
		// TODO - implement ControlHorario.ControlHorario
		throw new UnsupportedOperationException();
	}

	public String getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getObservacionEntrada() {
		return this.observacionEntrada;
	}

	/**
	 * 
	 * @param observacionEntrada
	 */
	public void setObservacionEntrada(String observacionEntrada) {
		this.observacionEntrada = observacionEntrada;
	}

	public String getObservacionSalida() {
		return this.observacionSalida;
	}

	/**
	 * 
	 * @param observacionSalida
	 */
	public void setObservacionSalida(String observacionSalida) {
		this.observacionSalida = observacionSalida;
	}

}