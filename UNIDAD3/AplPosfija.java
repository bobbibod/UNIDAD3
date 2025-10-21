public class AplPosfija {

	public static void main(String[] args) {
		Posfija obj = new Posfija(20);
		if( obj.EvaluarPosfija("2147000000 2145000000+20 / 2 +")) {
			
			System.out.printf("Resultado %15.2f = ",obj.getRes());
		}
		System.out.println(obj.getMsg());
	}

}
