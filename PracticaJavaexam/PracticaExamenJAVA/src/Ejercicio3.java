import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Escribir un programa en Java con Visual Studio Code que permita leer dos números enteros pasados por teclado en 
un  proceso  repetitivo.  Este  proceso  debe  finalizar  cuando  uno  de  los  números  leídos  sean  cero  (0).  Determinar  e 
imprimir por pantalla el promedio de los números ingresados y el mayor de ellos.*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n1, n2, pregunta = 0;
        int promedio = 0;
        int mayor = 0;
        int suma = 0;
        int contador = 0;
        System.out.println(
                "Bienvenido a su calculo de promedio y el mayor entre dos numeros (Recuerde ingresar 0 para terminar):");

        do {
            System.out.println("Ingrese su Primer numero: ");
            n1 = Integer.parseInt(entrada.readLine());

            if (n1 == 0) {
                break;
            }
            System.out.println("Ingrese su Segundo numero: ");
            n2 = Integer.parseInt(entrada.readLine());

            if (n2 == 0) {
                break;
            }
            if (n1 != 0 || n2 != 0) {

                suma += n1 + n2;
                contador += 2;

                if (n1 > n2) {
                    if(n1>mayor){
                    mayor = n1;
                    }
                } else{
                    if(n2>mayor){
                    mayor = n2;
            }}
            
                
            }

        } while (n1 != 0 || n2 != 0);

        if (contador > 0) {
            System.out.println("Su numero mayor es: " + mayor);
            System.out.println("Su promedio es: " + suma / contador);
            System.out.println("Su promedio es: " + suma);
            System.out.println(contador);

        } else {
            System.out.println("No se ingresaron numeros validos");
        }
    }
}
