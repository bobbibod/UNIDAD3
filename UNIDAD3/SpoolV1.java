

public class SpoolV1 {
	public static void main(String[] args) {
		int tamanoSpool = 30;
		int noDeArchivos = Rutinas.nextInt(1,10);
		Spool<ArchivoV2> sp = new Spool(tamanoSpool);
		Spool<ArchivoV2> spAux = new Spool(tamanoSpool);
		String[] Extensiones = { "WORD", "PDF", "DOC" };

		System.out.println("Total de Archivos " + noDeArchivos);
		System.out.println("Tamano Spool " + tamanoSpool);

		for (int j = 0; j < noDeArchivos; j++) {
			int totalPaginas = Rutinas.nextInt(1, 500);
			int random = Rutinas.nextInt(1, 15);
			int IndiceExt = Rutinas.nextInt(0, 2);
			
			if (tamanoSpool<0) {
				System.out.println("SPOOL LLENO");
				break;
			}

			for (int i = 0; i < totalPaginas / 100; i++) {
				spAux.Enviar(new ArchivoV2("D" + random, Extensiones[IndiceExt], 10, totalPaginas, 100));
				tamanoSpool--;
			}

			if (totalPaginas % 100 > 0) {
				spAux.Enviar(new ArchivoV2("D" + random, Extensiones[IndiceExt], 10, totalPaginas, totalPaginas % 100));
				tamanoSpool--;
			}
			
			System.out.println("ESPACIO RESTANTE EN EL SPOOL: " + tamanoSpool);
	
	
	}
	while (spAux.Imprimir() && sp.Enviar(spAux.getDr())) {
			System.out.println(spAux.getDr());
			tamanoSpool = tamanoSpool + 1;
		}
}
}