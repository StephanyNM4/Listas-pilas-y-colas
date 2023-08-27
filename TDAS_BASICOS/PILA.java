package TDAS_BASICOS; 
 
import Interfaces.Interface_Pila; 
 
public class PILA implements Interface_Pila{ 
 
     
    private LISTA mi_lista = new LISTA(); 
    /** 
     * Retorna una copia del dato almacenado en el tope de la pila  
     */
    @Override 
    public Object TOPE(){ 
        return mi_lista.RECUPERA(mi_lista.PRIMERO()); 
    } 
    /** 
     * Agrega un nuevo elemento en el tope de la pila  
     */
    @Override 
    public void METE(Object dato){ 
        mi_lista.INSERTA(mi_lista.PRIMERO(), dato); 
    } 
    /** 
     *Elimina el elemento que esta almacenado en el tope de la pila  
     */
    @Override 
    public void SACA(){ 
        mi_lista.SUPRIME(mi_lista.PRIMERO()); 
    } 
    /** 
     * Retorna "true" si no hay elementos en la pila y "false" si es lo contrario 
     */
    @Override 
    public boolean VACIA(){ 
       return mi_lista.VACIA(); 
    } 
    /** 
     * Elimina todos los datos de la pila  
     */
    @Override 
    public void ANULA(){ 
        mi_lista.ANULA(); 
    } 
    /** 
     * Enlista los elementos contenidos en la pila 
     */
    @Override 
    public void LISTAR_PILA(){ 
        mi_lista.LISTAR(); 
    } 
}