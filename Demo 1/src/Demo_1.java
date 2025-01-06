import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nombre, apellido;
        System.out.println("Ingrese su nombre");
        nombre = br.readLine();
        apellido = "Peña";
        System.out.print("hola como estamos");
    }
    


}
    