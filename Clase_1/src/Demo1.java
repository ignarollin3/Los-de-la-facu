import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String nombre, apellido;
        System.out.println("Ingrese el nombre de Usuario");
        nombre = entrada.readLine() ;

        apellido = "Peña";
        System.out.println("Bienvenido "+nombre+ " "+ apellido);
         
    }
}