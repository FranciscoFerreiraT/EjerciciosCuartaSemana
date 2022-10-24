import java.util.Scanner;

public class Ejercicio7
{
    public static void main( String[] args )
    {
        int numero;
        String palabra;
        Scanner keyboard = new Scanner( System.in );

        System.out.printf( "Introduzca una palabra: " );
        palabra = keyboard.nextLine();
numero = palabra.length();
        if ( numero % 2 == 0 )
        {
            System.out.println( "ES PAR" );
        }
        else
        {
            System.out.println( "ES IMPAR" );
        }
    }
}