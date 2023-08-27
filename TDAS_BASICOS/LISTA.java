package TDAS_BASICOS;

// importamos el arreglo y las operaciones con la interfaz

import Almacenamiento.Arreglo;
import Interfaces.Interface_Lista;

public class LISTA implements Interface_Lista{

	private Arreglo arreglo = new Arreglo();
	
	//Creando metodos de lista
	
	/*Retorna copia del dato en la posicion p de la lista,
	 * siendo p un entero positivo asociado a la poscion del arreglo*/
	 @Override
	 public Object RECUPERA(int p) {//FUNCIONA
	  if(posValida(p)){
	    int tmp = arreglo.getInicio();
	   for(int i=0; i<p; i++){
	    tmp = arreglo.getSig(tmp);
	   }
	   return arreglo.getDato(tmp);
	  }else{
	   return null;
	  }
	  
	 }

	
	 /**
	  *Retorna la posicion p de la lista L donde se encuentra el dato X
	  *siendo X un elemento de tipo object, previamente almacenado en nuestra lista 
	  */
	@Override
	public int LOCALIZA(Object dato) {//FUNCIONA
		int posc_actual = arreglo.getInicio();
        int p = 1;
        while (posc_actual != -1) {
            if (dato.equals(arreglo.getDato(posc_actual))) {
            	System.out.println("Posicion: "+p);
                return p;
            }
            posc_actual = arreglo.getSig(posc_actual);
            p++;   
        }
        return -1;
        
	    }
	
	@Override
	public void SUPRIME(int p) {//FUNCIONA
		 int temp;
		    if (p == 1) { // p es una posicion de lista
		        temp = arreglo.getInicio(); // temp es un indice de una cubeta del arreglo
		        arreglo.setInicio(arreglo.getSig(temp));
		        arreglo.limpiarCubeta(temp);
		    } else {
		        int anterior = arreglo.obtenerIndiceCubetaAnterior(p);
		        int actual = arreglo.getSig(anterior);
		        while (actual != -1 && p > 2) { // Avanza al elemento en la posición a eliminar
		            anterior = actual;
		            actual = arreglo.getSig(actual);
		            p--;
		        }
		        if (actual != -1) { // Si encontró el elemento a eliminar
		            arreglo.setSig(arreglo.getSig(actual), anterior);
		            arreglo.limpiarCubeta(actual);
		        }
		    }
	}

	@Override
	public void INSERTA(int p, Object dato) {//FUNCIONA
		// Revisamos si hay espacio en el arreglo
		int espacio = arreglo.cubLibre();
		
		//si la posicion donde si donde se insertara es la primera
		if(p==1) {
			arreglo.setDato(dato, espacio);
			arreglo.setSig(arreglo.getInicio(), espacio);
			arreglo.setInicio(espacio);
			//Si es otra posicion 
		}else {
			int anterior = arreglo.obtenerIndiceCubetaAnterior(p);
			arreglo.setDato(dato, espacio);
			arreglo.setSig(arreglo.getSig(anterior), espacio);
			arreglo.setSig(espacio, anterior);
		}
		
		
		
	}

	@Override
	public int PRIMERO() {//FUNCIONA
		return 1;
	}

	@Override
	 public int FIN() {//FUNCIONA
	  int cont = 0;
	        for (int i = 0; i < arreglo.getTamanio(); i++) {
	            if(arreglo.getDato(i)!=null)
	             cont++;
	        }
	        return ++cont;
	 }

	//Retorna la posicion p-1 de la lista L, si la posicion no es valida retona -1
	 @Override
	    public int ANTERIOR(int p){//FUNCIONA
	        if(posValida(p)){
	   if(posValida(--p)){
	   return p;
	   }else{
	    return -1;
	   }
	  }else{
	   return -1;
	  }
	 }
	 
	 
	 
	 //Retorna la posicion p+1 de la lista L, si la posicion no es valida retona -1
	 @Override
	 public int SIGUIENTE(int p) {//FUNCIONA
	  if(posValida(p)){
	   if(posValida(++p)){
	    return p;
	   }else{
	    return -1;
	   }
	  }
	  return -1;
	 }
	 
	

	@Override
	public boolean VACIA() {//FUNCIONA
		return (arreglo.getInicio() == -1 ? true : false);
	}
	

	
	//******** 
	
	 @Override
	    public void LISTAR() {//FUNCIONA
	        int actual = arreglo.getInicio();
	        System.out.print("< ");
	        while (actual != -1) {
	            System.out.print(arreglo.getDato(actual));
	            actual = arreglo.getSig(actual);
	            if (actual != -1)
	                System.out.print(" , ");
	        }
	        System.out.print(" >\n\n");
	    }	
	
	 @Override
	 public void ANULA(){//FUNCIONA
	  arreglo.inicializar();
	  System.out.println("Anulada con exito");
	 }
    
	 //Retorna verdadero si la posicion en la lista es valida y falso si es el contrario
	 public boolean posValida(int p){//FUNCIONA
	  return ((p<0||p>arreglo.getTamanio())?false:true);
	 }
}
