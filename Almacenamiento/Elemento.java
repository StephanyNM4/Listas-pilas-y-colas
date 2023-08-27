package Almacenamiento;

public class Elemento {
    private Object dato;
    private int siguiente;

    
    public Object getDato() {
        return dato;
    }
    public void setDato(Object dato) {
        this.dato = dato;
    }
    public int getSig() {
        return siguiente;
    }
    public void setSig(int siguiente) {
        this.siguiente = siguiente;
    }

    
}
