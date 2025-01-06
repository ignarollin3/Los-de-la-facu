package ActdeProceso;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActdeProceso_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        /*--------------------------------------------------------------------------------------------*/
        /*
         * Escribir un programa que determine si un número introducido por el usuario es
         * par o impar.
         */
        /*--------------------------------------------------------------------------------------------*/

        System.out.print("Ingrese un numero: ");
        int num1 = Integer.parseInt(bf.readLine());

        if (num1 % 2 == 0) {
            System.out.println("Su numero es par");
        } else {
            System.out.println("Su numero es impar \n \n");
        }

        

        /*---------------------------------------------------------------------------------- 
        Escribir un programa que determine el mayor de 3 enteros ingresados por el usuario. 
        ------------------------------------------------------------------------------------*/

        System.out.println("Ingrese el primer numero: ");
        int n1 = Integer.parseInt(bf.readLine());
        System.out.println("Ingrese el segundo numero: ");
        int n2 = Integer.parseInt(bf.readLine());
        System.out.println("Ingrese el tercer numero: ");
        int n3 = Integer.parseInt(bf.readLine());

        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor es este numero: " + n1);
        }
        if (n2 > n3 && n2 > n1) {
            System.out.println("El mayor es este numero: " + n2);
        } else {
            System.out.println("El mayor es este numero: " + n3);
        }

        System.out.println("\n\n");

        /*--------------------------------------------------------------------------------------------*/
        /* Escribir un programa en java que permita determinar el estado de un
        estudiante a través de su promedio obtenido en programación. Debe ingresarse
        por teclado la calificación y tener en cuenta la siguiente tabla: (Utilizar
        estructura switch)
         * 1,2,3: "Reprobado"
         * 4,5: "Regular"
         * 6,7: "Bien"
         * 8,9: "Muy Bien"
         * 10 "Sobresaliente". */
        /*--------------------------------------------------------------------------------------------*/
        
        
        System.out.println("Ingrese la calificacion: ");
        int calif = Integer.parseInt(bf.readLine());

        switch (calif) {

        case 1|2|3:
            System.out.println("Reprobado");
            break;
        case 4|5:
            System.out.println("Regular");
            break;
        case 6|7:
            System.out.println("Bien");
            break;
        case 8|9:
            System.out.println("Muy bien");
            break;
        case 10:
            System.out.println("Sobresaliente");
            break;
        }



        /*---------------------------------------------------------------------------------------------*/
        /*Escribir un programa que calcule el factorial de un número entero introducido por el usuario.*/
        /*---------------------------------------------------------------------------------------------*/
        
        System.out.println("Ingrese su numero a factorizar");
        int n = Integer.parseInt(bf.readLine());
        int fact = 1;

        for (int i=1;i<=n;i++) {
            fact*=i;
            
        }
        System.out.println("El factorial de su numero es: "+fact);

    }
}
