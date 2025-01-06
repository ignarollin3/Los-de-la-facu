

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroPrimos {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int nro;

        System.out.print("ingrese un numero: ");
        nro = Integer.parseInt(entrada.readLine());

        for (int i = 1; i < nro; i++) {
            if (esPrimo(i)) {
                System.out.println("El nro " + i + " es primo");
            } /*
               * / else {
               * System.out.println("El nro " + i + " no es primo");
               * }
               */
        }

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
