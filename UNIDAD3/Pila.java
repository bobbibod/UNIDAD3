public class Pila <T> {
	private int tope,maximo;
	
	private T [] pila;
	private T dr;
	

	public Pila() {
		this(10);
	}
	public Pila(int maximo) {
		this.maximo=maximo;
		tope=-1;
		pila=(T[]) new Object[maximo];
	}
	public boolean Insertar(T dato) {
		if( Llena())
			return false;
		/*
		tope=tope+1;
		pila[tope]=dato;
		*/
		pila[++tope]=dato;
		
		return true;
	}
	public boolean Retirar() {
		if(Vacia())
			return false;
		dr=pila[tope];
		pila[tope--]=null;
		return true;
	}
	public boolean Llena() {
/*		
		if( tope==maximo-1)
			return true;
		return false;
*/
		//return tope==maximo-1?true:false;
		
		return tope==maximo-1;
	}
	public boolean Vacia() {
		return tope==-1;
	}
	public T getDr() {
		return dr;
	}
}
