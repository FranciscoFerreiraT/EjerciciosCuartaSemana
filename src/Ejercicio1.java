import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		numero = keyboard.nextInt();

		if(numero>10) {
			System.out.println("El numero es mayor que diez");
		}else {
			System.out.println("EL nuemero es menor que diez");
		}
		
	}

}
