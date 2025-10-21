import java.util.Scanner;

public class SpoolV1 {
	public static void main(String[] args) {
		Spool<ArchivoV2> sp= new Spool(10);
		int random=Rutinas.nextInt(1,10);
		String [] Extensiones={"WORD","PDF","DOC",""};
		for(int j=0 ; j<3 ; j++) {
			int totalPaginas=Rutinas.nextInt(1,500);
			for(int i=0 ; i< totalPaginas/100;i++) {
				
				System.out.println(sp.Enviar(new ArchivoV2("D"+random,"WORD",10,totalPaginas,100) )  );

			}
			if(totalPaginas%100 > 0 ) {
				System.out.println(sp.Enviar(new ArchivoV2("D1","WORD",10,totalPaginas,totalPaginas%100) )  );

			}	

		}

}

}