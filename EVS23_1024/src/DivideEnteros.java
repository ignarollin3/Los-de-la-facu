

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideEnteros {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numerador, denominador = 0;
        //double cociente;

        System.out.println("Ingrese el numerador: ");
        numerador = Integer.parseInt(entrada.readLine());

        do {
            System.out.println("Ingrese el denominador(debe ser distinto de cero): ");
            denominador = Integer.parseInt(entrada.readLine());
        } while (denominador != 0);

        System.out.println("La division entre " + numerador + " y " + denominador + " es " + dividir2Enteros(numerador, denominador));
    }

    public static double dividir2Enteros (int numerador, int denominador) {
        return (double) numerador / denominador;
    }
}
