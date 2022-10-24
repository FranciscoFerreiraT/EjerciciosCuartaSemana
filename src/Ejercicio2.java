import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		
		String palabra;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese palabra");
		palabra = keyboard.nextLine();

		if(palabra.contains("b")) {
			System.out.println("La palabra introducida contiene b minuscula");
		}else {
			System.out.println("La palabra introducida no contiene la b minuscula");
		}

	}

}



