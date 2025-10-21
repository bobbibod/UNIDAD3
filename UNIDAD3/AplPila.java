public class AplPila {
     
	public static void main(String[] args) {
		
		Pila<Integer> pila= new Pila(14);
		Pila<Integer> pilaAux= new Pila(14);
		Pila<Persona>    pilaPersonas=new Pila<Persona>(20); 
		
		System.out.println(pila.Insertar(new Integer(1)));
		System.out.println(pila.Insertar(2));
		for(int i=3; i<15 ; i++)
			System.out.println(pila.Insertar(i));
		

		while( pila.Retirar() ) {
			System.out.println(pila.getDr());
			
			pilaAux.Insertar(pila.getDr());
			
		}
		while(pilaAux.Retirar() && pila.Insertar(pilaAux.getDr()));
		
		System.out.println("La pila está vacía? "+pila.Vacia());
		System.out.println("La pila está llena? "+pila.Llena());
		
		while (pilaPersonas.Insertar(new Persona(
				Rutinas.nextNombre(2),
				Rutinas.nextInt(1,30),
				Rutinas.nextInt(150,210))));
		
		while(pilaPersonas.Retirar()) {
			//System.out.println(pilaPersonas.getDr().getNombre()+"  "+
			//		pilaPersonas.getDr().getEdad()+"  "+
			//		pilaPersonas.getDr().getEstatura());
					System.out.printf("%-40s %4d  %4d",pilaPersonas.getDr().getNombre(),
					pilaPersonas.getDr().getEdad(),
					pilaPersonas.getDr().getEstatura());
					System.out.println();
		}
		
		
	}

}
