import java.util.Scanner;

public class Ejercicio6
{
    public static void main( String[] args )
    {
        int numero;
        Scanner keyboard = new Scanner( System.in );

        System.out.printf( "Introduzca un número: " );
        numero = keyboard.nextInt();

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