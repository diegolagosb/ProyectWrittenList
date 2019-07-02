package gestionlistas;

import java.util.ArrayList;

public class Lista {

    private ArrayList<Estudiante> integranteListasEstudiantes;
    private ArrayList<Trabajador> integranteListasTrabajadores;
    private ArrayList<Deportista> integranteListasDeportistas;
    private String nombreLista;
    private Persona tipoLista;

    public Lista() {
        this.integranteListasEstudiantes = new ArrayList<Estudiante>();
        this.integranteListasTrabajadores = new ArrayList<Trabajador>();
        this.integranteListasDeportistas = new ArrayList<Deportista>();
    }

    public Lista(String nombreLista, Persona tipoLista) {
        this.integranteListasEstudiantes = new ArrayList<Estudiante>();
        this.integranteListasTrabajadores = new ArrayList<Trabajador>();
        this.integranteListasDeportistas = new ArrayList<Deportista>();
        this.nombreLista = nombreLista;
        this.tipoLista = tipoLista;
    }

    public ArrayList<Estudiante> getIntegranteListasEstudiantes() {
        return integranteListasEstudiantes;
    }

    public void setIntegranteListasEstudiantes(ArrayList<Estudiante> integranteListasEstudiantes) {
        this.integranteListasEstudiantes = integranteListasEstudiantes;
    }

    public ArrayList<Trabajador> getIntegranteListasTrabajadores() {
        return integranteListasTrabajadores;
    }

    public void setIntegranteListasTrabajadores(ArrayList<Trabajador> integranteListasTrabajadores) {
        this.integranteListasTrabajadores = integranteListasTrabajadores;
    }

    public ArrayList<Deportista> getIntegranteListasDeportistas() {
        return integranteListasDeportistas;
    }

    public void setIntegranteListasDeportistas(ArrayList<Deportista> integranteListasDeportistas) {
        this.integranteListasDeportistas = integranteListasDeportistas;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public Persona getTipoLista() {
        return tipoLista;
    }

    public void setTipoLista(Persona tipoLista) {
        this.tipoLista = tipoLista;
    }
}
