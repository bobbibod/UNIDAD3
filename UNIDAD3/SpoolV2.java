public class SpoolV2 {
    public static void main(String[] args) {
		int tamanoSpool = 30;
		int noDeArchivos = Rutinas.nextInt(1,10);
		Spool<ArchivoV2> sp = new Spool(tamanoSpool);
		Spool<ArchivoV2> spAux = new Spool(tamanoSpool);
		String[] Extensiones = { "WORD", "PDF", "DOC" };
		boolean ban=false;

		System.out.println("Total de Archivos " + noDeArchivos);
		System.out.println("Tamano Spool " + tamanoSpool);

		for (int j = 0; j < noDeArchivos; j++) {
			int totalPaginas = Rutinas.nextInt(1, 500);
			int random = Rutinas.nextInt(1, 10);
			int IndiceExt = Rutinas.nextInt(0, 2);
			int numeroComp=Rutinas.nextInt(1,10);
			int numElementos=(totalPaginas/100)+((totalPaginas%100>0)?1:0);
			int paginasPorElemento=100;
			for (int i = 0; i <numElementos; i++) {
			 	if (totalPaginas%100>0 && i==numElementos-1) {
					ArchivoV2 ar=new ArchivoV2("D" + random, Extensiones[IndiceExt], numeroComp, totalPaginas, totalPaginas % 100);
					ban=spAux.Enviar(ar);
					
				}
				else{
					ArchivoV2 ar=new ArchivoV2("D" + random, Extensiones[IndiceExt],numeroComp, totalPaginas, paginasPorElemento);
					ban=spAux.Enviar(ar);
					
				}
		}
	}
	while (ban==false && spAux.Imprimir());
		

    while (spAux.Imprimir() && sp.Enviar(spAux.getDr())) {
			System.out.println(spAux.getDr());
		}
}
}