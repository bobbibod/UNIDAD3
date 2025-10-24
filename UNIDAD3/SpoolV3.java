/*
PROYECTO: Spool
Nombre:Miguel Angel Aponte Felix
Matricula:24170472
Materia:Estructura de Datos
Profesor:Dr.Clemente Garcia Gerardo
*/
public class SpoolV3 {
	public static void main(String[] args) {
		int tamanoSpool = Rutinas.nextInt(20, 30);
		int noDeArchivos = Rutinas.nextInt(1, 15);
		Spool<ArchivoV2> sp = new Spool(tamanoSpool);
		Cola<ArchivoV2> cAux = new Cola(tamanoSpool);
		String[] Extensiones = { "WORD", "PDF", "DOC" };
		boolean ban = false, cabe = true;

		System.out.println("Total de Archivos " + noDeArchivos);

		for (int j = 0; j < noDeArchivos; j++) {
			int totalPaginas = Rutinas.nextInt(1, 500);
			int random = Rutinas.nextInt(1, 30);
			int IndiceExt = Rutinas.nextInt(0, 2);
			int numeroComp = Rutinas.nextInt(1, 10);
			int numElementos = (totalPaginas / 100) + ((totalPaginas % 100 > 0) ? 1 : 0);
			int elementosInsertados=0;
			String archivoAborrar = "";
			ArchivoV2 ar;

			for (int i = 0; i < numElementos; i++) {
				if (totalPaginas % 100 > 0 && i == numElementos - 1) {
					ar = new ArchivoV2("D" + random, Extensiones[IndiceExt], numeroComp, totalPaginas,
							totalPaginas % 100);
				} else {
					ar = new ArchivoV2("D" + random, Extensiones[IndiceExt], numeroComp, totalPaginas,
							100);
				}
				elementosInsertados++;

				if (!sp.Enviar(ar)) {
					for(int k=0;k<tamanoSpool-elementosInsertados;k++){
						sp.Imprimir();
						cAux.Insertar(sp.getDr());
					}
					while (sp.Imprimir());
				}
				while(cAux.Retirar() && sp.Enviar(cAux.getDr()));
			}
		}
		System.out.println("ESTADO ACTUAL DEL SPOOL");
		EstadoActual(sp);
		System.out.println("____________________");
		System.out.println("ESTADO DEL SPOOL");
		while (sp.Imprimir()) {
			System.out.println(sp.getDr());
		}
	}
	public static void EstadoActual(Spool<ArchivoV2> sp) {
		Cola<ArchivoV2> cAux=new Cola(20);
		int contadorPaginas=0,acu=0;
		while(sp.Imprimir() && cAux.Insertar(sp.getDr())) {
			if(acu==0) {
				contadorPaginas=sp.getDr().getNoPaginas();
			}
			acu+=sp.getDr().getNoPaginasElemento();
			if(acu==contadorPaginas) {
				acu=0;
				System.out.println(sp.getDr().getNombre()+"  "+sp.getDr().getNoPaginas());
			}	
		}
		while(cAux.Retirar() && sp.Enviar(cAux.getDr())); 
			
	}
}