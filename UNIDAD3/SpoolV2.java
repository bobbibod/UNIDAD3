/*
PROYECTO: Spool
Nombre:Miguel Angel Aponte Felix
Matricula:24170472
Materia:Estructura de Datos
Profesor:Dr.Clemente Garcia Gerardo
*/
public class SpoolV2 {
	public static void main(String[] args) {
		int tamanoSpool = 30;
		int noDeArchivos = Rutinas.nextInt(1, 10);
		Spool<ArchivoV2> sp = new Spool(tamanoSpool);
		Cola<ArchivoV2> cAux = new Cola(tamanoSpool);
		String[] Extensiones = { "WORD", "PDF", "DOC" };
		boolean ban = false;

		System.out.println("Total de Archivos " + noDeArchivos);

		for (int j = 0; j < noDeArchivos; j++) {
			int totalPaginas = Rutinas.nextInt(1, 500);
			int random = Rutinas.nextInt(1, 10);
			int IndiceExt = Rutinas.nextInt(0, 2);
			int numeroComp = Rutinas.nextInt(1, 10);
			int numElementos = (totalPaginas / 100) + ((totalPaginas % 100 > 0) ? 1 : 0);
			for (int i = 0; i < numElementos; i++) {
				if (totalPaginas % 100 > 0 && i == numElementos - 1) {
					ArchivoV2 ar = new ArchivoV2("D" + random, Extensiones[IndiceExt], numeroComp, totalPaginas,
							totalPaginas % 100);
					ban = cAux.Insertar(ar);

				} else {
					ArchivoV2 ar = new ArchivoV2("D" + random, Extensiones[IndiceExt], numeroComp, totalPaginas,
							100);
					ban = cAux.Insertar(ar);
				}
			}
		}
		while (ban == false && cAux.Retirar());
		if (ban == false) {
			System.out.println("Spool insuficiente para procesar " + noDeArchivos);
		}

		while (cAux.Retirar() && sp.Enviar(cAux.getDr())) {
			System.out.println(cAux.getDr());
		}
	}
}