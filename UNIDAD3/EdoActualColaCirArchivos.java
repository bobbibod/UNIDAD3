public class EdoActualColaCirArchivos {

	public static void main(String[] args) {
		ColaCir<ArchivoV2> cc=new ColaCir(200);
	
		
		int [] arreglo= {218,318,418};
		for(int j=0 ; j<3 ; j++) {
			int totalPaginas=arreglo[j];
			//ArchivoV2 archivo=new ArchivoV2("D1","WORD",10,totalPaginas,0);
			for(int i=0 ; i< totalPaginas/100;i++) {
				
				System.out.println(cc.Insertar(new ArchivoV2("D1","WORD",10,totalPaginas,100) )  );

			}
			if(totalPaginas%100 > 0 ) {
				System.out.println(cc.Insertar(new ArchivoV2("D1","WORD",10,totalPaginas,totalPaginas%100) )  );

			}	

		}
		EstadoActual(cc);
		System.out.println("___________");
		while(cc.Retirar())
			System.out.println(cc.getDr());
		
	}
	public static void EstadoActual(ColaCir<ArchivoV2> cc) {
		ColaCir<ArchivoV2> ccAux=new ColaCir(20);
		int contadorPaginas=0,acu=0;
		while(cc.Retirar() && ccAux.Insertar(cc.getDr())) {
			if(acu==0) {
				contadorPaginas=cc.getDr().getNoPaginas();
			}
			acu+=cc.getDr().getNoPaginasElemento();
			if(acu==contadorPaginas) {
				acu=0;
				System.out.println(cc.getDr().getNombre()+"  "+cc.getDr().getNoPaginas());
			}
				
		}
		while(ccAux.Retirar() && cc.Insertar(ccAux.getDr())); 
			
		
	}
}
