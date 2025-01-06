

/*Crea un programa en Java que incluya una clase llamada Calculadora.
La clase debe tener métodos para realizar operaciones aritméticas simples:
  sumar, restar, multiplicar y dividir dos números. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculadora {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String dato;

        int num1, num2, num3, num4, suma, producto, resta;
        float division;

        System.out.print("Ingrese el primer número para operar: ");
        dato = entrada.readLine();
        num1 = Integer.parseInt(dato);

        System.out.print("Ingrese el segundo número para operar: ");
        num2 = Integer.parseInt(entrada.readLine());

        suma2Numeros(num1, num2);

        // resta = resta2Numeros(num1, num2);
        // System.out.println("La resta de: " + num1 + " - " + num2 + " es: " + resta);
        System.out.println("La resta de: " + num1 + " - " + num2 + " es: " + resta2Numeros(num1, num2));
        System.out.println("La multiplicación de: " + num1 + " * " + num2 + " es: " + multiplica2Numeros(num1, num2));

        division = dividir2Numeros(num1, num2);
        if (division == 0) {
            System.out.println("No se puede dividir");
        } else {
            System.out.println("La división de: " + num1 + " / " + num2 + " es: " + division);
        }

        division = dividir2Numeros(9,0);
        System.out.println(division);

    }

    /* Metodo que suma 2 numeros */
    public static void suma2Numeros(int n1, int n2) {
        int suma = 0;
        suma = n1 + n2;
        System.out.println("La suma de: " + n1 + " + " + n2 + " es: " + suma);

    }

    /* Metodo que resta 2 numeros */
    public static int resta2Numeros(int n1, int n2) {
        int resta = 0;
        resta = n1 - n2;
        return resta;

    }

    /* Metodo que multiplica 2 numeros */
    public static int multiplica2Numeros(int n1, int n2) {
        return n1 * n2;
    }

    public static float dividir2Numeros(int n1, int n2) {
        if (n2 != 0) {
            return (float) n1 / n2;
        } else {
            // System.out.println("No es posible realizar division por 0");
            return 0;
        }
    }

}
