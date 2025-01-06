/*Se requiere un algoritmo para obtener la edad promedio de un grupo de 
N alumnos ingresados por teclado. Realice un porgrama en Java para representarlo,
utilizando los tres tipos de estructuras de ciclo. 
La carga de edades finaliza cuando se ingresa una edad igual a cero(0)

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int edad, contador = 0, acumEdades = 0, nAlumnos;
        float promedio;
        String textoEntrada;

        System.out.print("Ingrese la cantidad de alumnos: ");
        textoEntrada = entrada.readLine();
        nAlumnos = Integer.parseInt(textoEntrada);

        for (int i = 1; nAlumnos != 0; i++) {
            System.out.print("Ingrese la edad del alumno [0 -> salir]: ");
            edad = Integer.parseInt(entrada.readLine());
            acumEdades += edad; // acumEdades = acumEdades+edad;
        }
        if (acumEdades != 0) {
            promedio = (float) acumEdades / nAlumnos;
            System.out.println("El promedio de edades de " + contador + " alumnnos es igual a: " + promedio);
        } else {
            System.out.println("No se han registrado edades.");
        }
    }
}
