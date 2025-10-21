import java.util.Random;
import java.util.Scanner;

public class SpoolV1 {
	public static void main(String[] args) {
		int tamanoSpool=30;
		Spool<ArchivoV2> sp= new Spool(tamanoSpool);
		
		String [] Extensiones={"WORD","PDF","DOC"};
		int noDeArchivos=Rutinas.nextInt(10);
	
		for(int j=0 ; j<noDeArchivos ; j++) {
			int totalPaginas=Rutinas.nextInt(1,500);
			int random=Rutinas.nextInt(1,10);
			int IndiceExt=Rutinas.nextInt(0,2);
			System.out.println();
			for(int i=0 ; i< totalPaginas/100;i++) {
				sp.Enviar(new ArchivoV2("D"+random,Extensiones[IndiceExt],10,totalPaginas,100) );
					tamanoSpool--;
			}
		
			if(totalPaginas%100 > 0 ) {
				sp.Enviar(new ArchivoV2("D"+random,Extensiones[IndiceExt],10,totalPaginas,totalPaginas%100) );
					tamanoSpool--;
			}
			System.out.println("ESPACION RESTANTE EN EL SPOOL: "+tamanoSpool);
		}
		while(sp.Imprimir()){
			System.out.println(sp.getDr());
			tamanoSpool=tamanoSpool+1;}
	
	System.out.println(tamanoSpool);

}

}