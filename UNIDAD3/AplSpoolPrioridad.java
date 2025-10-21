

public class AplSpoolPrioridad {

	public static void main(String[] args) {
		SpoolPrioridad<ArchivoV2> sp= new SpoolPrioridad(10);
		System.out.println(sp.Enviar(new ArchivoV2("d1","doc",18,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d2","doc",2,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d3","doc",18,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d3","doc",10,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d4","doc",5,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d5","doc",3,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d6","doc",4,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d7","doc",18,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d4","abc",5,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d5","abc",3,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d6","abc",4,100,0)));
		System.out.println(sp.Enviar(new ArchivoV2("d7","abc",18,100,0)));
		
		while(sp.Imprimir())
			System.out.println(sp.getDr().getNombre()+"."+sp.getDr().getExtension()+"  "+sp.getDr().getNoComp()+" "+sp.getDr().getNoPaginasElemento());
	
	}

}
