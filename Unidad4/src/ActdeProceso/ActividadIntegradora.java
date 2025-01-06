package ActdeProceso;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


/* Escribir un programa que permita a los usuarios responder una encuesta de satisfacción en la que califiquen un servicio del 1 al 5. Usar un método para calcular la calificación promedio. Utilizar un ciclo do-while para permitir que múltiples usuarios ingresen sus calificaciones hasta que decidan no continuar.*/

public class ActividadIntegradora {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 

        int opcion,acumulador=0,contador=0,n=0 ;

        do {
            System.out.println("\n╔══════════════════════════════════════════════════════════════╗"); // 201 ╔ 205 ═ 187 ╗ 200 ╚ 188 ╝ 186 ║
            System.out.println("║   BIENVENIDO A NUESTRO SISTEMA DE CLASIFICACION DE SERVICIOS ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println("1. MUY MALO");
            System.out.println("2. REGULAR");
            System.out.println("3. BUENO");
            System.out.println("4. MUY BUENO");
            System.out.println("5. EXCELENTE");
            System.out.println("6. SALIR");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(entrada.readLine());

            switch (opcion) {
                case 1:
                    n=1;
                    acumulador+=n;
                    contador++;
                    break;
                    
                    case 2:
                    n=2;
                    acumulador+=n;
                    contador++;
                    break;
                    
                    case 3:
                    n=3;
                    acumulador+=n;
                    contador++;
                    break;
                    
                    case 4:
                    n=4;
                    acumulador+=n;
                    contador++;
                    break;
                    
                    case 5:
                    n=5;
                    acumulador+=n;
                    contador++;
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);
        System.out.println(contador+" "+acumulador);
        System.out.println("Su promedio es: "+promedio(acumulador, contador));
}

    public static double promedio(int acumulador,int contador){
        
        return (double) acumulador/contador;
    }
        
}
