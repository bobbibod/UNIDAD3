public class AplParentesis {

	public static void main(String[] args) {
		Parentesis obj = new Parentesis(3);
		
			boolean res=obj.Checar("[[(>()()]]");
			if( !res) {
			System.out.println(obj.getMsg());
			System.out.println("Corrija la expresión e intente d enuevo");
			}
	}
}
