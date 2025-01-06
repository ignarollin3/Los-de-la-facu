package ActdeProceso;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActdeProceso5 {
    public static void main(String[] args) throws Exception {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
    /*---------------------------------------------------------------------------------
        Escribir un programa que pida al usuario tres números y calcule su promedio.
    ------------------------------------------------------------------------------------*/
        
        int acum = 0, contador = 0; 
        float promedio;
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese su " + i + " numero: ");
            int n = Integer.parseInt(entrada.readLine());
            acum += n;
            contador ++;
        }
        
        promedio =(float) acum / contador;

        System.out.println("Su promedio es " + promedio);


       
        
    /*------------------------------------------------------------------------
        Escribir un programa en Java sume todos los números pares entre 1 y 100.
        Utilizar ciclo while() y for().
    ---------------------------------------------------------------------------*/
        
        int acumulador = 0, numPar = 0, numMientras = 0,acumuladorMientras = 0;
        
        for (int i = 1; i <= 100; i++) {
            numPar++;
            if (numPar % 2 == 0) {
                acumulador+=numPar;
                }
                
                }
        
        while (numMientras<100) {
            numMientras++;
            if (numMientras % 2 ==0) {
                acumuladorMientras+=numMientras;
            }
            }
            System.out.println("La suma total de todos los numeros pares con ciclo for es: " + acumulador);
            System.out.println("La suma total de todos los numeros pares con ciclo while es: " + acumuladorMientras);
            
            
    /*------------------------------------------------------------------------------------------------------------------------------
        Escribir un programa en Java que genere los primeros N términos de la serie Fibonacci utilizando un ciclo for() y do-while().
    --------------------------------------------------------------------------------------------------------------------------------*/

        
        System.out.println("Ingrese el numero que sera el final de la sucesión de fibonacci: ");
        int fiboN = Integer.parseInt(entrada.readLine());

        int fiboNum1=0, fiboNum2= 1, sumaFibo;

        for (int i = 2; i <= fiboN; i++ ){
            sumaFibo = fiboNum1+fiboNum2;
            fiboNum1=fiboNum2;
            fiboNum2=sumaFibo;
            System.out.println("Los terminos son: " + sumaFibo);
        }

        
        int dwNum1 = 0, dwNum2 = 1, sumaDW, contDW = 1;

        
        do {
            sumaDW = dwNum1+ dwNum2;
            dwNum1 = dwNum2;
            dwNum2 = sumaDW;
            contDW ++;
            
            System.out.println("Serie de Fibonacci con do while: "+sumaDW);
            }
         while (contDW < fiboN );
        
    }
}
