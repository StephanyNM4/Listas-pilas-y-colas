package TDAS_BASICOS;

import Interfaces.Interface_Cola;


public class COLA implements Interface_Cola {
    private LISTA lista = new LISTA();

    /**
     * Inserta el dato al final de la cola 
     */
 @Override
 public void PONE_COLA(Object dato) {
   lista.INSERTA(lista.FIN(), dato);
  
 }
 /**
  * Elimina el primer elemento de la cola
  */
 @Override
 public void QUITA_DE_COLA() {
    lista.SUPRIME(lista.PRIMERO());
  
 }
 /**
  * Convierte la cola en una cola vacia 
  */
 @Override
 public void ANULA() {
   lista.ANULA();
  
 }
 /**
  * Verifica si hay elementos en la cola retorna falso, de lo contrario retorna verdadero 
  */
 @Override
 public boolean VACIA() {
  return lista.VACIA();
 }
 /**
  * Retorna una copia del dato que esta al frente de la cola 
  */
 @Override
 public Object FRENTE() {
   return lista.RECUPERA(lista.PRIMERO());
 }
 /**
  * Hace una impresion de la cola 
  */
 @Override
 public void COLAR() {
    lista.LISTAR();
  
 }

}