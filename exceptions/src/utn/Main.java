/**
 * 
 */
package utn;

/**
 * @author gvolpe
 *
 */
public class Main {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 5;
		
		Objeto objeto = new Objeto();
		
		try {
			objeto.sumar(a, b);
			objeto.mostrar(a, b);
		} catch (MyRulesException e) {
			System.out.println("error 1");
		} catch (MyNewException e) {
			System.out.println("error 2");
		}		
	}
}
