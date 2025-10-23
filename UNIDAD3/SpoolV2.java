public class SpoolV2 {
    public static void main(String[] args) {
		int tamanoSpool = Rutinas.nextInt(20, 30);
		int noDeArchivos = Rutinas.nextInt(1,10);
		Spool<ArchivoV2> sp = new Spool(tamanoSpool);
		Spool<ArchivoV2> spAux = new Spool(tamanoSpool);
		String[] Extensiones = { "WORD", "PDF", "DOC" };

		System.out.println("Total de Archivos " + noDeArchivos);
		System.out.println("Tamano Spool " + tamanoSpool);

		for (int j = 0; j < noDeArchivos; j++) {
			int totalPaginas = Rutinas.nextInt(1, 500);
			int random = Rutinas.nextInt(1, 10);
			int IndiceExt = Rutinas.nextInt(0, 2);
			int numElementos=(totalPaginas/100)+((totalPaginas%100>0)?1:0);
			int paginasPorElemento=100;
			for (int i = 0; i <numElementos; i++) {
			 	if (i==numElementos-1) {
					
				}

			}

			
		}
			
			System.out.println("ESPACIO RESTANTE EN EL SPOOL: " + tamanoSpool);
		
		while (spAux.Imprimir() && sp.Enviar(spAux.getDr())) {
			System.out.println(spAux.getDr());
		}

		System.out.println(tamanoSpool);

	}
    
}
