import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class app {
    public static void main(String[] args) throws IOException{
        BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));

        String patente;
        int distancia;
        double kmInicial, kmfinal, kmTotales, cantGasol;
        do{
        System.out.println("Ingrese la patente del vehiculo ");
        patente= entrada.readLine();

        System.out.println("Ingrese el kilometraje inicial (Ingrese 0 para salir): ");
        kmInicial=Integer.parseInt(entrada.readLine());

        System.out.println("Ingrese el kilometraje final (Ingrese 0 para salir): ");
        kmfinal=Integer.parseInt(entrada.readLine());
        kmTotales=kmInicial-kmfinal;



        System.out.println("Ingrese la cantidad de gasolina consumida en litros: ");
        cantGasol=Double.parseDouble(entrada.readLine());
        
        System.out.println("Patente del vehiculo: "+patente);
        System.out.println("La distancia recorrida es "+(kmInicial-kmfinal));
        System.out.println("El rendimiento de su vehiculo fue: "+rendimiento(kmTotales, cantGasol));
        double rendMenosdiez;
        rendMenosdiez=rendimiento(kmTotales, cantGasol);
        if(rendMenosdiez==10){
            System.out.println("Su veihuculo necesita mantenimiento!");
            break;
        }

        }while(true);

    }

    @Override
    public String toString() {
        return "automovil []";
    }
}
    public static double rendimiento (double kmRend, double gasol){
        double divis;
        divis = kmRend/gasol;
        return divis;
    }

