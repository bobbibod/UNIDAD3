import java.util.Scanner;

public class AplCola {

	public static void main(String[] args) {
		Cola<String> cola=new Cola();
		
		System.out.println(cola.Insertar("Rocha"));
		System.out.println(cola.Insertar("Erik1"));
		System.out.println(cola.Insertar("Aguila8"));
		System.out.println(cola.Insertar("Erne"));
		System.out.println(cola.Insertar("MiguelA"));
		System.out.println(cola.Insertar("Roca"));
		System.out.println(cola.Insertar("Parra"));
		
		// imprimir el contenido de la cola
		Cola<String> colaAux = new Cola();
		while( cola.Retirar()) {
			System.out.println(cola.getDr());
			colaAux.Insertar(cola.getDr());
		
		}
		while ( colaAux.Retirar() && 
				cola.Insertar(colaAux.getDr()));
		
		Buscar(cola);
	}
	private static void Buscar(Cola<String> cola) {
		String nombre;
		Scanner in = new Scanner(System.in);
		Cola<String> colaAux=new Cola();
		
		while(true) {
			System.out.println("Nombre ");
			nombre=in.nextLine();
			if(nombre.equals("*"))
				break;
			boolean ban=false;
			while(cola.Retirar() && colaAux.Insertar(cola.getDr())) {
				if(nombre.equals(cola.getDr())) {
					ban=true;
					
				}
			}
			while(colaAux.Retirar() && cola.Insertar(colaAux.getDr()));
			if( ban) {
				System.out.println("ENCONTRÓ ");
			} else {
				System.out.println("No existe en la cola");
			}
				
			
			
		}
		
	}
	private static void RetirarXnombre(Cola<String> cola) {
		String nombre;
		Scanner in = new Scanner(System.in);
		Cola<String> colaAux=new Cola();

		while(true) {
			System.out.println("Nombre(* termina retirar");
			nombre=in.nextLine();
			if(nombre.equals("*"))
				break;
			boolean ban=false;
			while(cola.Retirar() ) {
				if(nombre.equals(cola.getDr())) {
					ban=true;
					break;
				}
				else {
				colaAux.Insertar(cola.getDr());
				}
			}
			while(cola.Retirar() && colaAux.Insertar(cola.getDr()));
			
			while(colaAux.Retirar() && cola.Insertar(colaAux.getDr()));
			if( ban) {
				System.out.println("ENCONTRÓ ");
			} else {
				System.out.println("No existe en la cola");
			}



		}

	}

}
