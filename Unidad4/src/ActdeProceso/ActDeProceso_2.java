package ActdeProceso;
/*Crear un programa en Java que permita ingresar por teclado apellido y nombre del usuario y su edad. Luego mostrarlo por pantalla en 2 líneas.  */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ActDeProceso_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Ingrese su nombre: ");
        String nombre = bf.readLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = bf.readLine();
        System.out.print("Ingrese su edad: ");
        String edad = bf.readLine();
        int e = Integer.parseInt(edad);

        System.out.println("Su apellido y nombre son: "+nombre+" "+apellido);
        System.out.println("Su edad es: "+edad);

    }
}
