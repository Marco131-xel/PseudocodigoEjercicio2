import java.util.* ;
public class Ejercicio2{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("");
		System.out.println("*********Ejercicio2************");
		System.out.println("");
        System.out.println("Ingrese un numero");
		numero = scanner.nextInt();
		
		System.out.println("Numeros del " + numero + " al 1 utilizando for: ");
		for(int i = numero; i >= 1; i--){
			System.out.println(i);
			
		}
		
	}
}