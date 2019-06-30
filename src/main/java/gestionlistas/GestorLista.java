package gestionlistas;

import java.util.ArrayList;

public class GestorLista {

    private ArrayList<Lista> listas;

    public GestorLista(){
        this.listas = new ArrayList<Lista>();
    }

    public void agregarLista(Lista lista){
        this.listas.add(lista);
    }

    public ArrayList<Lista> getListas() {
        return listas;
    }

    public void setListas(ArrayList<Lista> listas) {
        this.listas = listas;
    }
}
