package Almacenamiento;

public class Arreglo {
    
    private int cab;
    private Elemento[] arreglo = new Elemento[1000];

    public Arreglo(){
        this.cab= -1;
        for(int i=0; i<arreglo.length; i++){
            arreglo[i]= new Elemento();
        }
        for(int i=0; i<arreglo.length; i++){
            arreglo[i].setDato(null);
            arreglo[i].setSig(-1);
        }
    }

    public void inicializar() {
        cab = -1; // Establece el valor de cabeza en -1.

        // Itera sobre cada elemento del arreglo y establece sus valores a nulo.
        for (Elemento elem : arreglo) {
            elem.setDato(null);
            elem.setSig(-1);
        }
    }

    public int cubLibre(){ 
        int indice = -1;
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i].getDato() == null){
                indice=i;
                break;
            }
        }
        return indice;
    }

    public int obtenerIndiceCubetaAnterior(int posicionLista) {
        int indiceActual = cab;
        int indiceAnterior = cab;
        int contador = 0;

        while (indiceActual != -1) {
            contador++;

            if (contador + 1 == posicionLista) {
                return indiceAnterior;
            }

            indiceAnterior = indiceActual;
            indiceActual = arreglo[indiceActual].getSig();
        }

        return -1;
    }

    public void limpiarCubeta(int indice) {
        Elemento elemento = arreglo[indice]; // Obtiene el elemento en la posición "indice".
        elemento.setDato(null); // Establece el dato del elemento en "null".
        elemento.setSig(-1); // Establece el puntero del elemento en "-1".
    }

    public int getInicio(){
        return cab;
    }

    public void setInicio(int ind){
        this.cab= ind;
    }

    public Object getDato(int indice) {
        Elemento elemento = arreglo[indice]; // Obtiene el elemento en la posición "indice".
        Object dato = elemento.getDato(); // Obtiene el dato del elemento.
        return dato; // Retorna el dato obtenido.
    }

    public void setDato(Object dato, int indice) {
        Elemento elemento = arreglo[indice]; // Obtiene el elemento en la posición "indice".
        elemento.setDato(dato); // Establece el dato del elemento en "dato".
    }

    public int getSig(int indice) {
        Elemento elemento = arreglo[indice]; // Obtiene el elemento en la posición "indice".
        int siguiente = elemento.getSig(); // Obtiene el puntero del elemento.
        return siguiente; // Retorna el puntero obtenido.
    }

    public void setSig(int sig, int indice) {
        Elemento elemento = arreglo[indice]; // Obtiene el elemento en la posición "indice".
        elemento.setSig(sig); // Establece el puntero del elemento en "sig".
    }

    public int getTamanio(){
        return arreglo.length;
    }
   
    public int getCubetaLibre() {
        int indice = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].getDato() == null) {
                indice = i;
                return indice;
            }
        }
        return indice;
    }
}
