package automovil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class automovil {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String patente;
        int distancia;
        double kmInicial = 0, kmfinal = 0, kmTotales = 0, cantGasol = 0;

        while (true) {
            System.out.println("Ingrese la patente del vehiculo ");
            patente = entrada.readLine();

            System.out.println("Ingrese el kilometraje inicial (Tipee '0' para salir): ");
            kmInicial = Double.parseDouble(entrada.readLine());
            if (kmInicial == 0) {
                break;
            }
            System.out.println("Ingrese el kilometraje final (Tipee '0' para salir): ");
            kmfinal = Double.parseDouble(entrada.readLine());
            if (kmfinal == 0) {
                break;
            }
            kmTotales = kmInicial - kmfinal;

            System.out.println("Ingrese la cantidad de gasolina consumida en litros: ");
            cantGasol = Double.parseDouble(entrada.readLine());

            System.out.println("Patente del vehiculo: " + patente);
            System.out.println("La distancia recorrida es " + kmTotales);
            System.out.println("El rendimiento de su vehiculo fue: " + rendimiento(kmTotales, cantGasol));
            double rendMenosdiez;
            rendMenosdiez = rendimiento(kmTotales, cantGasol);
            if (rendMenosdiez == 10) {
                System.out.println("Su veihuculo necesita mantenimiento!");
            }
        }
    }

    public static double rendimiento(double kmRend, double gasol) {
        double divis;
        divis = kmRend / gasol;
        return divis;
    }

}