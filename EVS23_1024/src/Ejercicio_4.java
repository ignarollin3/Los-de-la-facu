
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int f=0;
        System.out.println("Ingrese su numero a factorizar: ");
        String n = entrada.readLine();
        int nfact = Integer.parseInt(n);

        for (int i=0; i<=nfact ; i++){
            /*f = 1;*/
            f*=i;
        }
            if (nfact==0) {
                System.out.println("Su numero es 1");
            }
            else{
                System.out.println("Su resultado es: "+ f);
            }
        
    }
    
}
