public class Spool<T> {
	private Cola<T> spool;
	private T       dr;
	
	public Spool() {
		this(20);
	}
	public Spool(int tamaño) {
		spool=new Cola(tamaño);
	}
	public boolean Enviar(T archivo) {
		return spool.Insertar(archivo);

	}
	public boolean Imprimir() {
		if( !spool.Retirar())
			return false;
		dr=spool.getDr();
		return true;
	}
	public T getDr() {
		return dr;
	}



	
	
}
