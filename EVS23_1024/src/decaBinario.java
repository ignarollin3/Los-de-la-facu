

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decaBinario {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        // Input -> nDecimal
        // Output -> cBinario
        /* Escribe un programa que convierta un número decimal a binario utilizando un ciclo while(), pero imprime el resultado en
         bloques de 4 bits separados por espacios. Por ejemplo, el número 45 sería convertido a 0010 1101 */
        /*
         * Proceso -> pedir a usuario que ingrese un numero decimal, realizar una
         * division continua mediante ciclo while, donde
         * se valida que el cociente sea mayor o igual a 2, se incrementa la variable
         * nCont, se define la variable nResto como el
         * resultado del cociente % 2, la variable cociente igual a cociente / 2,
         * cBinario como la suma entre nResto y cBinario,
         * en el mismo se utiliza el if que sirve para separar en bloques los numeros.
         * Finalmente, para cBinario igual a la suma
         * entre cociente y cBinario se aplica el ciclo for para leer los numeros en
         * inversa.
         */

        int nDecimal, cociente;
        System.out.print(" Ingrese el numero en base decimal: ");
        nDecimal = Integer.parseInt(entrada.readLine());
        cociente = nDecimal;

        System.out.println(" El numero " + nDecimal + " en binario es igual a:" + calcularBinario(nDecimal));
    }

    // METODO PARA CONVERTIR NUMERO DECIMAL A BINARIO//
    public static String calcularBinario(int nDecimal) {
        int nResto = 0, cociente = nDecimal, nCont = 0;
        String cBinario = "";
        while (cociente >= 2) {
            nCont++;
            nResto = cociente % 2;
            cociente = cociente / 2;
            cBinario = nResto + cBinario;
            if (nCont == 4) {
                cBinario = " " + cBinario;
                nCont = 0;
            }
        }
        cBinario = cociente + cBinario;
        for (int i = 1; i < 4 - nCont; i++)
            cBinario = "0" + cBinario;
        return cBinario;
    }
}
