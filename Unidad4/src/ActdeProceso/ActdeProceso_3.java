package ActdeProceso;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActdeProceso_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        /*---------------------------------------------------------------------------*/
        /*
         * Escribir un programa en Java que pida al usuario dos números enteros
         * y muestre la suma, la diferencia, el producto y el cociente de ambos números.
         */
        /*-------------------------------------------------------------------------- */

        int n1, n2;

        int suma, cociente, diferencia, producto;
        System.out.print("Ingrese su primer numero: ");
        n1 = Integer.parseInt(bf.readLine());
        System.out.print("Ingrese su segundo numero: ");
        n2 = Integer.parseInt(bf.readLine());
        suma = n1 + n2;
        diferencia = n1 - n2;
        cociente = n1 / n2;
        producto = n1 * n2;
        System.out.println(
                "\t \n La suma de sus numeros es: " + suma + "\n \t La diferencia de sus numeros es: " + diferencia +
                        "\n \t El cociente entre sus numeros es: " + cociente + "\n \t El producto de sus numeros es: "
                        + producto);

        System.out.println("\n");
        /*---------------------------------------------------------------------------*/
        /*
         * Escribir un programa en Java que pida al usuario el radio de un círculo y
         * calcule su área.
         */
        /*---------------------------------------------------------------------------*/

        String radio;
        int r;
        float area;
        double pi;
        System.out.print("Ingrese el radio del circulo: ");
        r = Integer.parseInt(bf.readLine());
        pi = 3.14;
        area = (float) pi * r + r;
        System.out.println("Su area es " + area);

        System.out.println("\n");
        /*-------------------------------------------------------------------------------*/
        /*
         * Escribir un programa en Java que convierta una temperatura de grados Celsius
         * ingresada por teclado a grados Fahrenheit.
         */
        /*-------------------------------------------------------------------------------*/
        String grados;
        int celsius, farenheit;
        System.out.println("Ingrese la cantidad de Grados Celsius (Seran convertidos a Farenheit):");
        grados = bf.readLine();
        celsius = Integer.parseInt(grados);
        farenheit = celsius * 9 / 5 + 32;
        System.out.println("La cantidad de Grados es " + farenheit + "°F");
    }

}