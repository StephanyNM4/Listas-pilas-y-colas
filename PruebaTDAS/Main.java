//Miembros del grupo
//

package PruebaTDAS;
import TDAS_BASICOS.*;

public class Main {
    public static void main(String[] args) {
        COLA cola = new COLA();
        PILA mi_pila = new PILA();
    	LISTA mi_lista = new LISTA();
    	
    	mi_lista.INSERTA(mi_lista.PRIMERO(),"Carro" );
    	mi_lista.INSERTA(mi_lista.PRIMERO(),"Perro" );
    	mi_lista.INSERTA(mi_lista.PRIMERO(),"Caballo" );
    	
    	System.out.println("Probando lista");
    	mi_lista.LISTAR();
    	System.out.println("Probando Localizar");
    	  mi_lista.LOCALIZA("Caballo");
    	  mi_lista.LOCALIZA("Perro");
    	  mi_lista.LOCALIZA("Carro");
    	  
    	System.out.println("Probando suprime");
    	mi_lista.SUPRIME(1);
    	mi_lista.LISTAR();
    	
    	System.out.println("Probando posicion valida");
    	System.out.println(mi_lista.posValida(1100));
    	System.out.println("Probando posicion anterior");
    	System.out.println(mi_lista.ANTERIOR(6));
    	System.out.println("Probando posicion siguiente");
    	System.out.println(mi_lista.SIGUIENTE(1000));
    	System.out.println("Probando Recupera");
    	System.out.println(mi_lista.RECUPERA(0));
    	
    	System.out.println("Probando primero de L");
    	System.out.println(mi_lista.PRIMERO());
    	
    	System.out.println("Probando fin de L");
    	System.out.println(mi_lista.FIN());
    	
    	System.out.println("Probando vacia:");
    	System.out.println(mi_lista.VACIA());
    	
    	System.out.println("Probando anula:");
    	mi_lista.ANULA();
    	
    	System.out.println("Esta vacia la lista mi_lista: ");
    	System.out.println(mi_lista.VACIA());
    	
    	//PRUEBA DE COLA
    	System.out.println("\n PRUEBA DE COLA");
    	System.out.println("Probando pone en cola:");
    	 cola.PONE_COLA("Uno");
    	 cola.PONE_COLA("Dos");
    	 cola.PONE_COLA("Tres");
    	 cola.COLAR();
    	 System.out.println("Probando quitar de cola");
    	  cola.QUITA_DE_COLA();
    	  cola.COLAR();
    	  System.out.println("Probando frente");
    	  System.out.println(cola.FRENTE());
    	  System.out.println("Probando anula");
    	  cola.ANULA();
    	  System.out.println("Probando vacia");
    	  System.out.println(cola.VACIA());
    	  cola.COLAR();
    	 
    	  
    	  
    	
    	System.out.println(""); 
    	  System.out.println(""); 
    	  System.out.println("\n****Probando pila****"); 
    	  mi_pila.METE("Carro"); 
    	  mi_pila.METE("Perro"); 
    	  mi_pila.METE("Caballo"); 
    	  mi_pila.LISTAR_PILA(); 
    	 
    	  System.out.println(mi_pila.TOPE()); 
    	  mi_pila.SACA(); 
    	  System.out.println(mi_pila.TOPE()); 
    	  System.out.println(mi_pila.VACIA()); 
    	  mi_pila.ANULA(); 
    	  System.out.println(mi_pila.VACIA());
    	

    }
}
