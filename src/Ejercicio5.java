import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
	
		String Frase;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ingrese una frase");
		Frase = keyboard.nextLine();

		if((Frase.contains("b") && Frase.contains("v")) && Frase.contains("p")) {
			System.out.println("La frase contiene b y p ");
		}else  if((Frase.contains("b") && Frase.contains("v")) && Frase.contains("u")) {
			System.out.println("La frase contiene v y u");
		}

	}

}