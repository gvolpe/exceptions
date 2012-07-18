package utn;

public class Objeto {

	public Objeto() {		
	}
	
	public int sumar(int a, int b) throws MyNewException, MyRulesException {
		try {
			if (a < 3)
				throw new MyRulesException();
			else if (b > 10)
				throw new MyNewException();
			else
				return a+b;
		} catch (Exception e) {
			System.out.println("error 3");
			throw new MyNewException();
		}
	}
	
	public void mostrar(int a, int b) {
		System.out.println(a + " y " + b);
	}	
}
