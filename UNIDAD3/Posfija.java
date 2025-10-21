public class Posfija {
	private Pila<Double> pila;
	private Pila<Integer> pilaDigitos;
	private String msg;
	private double res=0;
	
	public Posfija() {
		this(20);
	}
	public Posfija(int tamaño) {
		pila=new Pila(tamaño);
		pilaDigitos=new Pila(15);
	}
	public boolean EvaluarPosfija(String expPosfija) {
		char car;
		int digito;
		for(int i= 0 ; i<expPosfija.length() ; i++) {
			car=expPosfija.charAt(i);
			if( Character.isDigit(car)) {
				digito=Integer.parseInt(car+"");
				if( ! pilaDigitos.Insertar( digito) ) {
					msg="La expresión no se puede evaluar, tamaño pila insuficiente";
					return false;
				}
				continue;
			}
			if( !pilaDigitos.Vacia() ) {
				
				double cantidad=Convierte();
				if( !pila.Insertar(cantidad)) {
					msg="La expresión no puede evaluarse, capacidad de pila no suficiente";
					return false;
				}
				
			}
			
			if( "+-*/".indexOf(car)==-1)
				continue;
			if( ! pila.Retirar()) {
				msg="Expresión posfija incorrecta....";
				return false;
			}
			double num2=pila.getDr();
			if( ! pila.Retirar()) {
				msg="Expresión posfija incorrecta....";
				return false;
			}
			double num1=pila.getDr();
			
			switch (car) {
			case '+': res=num1+num2;break;
			case '-': res=num1-num2;break;
			case '*': res=num1*num2;break;
			case '/': res=num1/num2;break;
			
			}
			pila.Insertar(res);
		}
		pila.Retirar();
		if(!pila.Vacia()) {
			msg="La expresion posfija es incorrecta";
			return false;
		}
		res=pila.getDr();
		return true;
		
	}
	private double Convierte() {
		double res=0;
		long fact=1;
		while( pilaDigitos.Retirar()) {
			res+=fact*pilaDigitos.getDr();
			fact*=10;
		}
		return res;
	}
	public boolean Evaluar(String expPosfija) {
		char car;
		int digito;
		for(int i= 0 ; i<expPosfija.length() ; i++) {
			car=expPosfija.charAt(i);
			if( Character.isDigit(car)) {
				digito=Integer.parseInt(car+"");
				if( ! pila.Insertar( (double)digito) ) {
					msg="La expresión no se puede evaluar, tamaño pila insuficiente";
					return false;
				}
				continue;
			}
			if( "+-*/".indexOf(car)==-1)
				continue;
			if( ! pila.Retirar()) {
				msg="Expresión posfija incorrecta....";
				return false;
			}
			double num2=pila.getDr();
			if( ! pila.Retirar()) {
				msg="Expresión posfija incorrecta....";
				return false;
			}
			double num1=pila.getDr();
			
			switch (car) {
			case '+': res=num1+num2;break;
			case '-': res=num1-num2;break;
			case '*': res=num1*num2;break;
			case '/': res=num1/num2;break;
			
			}
			pila.Insertar(res);
		}
		pila.Retirar();
		if(!pila.Vacia()) {
			msg="La expresion posfija es incorrecta";
			return false;
		}
		res=pila.getDr();
		return true;
		
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public double getRes() {
		return res;
	}
	public void setRes(double res) {
		this.res = res;
	}
	
	
}
