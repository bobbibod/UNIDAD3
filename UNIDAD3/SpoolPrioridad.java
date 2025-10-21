public class SpoolPrioridad <T> extends Spool<T> {
	private Cola<T> spoolAux;
	public SpoolPrioridad() {
		this(20);
	}
	public SpoolPrioridad(int tamaño) {
		super(tamaño);
		spoolAux=new Cola(tamaño);
	}
	public boolean Enviar(T archivo) {

		boolean ban=false;
		String criterio, criterioNuevo=archivo.toString();
		while(Imprimir() ) {
			criterio=getDr().toString();
			
			if(!ban && criterioNuevo.compareTo(criterio)<=0) {
				spoolAux.Insertar(archivo);
				ban=true;
			}
			spoolAux.Insertar(getDr());
		}
		if(!ban) {
			spoolAux.Insertar(archivo);
			ban=true;
		}
		while(spoolAux.Retirar() && super.Enviar(spoolAux.getDr()));
		return ban;
	}

}
