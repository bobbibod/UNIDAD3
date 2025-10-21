

public class Parentesis {
	private Pila<Character> pila;
	private String msg;
	
	public Parentesis(int tamaño) {
		pila=new Pila(tamaño);
	}
	
	public boolean Checar(String expresion) {
		char car;
		for(int i=0 ; i<expresion.length(); i++) {
			car=expresion.charAt(i);
            if( "(<{[]}>)".indexOf(car)== -1) {
            	continue;
            }
            if( "(<{[".indexOf(car)>=0) {
            	if( pila.Insertar(car)  ) {
            		continue;
            	}
            	msg="El tamaño de la pila es insuficiente para solucionar la expresion";
            	return false;
            } 
            // es parentesis que cierra
            if( !pila.Retirar()) {
            	msg="Hay parentesis cerrando sin que haya abiertos";
            	return false;
            }
            // validar si car y dr son parejas
            boolean band=true; 
//            if(car== ')' &&  pila.getDr()!='(' ||
//               car== ']' &&  pila.getDr()!='[' ||
//               car== '>' &&  pila.getDr()!='<' ||
//               car== '}' &&  pila.getDr()!='{' 
//            		)
            if("]}>)".indexOf(car)!= "[{<(".indexOf(pila.getDr()))
            {
            	 msg="Un "+pila.getDr()+" se cierra incorrecto con "+car;
            	 return false;
            }
          
		}
		if(!pila.Vacia()) {
			msg="Quedaron parentesis sin cerrar";
			return false;
		}
		msg="Expresión correcta";
		return true;
	}
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
