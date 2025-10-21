import java.util.Scanner;

public class AplCircular {
	static final  int tamaño=20;
	public static void main(String[] args) {
		
		ColaCir<Integer> colaCir = new ColaCir(tamaño);
		ColaCir<Integer> colaAux = new ColaCir(tamaño);
		
		int cont=0;
		
		while( colaCir.Insertar(++cont));
		int numero;
		Scanner in = new Scanner(System.in);
		while(true) {
			while(colaCir.Retirar() && colaAux.Insertar(colaCir.getDr())) {
				System.out.println(colaCir.getDr());
			}
			while(colaAux.Retirar() && colaCir.Insertar(colaAux.getDr()));
			System.out.println("Número a retirar (0 fin ejecución)");
			numero=in.nextInt();
			if(numero==0)
				break;
			System.out.println(Eliminar(colaCir,numero));
		}

	}
	private static boolean Eliminar(ColaCir<Integer> cc,int numero) {
		ColaCir<Integer> colaAux=new ColaCir(tamaño) ;
		boolean ban=false;
		while(cc.Retirar()) {
			if(cc.getDr()==numero) {
				ban=true;
				continue;
			}
			colaAux.Insertar(cc.getDr());
		}
		while(colaAux.Retirar() && cc.Insertar(colaAux.getDr()));
		return ban;
	}
}
