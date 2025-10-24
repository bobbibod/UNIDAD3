/*
PROYECTO: Spool
Nombre:Miguel Angel Aponte Felix
Matricula:24170472
Materia:Estructura de Datos
Profesor:Dr.Clemente Garcia Gerardo
*/
public class SpoolV1 {
	public static void main(String[] args) {
		int tamanoSpool = Rutinas.nextInt(10,30);
		int espaciosDisp=tamanoSpool;
		int noElementosOcupados=0;
		int noDeArchivos = Rutinas.nextInt(1,10);
		Spool<ArchivoV2> sp = new Spool(tamanoSpool);
		String[] Extensiones = { "WORD", "PDF", "DOC" };
		System.out.println("Total de Archivos " + noDeArchivos);
		System.out.println("Tamano Spool " + tamanoSpool);
		for (int j = 0; j < noDeArchivos; j++) {
			int totalPaginas = Rutinas.nextInt(1, 500);
			int random = Rutinas.nextInt(1, 10);
			int IndiceExt = Rutinas.nextInt(0, 2);
			int noComp = Rutinas.nextInt(1, 10);
			int noElementos = (totalPaginas / 100) + ((totalPaginas % 100 > 0) ? 1 : 0);
			if(noElementos>espaciosDisp){
				System.out.println("Espacio insuficiente spool");
				break;
			}
			for (int i = 0; i < noElementos; i++) {
				if (totalPaginas % 100 > 0 && i == noElementos - 1) {
					ArchivoV2 ar = new ArchivoV2("D" + random, Extensiones[IndiceExt], noComp, totalPaginas,totalPaginas % 100);
					 sp.Enviar(ar);
				} else {
					ArchivoV2 ar = new ArchivoV2("D" + random, Extensiones[IndiceExt], noComp, totalPaginas,100);
					sp.Enviar(ar);
				}
				espaciosDisp--;
			}
			noElementosOcupados++;
		}
	while (sp.Imprimir()) {
			System.out.println(sp.getDr());
		}
}
}