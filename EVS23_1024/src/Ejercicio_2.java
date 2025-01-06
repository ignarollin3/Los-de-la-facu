/*Se requiere un algoritmo para obtener la edad promedio de un grupo de 
N alumnos ingresados por teclado. Realice un porgrama en Java para representarlo,
 utilizando los tres tipos de estructuras de ciclo. 
 La carga de edades finaliza cuando se ingresa una edad igual a cero(0)
 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Ejercicio_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int edad, contador = 0, acumEdades = 0;
        float promedio;
        String textoEntrada;
 
        System.out.print("Ingrese la edad del alumno [0 -> salir]: ");
        textoEntrada = entrada.readLine();
        edad = Integer.parseInt(textoEntrada);
        
        while (edad != 0) {
             contador++; /// contador = contador + 1
             acumEdades += edad; // acumEdades = acumEdades+edad;
            System.out.print("Ingrese la edad del alumno [0 -> salir]: ");
            textoEntrada = entrada.readLine();
            edad = Integer.parseInt(textoEntrada);
        }
        if (contador != 0) {
            promedio = (float) acumEdades / contador;
        System.out.println("El promedio de edades de " + contador + " alumnnos es igual a: " + promedio);
        } else {
            System.out.println("No se han registrado edades.");
        }
     }
 }
 