
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int resultado = 0;
		ArrayList<Integer> matrizNumero = new ArrayList<>();
		
		do {
			
			System.out.print("Introduce un número");
			numero = teclado.nextInt();
			
			if (numero>=0) {
				
				matrizNumero.add(numero);
				System.out.println("Introduce una más bajo");
				
			
			}
			
			
		} while (!(numero<0));
		
		System.out.println("El número de intendos ha sido "+matrizNumero.size());
		
		for (int i=0;i<matrizNumero.size();i++) {
			
			resultado = matrizNumero.get(i) + resultado;
			
		}
		
			resultado = resultado / matrizNumero.size();			
			System.out.println("La media de los números introducidos es "+resultado);

		
	}

}
