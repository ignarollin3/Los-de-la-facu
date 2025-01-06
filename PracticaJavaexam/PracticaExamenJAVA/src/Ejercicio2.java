import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*Un vendedor ha realizado N ventas y desea saber cuántas fueron por  $10.000 o menos, cuántas fueron por más de 
$10.000 pero por menos de $20.000 y cuantas fueron mayores o iguales a $20.000. El ciclo finaliza cuando se ingresa 
una venta menor igual a $0. Escribir un programa en Java con Visual Studio Code para determinar utilizando el ciclo 
más apropiado cuánto fue el monto de las ventas de cada una y el monto global.*/

public  class Ejercicio2 {
    public static void main(String[] args) throws IOException {
    BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
    double montoTotal=0, monto;
    int contadorDiez=0;
    int contadorVeinte=0;
    int contador=0;
    int acumDiez = 0, acumVeinte = 0, acumulador = 0;
    
    // System.out.println("Ingrese el valor de la venta(Ingrese [0] para terminar ): ");
    // monto=Double.parseDouble(e.readLine());

    do{
    System.out.println("Ingrese el valor de la venta(Ingrese [0] para terminar ): ");
    monto=Integer.parseInt(e.readLine());
    
    
    if (monto<=10000 & monto>0) {
        contadorDiez++;
        acumDiez+=monto;
        
    }else if(monto>=20000){
        contadorVeinte++;
        acumVeinte+=monto;
    }else{
        contador++;
        acumulador+=monto;
    }
    montoTotal+=monto;

    }while(monto!=0);

    System.out.println("La cantidad de ventas menores a 10000 es: "+contadorDiez+ " y su monto total es: $"+acumDiez);
    System.out.println("La cantida de ventas entre 10000 y 20000 es: "+(contador-1)+" y su monto total es: $"+acumulador);
    System.out.println("La cantida de ventas mayores o iguales a 20000 es: "+contadorVeinte + " y su monto total es: $"+acumVeinte);
    System.out.println("Su monto total es: $"+montoTotal);

    }
}


