package Interfaces;

public interface Interface_Lista{

    Object RECUPERA(int p);

    int LOCALIZA(Object dato);

    void SUPRIME(int p);

    void INSERTA(int p, Object dato);

    int PRIMERO();

    int FIN();

    int ANTERIOR(int p);
    
    int SIGUIENTE(int p);

    boolean VACIA();
    
    void LISTAR();

	void ANULA();

    //void ANULA();
}
