import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String eleccion;
		double base;
		double altura;
		double apotema;
		double area;
		double perimetro;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Seleccione entre triangulo, rectangulo , pentagono, hexagono");
		eleccion = keyboard.nextLine();

		if(eleccion.equals("triangulo")) {
			
			System.out.println("Introduce la base");
			base = keyboard.nextInt();
			System.out.println("Introduce la altura");
			altura=keyboard.nextInt();
			
			area = base * altura / 2;
			System.out.println("El area del triangulo es " + area);
			
		}else if(eleccion.equals("rectangulo")) {
			
			System.out.println("Introduce la base");
			base = keyboard.nextInt();
			System.out.println("Introduce la altura");
			altura=keyboard.nextInt();
			
			area = base * altura;
			System.out.println("El area del rectangulo es " + area);
			

		}else if(eleccion.equals("pentagono")) {
		
			System.out.println("Introduce el perimetro");
			perimetro = keyboard.nextInt();
			System.out.println("Introduce el apotema");
			apotema=keyboard.nextInt();
		
			area = perimetro * apotema / 2;
			System.out.println("El area del pentagono es " + area);
		

		}else if(eleccion.equals("hexagono")) {
	
			System.out.println("Introduce el perimetro");
			perimetro = keyboard.nextInt();
			System.out.println("Introduce el apotema");
			apotema=keyboard.nextInt();
	
			area = perimetro * apotema / 2;
			System.out.println("El area del hexagono es " + area);
	

}else {System.out.println("La figura no existe ");}

}
}

