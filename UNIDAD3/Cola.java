public class Cola <T>{

	private int frente,fin, tamaño;
	private T   dr;
	private T [] cola;
	
	public Cola() {
		this(20);
	}
	public Cola(int tamaño) {
		frente=fin=-1;
		cola=(T[]) new Object[tamaño];
		this.tamaño=tamaño;
	}
	public boolean Insertar(T dato) {
		if( Llena())
			return false;
		fin++;
		cola[fin]=dato;
		if(frente==-1)
			frente=0;
		return true;
	}
	public boolean Retirar() {
		if(Vacia())
			return false;
		dr=cola[frente];
		cola[frente]=null;
		if(frente==fin)
			frente=fin=-1;
		else
			frente++;
		
		return true;
	}
	public boolean Llena() {
		return  fin==tamaño-1;
	}
	public boolean Vacia() {
		return fin==-1;
	}
	public T getDr() {
		return dr;
	}

}
