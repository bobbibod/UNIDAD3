public class ColaCir <T> {
	private T [] cola;
	private T    dr;
	private int  frente,fin,tamaño;
	public ColaCir() {
		this(20);
	}
	public ColaCir(int tamaño) {
		this.tamaño=tamaño;
		cola=(T[]) new Object[tamaño];
		frente=fin=-1;
	}
	public boolean Insertar(T dato) {
		if(Llena())
			return false;
		if(fin==tamaño-1)
			fin=0;
		else
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
		if(frente==fin) {
			frente=fin=-1;
		} else {
			if(frente==tamaño-1) {
				frente=0;
			}else {
				frente++;
			}
		}
		return true;
	}
	public boolean Llena() {
		return frente==0 && fin==tamaño-1 || fin+1==frente;
	}
	public boolean Vacia() {
		return frente==-1;
	}
	public T getDr() {
		return dr;
	}

	
}
