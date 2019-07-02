package dominioproblema;

public class Trabajador extends Persona {

    private String numTelefonico;
    private String empresa;
    private String areaTrabajo;
    private String rol;
    private String tipoContrato;

    public Trabajador() {
        super();
    }

    public String[] datosTabla(){
        String[] datosTabla = toString().split(";");
        return datosTabla;
    }

    @Override
    public String toString() {
        return super.toString()+"Num.Teléfono;Empresa;Area Trabajo;Rol;Tipo Contrato";
    }

    public String getNumTelefonico() {
        return this.numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getAreaTrabajo() {
        return this.areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTipoContrato() {
        return this.tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

}