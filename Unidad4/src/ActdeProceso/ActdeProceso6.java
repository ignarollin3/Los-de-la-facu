package ActdeProceso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ActdeProceso6 {
    public static void main(String[] args) throws Exception {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        /*---------------------------------------------------------------------------------------------------
        Escribir un programa en Java que permita ingresar N enteros por teclado. El
        ciclo finaliza cuando se ingresa un numero negativo. Al finalizar:

        . Mostrar la cantidad de los N enteros ingresados, la suma y el promedio de
        los mismos.
        . Mostrar el mayor de los enteros ingresados.
        . Mostar la cantidad de número pares ingresados.
        --------------------------------------------------------------------------------------------------*/
        int acumulador = 0, contador = 0;
        float promedio;
        int nMayor=0;

        System.out.print("Ingrese su numeros (Para terminar ingrese un numero negativo): ");
        int n = Integer.parseInt(entrada.readLine());

        while(n>=0){
        acumulador += n;
        contador ++;
        if (n > nMayor);{
        nMayor=n;
        }

        System.out.println("Ingrese su numeros (Para terminar ingrese un numero negativo): ");
        n = Integer.parseInt(entrada.readLine());
        }
        promedio=(float)acumulador/contador;
        System.out.println("La cantidad de numeros ingresados es "+contador+" La suma de estos numeros es: "+acumulador+" El mayor de esos numeros es "+nMayor+" y su promedio es: "+promedio);

        /*---------------------------------------------------------------------------------------------------
        Escribir un programa en Java que permita calcular la potencia de N números ingresados por teclado. Crear un método que permita calcular la potencia como producto de la base. Ej. para 2^4 hacer 2*2*2*2 mediante ciclo while().
        --------------------------------------------------------------------------------------------------*/

        int n1, n2;

        System.out.print("Ingrese su primer numero de base: ");
        n1 = Integer.parseInt(entrada.readLine());

        System.out.print("Ingrese su  numero potencia: ");
        n2 = Integer.parseInt(entrada.readLine());

        System.out.println("El resultado de su potencia es: " + potencia(n1, n2));

        /*---------------------------------------------------------------------------------------------------
        // Escribir un método en Java que permita determinar si un numero pasado por parámetro es primo. Desde el main() mostrar los números primos en un rango comprendido entre 2 y N.
        --------------------------------------------------------------------------------------------------*/
    
        System.out.print("ingrese un numero: ");
        int nro = Integer.parseInt(entrada.readLine());
    
        for(
    
        int i = 1;i<nro;i++)
        {
            if (esPrimo(i)) {
                System.out.println("El nro " + i + " es primo");
            } /*
               * / else {
               * System.out.println("El nro " + i + " no es primo");
               * }
               */
        }
    }

    public static int potencia(int n1, int n2) {

        while (n1 <= n2) {
            n1++;

        }
        return n1;
    }

    public static boolean esPrimo(int n) {
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
