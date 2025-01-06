package AO2TDP_PENA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inversion {
    public static void main(String[] args) throws IOException{
        BufferedReader e= new BufferedReader(new InputStreamReader(System.in));
        int acumulador=0;
        double acumuladorTotal=0;
        for (int i=1;i<=12;i++){
        System.out.println("Ingrese la cantidad a depositar el "+i+" mes: ");
        int cantMensual = Integer.parseInt(e.readLine());
        acumulador+=cantMensual;
    }

        System.out.println("Ingrese cantidad de años a dejar depositado: ");
        int cantAnios = Integer.parseInt(e.readLine());

        for (int i = 1; i <= cantAnios; i++) {
            
            double invTotalxAnio;
            invTotalxAnio=interesAnnual(acumulador);
            acumuladorTotal+=invTotalxAnio;
            System.out.println("Su inversion total en el "+i+" año sera de $"+interesAnnual(acumulador));
        }
        System.out.println("Su inversion total sumada es "+ acumuladorTotal);

        
    }
    public static double interesAnnual(int acum){
        double interAnio, saldoFinal;
        interAnio=acum*0.1;
        saldoFinal=interAnio+acum;
        return saldoFinal;
    }

    
    
    }
}
