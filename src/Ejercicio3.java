import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
	
		String producto;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("En nuestra tienda tenemos estos productos : Leche, Cacao, Avellanas, Azucar");
		
		System.out.println("Ingrese el producto seleccionado");
		producto = keyboard.nextLine();
		
		if(producto.equals("Leche")) {
			
			System.out.println("La leche vale 1,50€");
			
		}else if (producto.equals("Cacao")) {
			
			System.out.println("El cacao vale 2,50€");
			
		}else if (producto.equals("Avellanas")) {
			
			System.out.println("El avellanas vale 3€");
			
		}else if (producto.equals("Azucar")) {
			
			System.out.println("El azucar vale 4,50€");
			
		}
	}

}
