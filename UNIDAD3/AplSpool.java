public class AplSpool {

	public static void main(String[] args) {
		Spool <Archivo> s = new Spool(10);
		Spool <Archivo> sAux = new Spool(10);
		
		System.out.println(s.Enviar(new Archivo("D1","WORD",10,56)));
		System.out.println(s.Enviar(new Archivo("D2","WORD",10,56)));
		System.out.println(s.Enviar(new Archivo("D3","WORD",10,56)));
		System.out.println(s.Enviar(new Archivo("D4","WORD",10,56)));
		System.out.println(s.Enviar(new Archivo("D5","WORD",10,56)));

		while(s.Imprimir()  && sAux.Enviar(s.getDr()))
		   System.out.println(s.getDr().getNombre()+"."+s.getDr().getExtension());
		while(sAux.Imprimir()  && s.Enviar(sAux.getDr()));
		System.out.println("______");
		while(s.Imprimir()  && sAux.Enviar(s.getDr()))
			   System.out.println(s.getDr().getNombre()+"."+s.getDr().getExtension());
	}

	

}
