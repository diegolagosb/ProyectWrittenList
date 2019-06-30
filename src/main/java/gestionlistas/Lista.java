package gestionlistas;

import java.util.ArrayList;

public class Lista {

    private ArrayList<Persona> integranteListas;
    private String nombreLista;
    private String tipoLista;

    public Lista() {
        this.integranteListas = new ArrayList<Persona>();
    }

    public ArrayList<Persona> getIntegranteListas() {
        return integranteListas;
    }

    public void setIntegranteListas(ArrayList<Persona> integranteListas) {
        this.integranteListas = integranteListas;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public String getTipoLista() {
        return tipoLista;
    }

    public void setTipoLista(String tipoLista) {
        this.tipoLista = tipoLista;
    }
}
